package haifa.jb.myapplication;


import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewHeader;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewHeader = (TextView)findViewById(R.id.textViewHeader);
    }

    public void buttonSetColor_onClick(View view) {
        String currentColor= (String) ((Button)view).getText();

        // Get color from color resources:
        Resources resources = getResources();
        int color=0;
        switch(currentColor){
            case "red": color=resources.getColor(R.color.text_red_color, getTheme()); break;
            case "green": color=resources.getColor(R.color.text_green_color, getTheme()); break;
            case "blue": color=resources.getColor(R.color.text_blue_color, getTheme()); break;
            case "yellow": color=resources.getColor(R.color.text_yellow_color, getTheme()); break;
        }
        textViewHeader.setText("Current color: "+currentColor);
        textViewHeader.setTextColor(color);
    }
}