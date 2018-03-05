package anna.karp;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout relativeLayoutMain;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayoutMain = (RelativeLayout)findViewById(R.id.relativeLayoutMain);

        // Register for the Context Menu on the Button (on long click):
        registerForContextMenu(findViewById(R.id.buttonSend));
        registerForContextMenu(findViewById(R.id.buttonColors));
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();

        if(v.getId() == R.id.buttonSend) {
            inflater.inflate(R.menu.menu_send, menu);
            menu.setHeaderTitle("Send:");
            menu.setHeaderIcon(R.drawable.send);
        }
        else {
            inflater.inflate(R.menu.menu_colors, menu);
            menu.setHeaderTitle("Select Color:");
            menu.setHeaderIcon(R.drawable.colors);

            int color = Color.TRANSPARENT;
            Drawable background = relativeLayoutMain.getBackground();
            if (background instanceof ColorDrawable)
                color = ((ColorDrawable) background).getColor();

            if (color == Color.RED) {
                menu.findItem(R.id.menuItemRed).setChecked(true);
            } else if (color == Color.GREEN) {
                menu.findItem(R.id.menuItemGreen).setChecked(true);
            } else if (color == Color.BLUE) {
                menu.findItem(R.id.menuItemBlue).setChecked(true);
            }
        }
    }

    // Return true to state that the menu event has been handled.
    // Return false to state that the menu event has not been handled.
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menuItemRed:
                relativeLayoutMain.setBackgroundColor(Color.RED);
                return true;
            case R.id.menuItemGreen:
                relativeLayoutMain.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.menuItemBlue:
                relativeLayoutMain.setBackgroundColor(Color.BLUE);
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