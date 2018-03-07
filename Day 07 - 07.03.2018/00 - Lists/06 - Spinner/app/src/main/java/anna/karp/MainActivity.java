package anna.karp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerAnimals1; // The strings are in the strings.xml file.
    private Spinner spinnerAnimals2; // The strings are in an ArrayAdapter<String>.
    private Spinner spinnerAnimals3; // The strings are in a CustomAdapter.
    private ImageView imageViewAnimal;
    private ArrayList<String> animals = Repository.getAnimals();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get component IDs:
        spinnerAnimals1 = (Spinner) findViewById(R.id.spinnerAnimals1);
        spinnerAnimals2 = (Spinner) findViewById(R.id.spinnerAnimals2);
        spinnerAnimals3 = (Spinner) findViewById(R.id.spinnerAnimals3);
        imageViewAnimal = (ImageView) findViewById(R.id.imageViewAnimal);

        // Set adapters:
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, animals);
        spinnerAnimals2.setAdapter(adapter);
        AnimalsAdapter customAdapter=new AnimalsAdapter(this, animals);
        spinnerAnimals3.setAdapter(customAdapter);

        // Handle selected events:
        spinnerAnimals1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (view == null) return; // On orientation change this event is fired and view is null:
                String imageName = ((AppCompatTextView) view).getText().toString().toLowerCase();
                int imageID = getResources().getIdentifier(imageName, "drawable", getPackageName());
                imageViewAnimal.setImageResource(imageID);
            }
            public void onNothingSelected(AdapterView<?> parent) { } // Event fired when nothing selected in the list or adapter is empty (both not happening in this example).
        });


        spinnerAnimals2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (view == null) return;
                String imageName = animals.get(position).toLowerCase();
                int imageID = getResources().getIdentifier(imageName, "drawable", getPackageName());
                imageViewAnimal.setImageResource(imageID);
            }
            public void onNothingSelected(AdapterView<?> parent) { }
        });

        spinnerAnimals3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (view == null) return;
                String imageName = animals.get(position).toLowerCase();
                int imageID = getResources().getIdentifier(imageName, "drawable", getPackageName());
                imageViewAnimal.setImageResource(imageID);
            }
            public void onNothingSelected(AdapterView<?> parent) { }
        });
    }
}