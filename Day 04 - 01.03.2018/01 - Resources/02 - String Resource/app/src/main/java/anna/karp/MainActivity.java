package anna.karp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewValue;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewValue = (TextView)findViewById(R.id.textViewValue);
    }

    public void show_onClick(View view) {

        // Setting the string resource id will present the string:
        //textViewValue.setText(R.string.welcome);

        // Getting the string itself and performing something with it:
        String value = "Value: " + getString(R.string.welcome);
        textViewValue.setText(value);
    }
}
