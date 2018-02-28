package anna.karp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ContentFrameLayout;
import android.view.View;
import android.widget.LinearLayout;

// The first screen's layout is a ContentFrameLayout with the id of: android.R.id.content.
// Inside of it there is only one child which is the xml root layout (LinearLayout in this example).

public class MainActivity extends AppCompatActivity {

    private LinearLayout linearLayoutMain; // The xml root layout.
    private ContentFrameLayout contentFrameLayoutMain; // The screen's first layout.

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Take Layout:
        linearLayoutMain = (LinearLayout)findViewById(R.id.linearLayoutMain);

        // Take layout's Parent:
        contentFrameLayoutMain = (ContentFrameLayout)findViewById(android.R.id.content);
    }

    // Change layout background:
    public void buttonChangeLayoutBackground_onClick(View view) {
        linearLayoutMain.setBackgroundColor(Color.GREEN);
    }

    // Change Layout's Parent background:
    public void buttonChangeLayoutParentBackground_onClick(View view) {
        contentFrameLayoutMain.setBackgroundColor(Color.BLUE);
    }
}