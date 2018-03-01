package anna.karp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

// For adding resource directory:
// Right-click res folder -> New -> Android resource directory,
// select resource type, available qualifiers, chosen qualifier values.

// For adding resource file:
// Right-click res folder -> New -> Android resource file,
// select file name, resource type, directory name, available qualifiers, chosen qualifier values.
// or, if the resource folder exists and shown:
// Right-click the desired resource folder -> New -> [folder name] resource file
// select file name, available qualifiers, chosen qualifier values.
public class MainActivity extends AppCompatActivity {

    private TextView textViewDimensions;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewDimensions = (TextView)findViewById(R.id.textViewDimensions);

        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();

        int widthDP = (int)(displayMetrics.widthPixels / displayMetrics.density);
        int heightDP = (int)(displayMetrics.heightPixels / displayMetrics.density);

        String dimensions = "Width: " + widthDP + "dp\nHeight: " + heightDP + "dp";

        textViewDimensions.setText(dimensions);
    }
}
