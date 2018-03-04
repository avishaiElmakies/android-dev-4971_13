package anna.karp;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    private RelativeLayout relativeLayoutMain;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relativeLayoutMain = (RelativeLayout) findViewById(R.id.relativeLayoutMain);
    }

    public void buttonSend(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.menu_send);
        popupMenu.show();
    }

    public void buttonColors(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.menu_colors);
        Menu menu = popupMenu.getMenu();

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

        popupMenu.show();
    }

    // Return true to state that the menu event has been handled.
    // Return false to state that the menu event has not been handled.
    public boolean onMenuItemClick(MenuItem item) {
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
