package anna.karp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

// For adding an image, copy it and paste it on the drawable folder.
// As for any resource - the name must be lowercase / underscore / digits.
// Note: large weight images will cause the app to crash.
// Putting them in raw folder instead of the drawable folder, my solve the crash.
// On newer versions of the IDE (2.3 and above) there is a warning if using the image from the drawable,
// And stating that the image should be placed in the raw folder instead.
public class MainActivity extends AppCompatActivity {

    private TextView textViewData;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewData = (TextView)findViewById(R.id.textViewData);
    }

    public void imageClicked(View view) {
        textViewData.setText("You Clicked Me");
    }
}
