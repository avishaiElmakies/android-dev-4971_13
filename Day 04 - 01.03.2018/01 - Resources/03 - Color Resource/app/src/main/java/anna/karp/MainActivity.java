package anna.karp;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewHeader;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewHeader = (TextView)findViewById(R.id.textViewHeader);
    }

    public void buttonSetColor_onClick(View view) {

        // Get color from color resources:
        Resources resources = getResources();
        int color = resources.getColor(R.color.header_back_color, getTheme());
        textViewHeader.setBackgroundColor(color);
    }
}
