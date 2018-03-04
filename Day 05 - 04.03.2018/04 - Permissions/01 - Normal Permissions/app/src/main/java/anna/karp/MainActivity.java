package anna.karp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

// Normal Permissions are a low risk and low security permissions which needs to be requested only on the Manifest.
// This is regardless of Android version.
// Requesting them on the Manifest will be sufficient on any version of android.
// The <uses-permission android:name="..." /> is for any API level.
// The <uses-permission-sdk-23 android:name="..." /> is only for API level 23 (Marshmallow) and above.
// The reason for the sdk-23 is to prevent for showing the user permissions to confirm if they are only
// needed for the Runtime Permission Model (Marshmallow or above) and not for the lowers API levels.
public class MainActivity extends AppCompatActivity {

    private TextView textViewMessage;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewMessage = (TextView)findViewById(R.id.textViewMessage);
    }

    public void buttonWallpaper_onClick(View view) {

        try {
            WallpaperChanger.changeWallpaper();
            textViewMessage.setText("Wallpaper has been succesfully changed.");
        }
        catch (Exception ex) {
            textViewMessage.setText(ex.getMessage());
        }
    }
}