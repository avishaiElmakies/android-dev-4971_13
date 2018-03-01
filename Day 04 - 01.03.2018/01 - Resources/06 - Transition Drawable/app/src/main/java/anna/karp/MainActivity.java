package anna.karp;

import android.graphics.drawable.TransitionDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

// Transition can be switch only via code.
public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toggleButton_onClick(View view) {

        // Get transition drawable:
        TransitionDrawable transitionDrawable = (TransitionDrawable)view.getBackground();

        // Switch it as a result of the tag value:
        if(Boolean.parseBoolean(view.getTag().toString())) {
            transitionDrawable.startTransition(1000);
            view.setTag(false);
        }
        else {
            transitionDrawable.reverseTransition(1000);
            view.setTag(true);
        }
    }
}