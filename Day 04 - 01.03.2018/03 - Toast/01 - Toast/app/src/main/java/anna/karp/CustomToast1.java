package anna.karp;

import android.app.Activity;
import android.graphics.Color;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class CustomToast1 {

    public static void showMessage(Activity activity, String message) {
        Toast toast = Toast.makeText(activity, message, Toast.LENGTH_LONG);
        LinearLayout linearLayoutToast = (LinearLayout)toast.getView();
        linearLayoutToast.setBackgroundColor(Color.CYAN);
        TextView textViewToast = (TextView)linearLayoutToast.findViewById(android.R.id.message);
        textViewToast.setTextSize(25);
        textViewToast.setTextColor(Color.RED);
        textViewToast.setPadding(20, 0, 20, 0);
        // textViewToast.setCompoundDrawablesWithIntrinsicBounds(R.drawable.success, 0, 0, 0);
        toast.show();
    }
}