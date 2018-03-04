package anna.karp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

// Debugging Shortcuts:
// Ctrl + F8    Insert Breakpoint / Remove Breakpoint
// Shift + F9   Start Debugging (Or click on the bug icon near to the start icon).
// F8           Step Over
// F7           Step Into
// F9           Continue Debugging
// Ctrl + F2    Stop Debugging

public class MainActivity extends AppCompatActivity {

    private TextView textViewEvenNumbers;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewEvenNumbers = (TextView)findViewById(R.id.textViewEvenNumbers);
        Log.i("MainActivity", "I'm in the MainActivity.onCreate");
    }

    public void showEvenNumbers_onClick(View view) {

        Log.d("MainActivity", "Starting showEvenNumbers_onClick");

        try {
            for (int i = 1; i <= 20; i++) {
                if (i % 2 == 0) {
                    textViewEvenNumbers.append(i + " ");
                    Log.d("MainActivity", "i = " + i);
                }
            }
        }
        catch(Exception ex) {
            Log.e("MainActivity", "Message: " + ex.getMessage());
        }
    }
}
