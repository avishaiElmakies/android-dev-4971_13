package anna.karp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

// ListView will create the xml layout from scratch for any presented item.
// RecyclerView will create the xml layout only for the initial presented items, and when new
// items need to be shown - will only present their data in the same presented xml layouts.
// Need to add a reference to the RecyclerView:
// Project Structure (Ctrl+Alt+Shift+S) -> Dependencies -> + -> Library Dependency ->
// recyclerview-v7 (com.android.support:recyclerview-v7:23.1.1) -> OK -> OK

public class MainActivity extends AppCompatActivity implements DiamondHolder.OnDiamondClickListener {

    private LinearLayout linearLayoutMain;
    private ImageView imageViewSelectedDiamond;
    private RecyclerView recyclerViewDiamonds;
    private ArrayList<Diamond> diamonds = new ArrayList<>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayoutMain = (LinearLayout)findViewById(R.id.linearLayoutMain);
        imageViewSelectedDiamond = (ImageView)findViewById(R.id.imageViewSelectedDiamond);

        // Take RecyclerView component:
        recyclerViewDiamonds = (RecyclerView)findViewById(R.id.recyclerViewDiamonds);

        // Set the RecyclerView's layout type (list / grid):
        recyclerViewDiamonds.setLayoutManager(new LinearLayoutManager(this));
        //recyclerViewDiamonds.setLayoutManager(new GridLayoutManager(this, 2)); // 2 = Number of columns

        // Create collection:
        for (int i = 0; i < 100; i++) {
            diamonds.add(new Diamond()); // Random diamond values.
        }

        // Create the adapter for displaying the data in the list.
        // Each data will be presented by the custom item layout we've created:
        DiamondsAdapter diamondsAdapter = new DiamondsAdapter(this, diamonds);
        diamondsAdapter.setOnDiamondClickListener(this);

        recyclerViewDiamonds.setAdapter(diamondsAdapter);
    }

    public void onColorClick(String color) {
        linearLayoutMain.setBackgroundColor(Diamond.getColorValue(color));
    }

    public void onCaratClick(float carat) {
        Toast.makeText(this, carat + " Ct.", Toast.LENGTH_LONG).show();
    }

    public void onImageClick(int imageId) {
        imageViewSelectedDiamond.setImageResource(imageId);
    }

    public void onBackgroundClick(Diamond diamond) {
        Toast.makeText(this, diamond.toString(), Toast.LENGTH_LONG).show();
    }
}