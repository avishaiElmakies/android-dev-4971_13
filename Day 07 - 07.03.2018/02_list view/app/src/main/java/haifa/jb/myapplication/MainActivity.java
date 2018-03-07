package haifa.jb.myapplication;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    ListAdapter MyAdapter;
    ListView MyListView;
    int prevNum=-1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //crete string array
        final String[] foods = {"waterMelon", "orange", "cherry", "apple", "tomato", "peach","waterMelon", "orange", "cherry", "apple", "tomato", "peach","waterMelon", "orange", "cherry", "apple", "tomato", "peach"};

        //the parameter "android.R.layout.simple_list_item_1" is setting the list format design
         MyAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, foods);

        //getting the ListView component from the layout
         MyListView = (ListView) findViewById(R.id.MyListView);

        //adding the ListAdapter that we created to the ListView
        MyListView.setAdapter(MyAdapter);

        //adding event listener to the ListView
        MyListView.setOnItemClickListener(
                //On item click we will show to the screen a popup with the item's content
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        if(prevNum!=-1){
                            foods[prevNum]=foods[prevNum].replace(" clicked!!!","");
                        }
                        foods[i]+=" clicked!!!";
                        MyListView.setAdapter(MyAdapter);
                        String food = String.valueOf(adapterView.getItemAtPosition(i)) + "at position "+i+" at RowPosition "+l;
                        Toast.makeText(MainActivity.this, food, Toast.LENGTH_LONG).show();
                        prevNum=i;
                    }

                }
        );
    }

}


