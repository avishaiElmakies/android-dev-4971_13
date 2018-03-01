package anna.karp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private RadioButton radioButtonNeapolitan;
    private RadioButton radioButtonSicilian;
    private RadioButton radioButtonBalkan;
    private RadioButton radioButtonGourmet;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioButtonNeapolitan = (RadioButton)findViewById(R.id.radioButtonNeapolitan);
        radioButtonSicilian = (RadioButton)findViewById(R.id.radioButtonSicilian);
        radioButtonBalkan = (RadioButton)findViewById(R.id.radioButtonBalkan);
        radioButtonGourmet = (RadioButton)findViewById(R.id.radioButtonGourmet);
    }

    public void radioButtonPizzaName_onClick(View view) {

        radioButtonNeapolitan.setChecked(false);
        radioButtonSicilian.setChecked(false);
        radioButtonBalkan.setChecked(false);
        radioButtonGourmet.setChecked(false);

        ((RadioButton)view).setChecked(true);
    }
}