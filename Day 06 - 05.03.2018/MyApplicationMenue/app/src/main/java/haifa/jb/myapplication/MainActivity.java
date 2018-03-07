package haifa.jb.myapplication;


import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

// Note: you can write an onClick event handler in the menu item - in the xml,
// with the event handler implemented here in the MainActivity, but this will cause
// the onOptionsItemSelected not to be called and the event handler to be executed instead.
public class MainActivity extends AppCompatActivity {

    private LinearLayout linearLayoutMain;
private TextView tx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        tx=(TextView)findViewById(R.id.foodCook);
        linearLayoutMain = (LinearLayout)findViewById(R.id.linearLayoutMain);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);

        // Need to find menu items only here because they belong to the menu and not to the main layout.

        return true;
    }

    // Return true to state that the menu event has been handled.
    // Return false to state that the menu event has not been handled.
    public boolean onOptionsItemSelected(MenuItem item) {

        int itemId = item.getItemId();
        Food food;

        switch (itemId) {
            case R.id.menuItemPizza:
               food=new Pizza();
                break;
            case R.id.menuItemChips:
                food=new Chips();
                break;
            case R.id.menuItemPersonalPizza:
                food=new PersonalPizza();
                break;

            default:return false;

        }
       setContentView(food.foodInfo(this));
    return true;

    }
}