package anna.karp;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewInfo;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewInfo = (TextView)findViewById(R.id.textViewInfo);
    }

    public void showDimensions_onClick(View view) {

        // Get dimensions in px:
        Resources resources = getResources();
        float buttonWidthInPx = resources.getDimension(R.dimen.button_width);

        // Get dimensions in dp:
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        float buttonWidthInDp = buttonWidthInPx / displayMetrics.density;
        textViewInfo.setText("Button Width in px: " + buttonWidthInPx +
                "\nButton Width in dp: " + buttonWidthInDp);
    }

}
