package anna.karp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ContentFrameLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

// The ViewGroup is the base class for all containers.
// All layouts derived directly or indirectly from the ViewGroup.

public class MainActivity extends AppCompatActivity {

    private ContentFrameLayout contentFrameLayoutMain;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contentFrameLayoutMain = (ContentFrameLayout)findViewById(android.R.id.content);
    }

    public void buttonClearAll_onClick(View view) {
        uncheckAllCheckBoxes(contentFrameLayoutMain);
    }

    public void uncheckAllCheckBoxes(ViewGroup parent) {

        for (int i = 0; i < parent.getChildCount(); i++) {

            View child = parent.getChildAt(i);

            if(child instanceof CheckBox) {
                ((CheckBox)child).setChecked(false);
            }
            else if(child instanceof ViewGroup) {
                uncheckAllCheckBoxes((ViewGroup)child);
            }
        }
    }
}