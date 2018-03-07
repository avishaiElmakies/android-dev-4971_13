package anna.karp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listViewAnimals;
    private ArrayList<Animal> animals = Repository.getAnimals();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewAnimals = (ListView)findViewById(R.id.listViewAnimals);

        AnimalsAdapter animalsAdapter = new AnimalsAdapter(this, animals);
        listViewAnimals.setAdapter(animalsAdapter);

        listViewAnimals.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, animals.get(position).toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}