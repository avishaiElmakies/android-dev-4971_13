package anna.karp;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends ListActivity {

    private ArrayList<Animal> animals = Repository.getAnimals();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnimalsAdapter animalsAdapter = new AnimalsAdapter(this, animals);
        setListAdapter(animalsAdapter);
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        Toast.makeText(this, animals.get(position).toString(), Toast.LENGTH_LONG).show();
    }
}