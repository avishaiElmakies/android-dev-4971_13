package anna.karp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;

// Note: you can write an onClick event handler in the menu item - in the xml, 
// with the event handler implemented here in the MainActivity, but this will cause 
// the onOptionsItemSelected not to be called and the event handler to be executed instead.
public class MainActivity extends AppCompatActivity {

    private LinearLayout linearLayoutMain;
    private MenuItem menuItemRed;
    private MenuItem menuItemGreen;
    private MenuItem menuItemBlue;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayoutMain = (LinearLayout)findViewById(R.id.linearLayoutMain);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);

        // Need to find menu items only here because they belong to the menu and not to the main layout.
        // Also, they are not created yet on the onCreate event:
        menuItemRed = menu.findItem(R.id.menuItemRed);
        menuItemGreen = menu.findItem(R.id.menuItemGreen);
        menuItemBlue = menu.findItem(R.id.menuItemBlue);

        return true;
    }

    // Return true to state that the menu event has been handled.
    // Return false to state that the menu event has not been handled.
    public boolean onOptionsItemSelected(MenuItem item) {

        int itemId = item.getItemId();

        if(itemId == R.id.menuItemRed || itemId == R.id.menuItemGreen || itemId == R.id.menuItemBlue) {
            menuItemRed.setChecked(false);
            menuItemGreen.setChecked(false);
            menuItemBlue.setChecked(false);
            item.setChecked(true);
        }

        switch (itemId) {
            case R.id.menuItemSearch:
                Toast.makeText(this, "Search", Toast.LENGTH_LONG).show();
                return true;
            case R.id.menuItemFavorites:
                Toast.makeText(this, "Favorites", Toast.LENGTH_LONG).show();
                return true;
            case R.id.menuItemSettings:
                Toast.makeText(this, "Settings", Toast.LENGTH_LONG).show();
                return true;
            case R.id.menuItemRed:
                linearLayoutMain.setBackgroundColor(Color.RED);
                return true;
            case R.id.menuItemGreen:
                linearLayoutMain.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.menuItemBlue:
                linearLayoutMain.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.menuItemEmail:
                Toast.makeText(this, "Email", Toast.LENGTH_LONG).show();
                return true;
            case R.id.menuItemSms:
                Toast.makeText(this, "SMS", Toast.LENGTH_LONG).show();
                return true;
            case R.id.menuItemWhatsApp:
                Toast.makeText(this, "WhatsApp", Toast.LENGTH_LONG).show();
                return true;
        }

        return false;
    }
}