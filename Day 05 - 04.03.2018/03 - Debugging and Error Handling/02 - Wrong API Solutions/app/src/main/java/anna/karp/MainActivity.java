package anna.karp;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

// Wrong API Solutions:
// 1. Change minSdkVersion to 23 in build.gradle (Module: app)
//    But this is like defining the minimum SDK at project creation and will prevent app installation on lower API devices.
// 2. Disable Inspections
//    But this will hide the error until next time we'll work on this project and won't solve a thing.
// 3. @SuppressLint("NewApi")
//    This will hide the error and is suitable if we'll prevent from lower API users for calling the function / seeing the button etc.
//    But it will hide any such errors.
// 4. @TargetApi(Build.VERSION_CODES.M) or @TargetApi(23)
//    This will hide the error and is suitable if we'll prevent from lower API users for calling the function / seeing the button etc.
//    This is better than @SuppressLint("NewApi") because if later on we'll use a 24 SDK command inside our function
//    it will cause the error to be shown again, while @SuppressLint("NewApi") won't.
// 5. Surround with if... as shown below.
//    This is the preferred way because it can give fallback solution via the 'else' to a lower API level.
public class MainActivity extends AppCompatActivity {

    private LinearLayout linearLayoutMain;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayoutMain = (LinearLayout)findViewById(R.id.linearLayoutMain);
        TextView textViewApiLevel = (TextView) findViewById(R.id.textViewApiLevel);
        textViewApiLevel.setText("API Level: " + Build.VERSION.SDK_INT);
    }

    //@SuppressLint("NewApi") // Option 3 above
    //@TargetApi(Build.VERSION_CODES.M) // Option 4 above
    //@TargetApi(23) // Same as option 4 above
    public void setBackgroundColor(View view) {

        Resources resources = getResources();
        int color;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) { // Option 5 above - the preferred way.
            color = resources.getColor(R.color.backgroundColor, getTheme());
        }
        else {
            color = resources.getColor(R.color.backgroundColor); // The deprecated version for a fallback.
        }
        linearLayoutMain.setBackgroundColor(color);
    }
}
