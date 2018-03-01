package anna.karp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonShape;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonShape = (Button)findViewById(R.id.buttonShape);
    }

    public void buttonSetShape(View view) {
        buttonShape.setBackgroundResource(R.drawable.shape_ripple_effect);
    }
}
