package anna.karp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast1_onClick(View view) {
        Toast toast = Toast.makeText(this, "Download Complete", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0); // Gravity, x-offset, y-offset
        toast.show();
    }

    public void showToast2_onClick(View view) {
        CustomToast1.showMessage(this, "Download Complete");
    }

    public void showToast3_onClick(View view) {
        CustomToast2.successMessage(this, "At Last...", "Download Complete");
    }

    public void showToast4_onClick(View view) {
        CustomToast2.errorMessage(this, "Error", "Download Failed");
    }
}