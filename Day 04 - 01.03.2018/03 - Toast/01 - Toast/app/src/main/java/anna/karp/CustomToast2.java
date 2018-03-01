package anna.karp;

import android.app.Activity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class CustomToast2 {

    public static void successMessage(Activity activity, String title, String message) {
        showMessage(activity, title, message, R.drawable.success);
    }

    public static void errorMessage(Activity activity, String title, String message) {
        showMessage(activity, title, message, R.drawable.error);
    }

    private static void showMessage(Activity activity, String title, String message, int imageID) {
        Toast toast = Toast.makeText(activity, "", Toast.LENGTH_LONG);
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        LinearLayout linearLayout = (LinearLayout)layoutInflater.inflate(R.layout.custom_toast, (LinearLayout)activity.findViewById(R.id.linearLayoutToast));
        ImageView imageViewTitle = (ImageView)linearLayout.findViewById(R.id.imageViewTitle);
        imageViewTitle.setImageResource(imageID);
        TextView textViewToastHeader = (TextView)linearLayout.findViewById(R.id.textViewToastTitle);
        textViewToastHeader.setText(title);
        TextView textViewToastMessage = (TextView)linearLayout.findViewById(R.id.textViewToastMessage);
        textViewToastMessage.setText(message);
        toast.setView(linearLayout);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}