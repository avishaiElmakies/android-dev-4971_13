package anna.karp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatCheckedTextView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

// Note: the ListView children will be only the ones shown on the screen,
// thus we can't run on them for unchecking them all,
// because the ones which doesn't currently shown won't be unchecked.
public class MainActivity extends AppCompatActivity {

    private ArrayList<String> animals = Repository.getAnimals();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listViewAnimals = (ListView)findViewById(R.id.listViewAnimals);

        // Simple list:
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, animals);
        listViewAnimals.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, animals.get(position), Toast.LENGTH_LONG).show();
            }
        });

//        // RadioButton list:
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_single_choice, animals);
//        listViewAnimals.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            AppCompatCheckedTextView selectedItem;
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, animals.get(position), Toast.LENGTH_LONG).show();
//                if(selectedItem != null) {
//                    selectedItem.setChecked(false);
//                }
//                ((AppCompatCheckedTextView)view).setChecked(true);
//                selectedItem = (AppCompatCheckedTextView)view;
//            }
//        });

//        // CheckBox list:
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_multiple_choice, animals);
//        listViewAnimals.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                ((AppCompatCheckedTextView)view).setChecked(!((AppCompatCheckedTextView)view).isChecked());
//            }
//        });

//        // V list:
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_checked, animals);
//        listViewAnimals.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                ((AppCompatCheckedTextView)view).setChecked(!((AppCompatCheckedTextView)view).isChecked());
//            }
//        });

        listViewAnimals.setAdapter(arrayAdapter);
    }
}