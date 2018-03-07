package anna.karp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ImageView imageViewSelectedAnimal;
    private GridView gridViewAnimals;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridViewAnimals = (GridView) findViewById(R.id.gridViewAnimals);
        imageViewSelectedAnimal = (ImageView)findViewById(R.id.imageViewSelectedAnimal);

        gridViewAnimals.setAdapter(new ImageAdapter(this));

        gridViewAnimals.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        imageViewSelectedAnimal.setImageDrawable(((ImageView)view).getDrawable());
    }
}