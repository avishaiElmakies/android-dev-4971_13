package anna.karp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnKeyListener, PopupMenu.OnMenuItemClickListener {

    private EditText editTextAnimal;
    private ImageView imageViewAnimal;
    private ArrayList<String> recentAnimals = new ArrayList<>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextAnimal = (EditText)findViewById(R.id.editTextAnimal);
        imageViewAnimal = (ImageView)findViewById(R.id.imageViewAnimal);

        registerForContextMenu(findViewById(R.id.relativeLayoutMain));

        editTextAnimal.setOnKeyListener(this);
    }

    // ---------- Options Menu: ----------
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.clear(); // Must clear previous menu here cause it is the same one as before.
        createMenu(menu);
        return super.onPrepareOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        updateImage(item.getTitle().toString());
        return super.onOptionsItemSelected(item);
    }

    // ---------- Context Menu: ----------
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        createMenu(menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    public boolean onContextItemSelected(MenuItem item) {
        updateImage(item.getTitle().toString());
        return super.onContextItemSelected(item);
    }

    // ---------- Popup Menu: ----------
    public void buttonRecent(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.setOnMenuItemClickListener(this);
        Menu menu = popupMenu.getMenu();
        createMenu(menu);
        popupMenu.show();
    }

    public boolean onMenuItemClick(MenuItem item) {
        updateImage(item.getTitle().toString());
        return false;
    }

    // ---------- Key pressed: ----------
    public boolean onKey(View v, int keyCode, KeyEvent event) {

        if(event.getAction() != KeyEvent.ACTION_UP) {
            return false;
        }

        if(updateImage(editTextAnimal.getText().toString())) {
            recentAnimals.add(editTextAnimal.getText().toString());
            if (recentAnimals.size() > 3) {
                recentAnimals.remove(0);
            }
        }

        return false;
    }

    // ---------- Helpers: ----------
    private boolean updateImage(String animal) {
        int imageID = getResources().getIdentifier(animal.toLowerCase(), "drawable", getPackageName());
        if(imageID != 0) {
            imageViewAnimal.setImageResource(imageID);
            return true;
        }
        return false;
    }

    private void createMenu(Menu menu) {
        menu.add("Recent Animals: ");
        for (int i = 0; i < recentAnimals.size(); i++) {
            menu.add(recentAnimals.get(i));
        }
    }
}