package anna.karp;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;

// Dangerous permissions are permissions which can cause user sensitive data to be revealed.
// This can be files on the device, user location, user bluetooth connection etc.
// All dangerous permissions are divided into groups.
// E.g: READ_CONTACTS, WRITE_CONTACTS and GET_ACCOUNTS belongs to the CONTACTS group.
// Using one or more of the Dangerous Permissions requires the following:
// On Android 5.x (Lollipop) and below - request permission only on the Manifest.
// On Android 6.x (Marshmallow) and above - request permission in the Manifest AND programmatically.
// Requesting permission programmatically is called Runtime Permission Model.
// (Thus we shall always use Manifest + programmatically permission requests on dangerous permissions.)
// This is because since Android 6.x and above, permissions are not being checked during installation,
// but during first time request for the permission, by displaying a DENY/ALLOW dialog.
// If user denys - the dialog will be presented again on next permission request.
// If user allows - the dialog won't be presented again and the permission will be granted for the entire permission group.
// This gives several benefits to the user:
// 1. Fewer questions during installation.
// 2. Faster installation.
// 3. User can give permission to specific things instead of general consent to all app permissions.
//    e.g: user can give permission to the camera but not to the contacts for a specific app.
// 4. User can revoke given permission at any time by:
//    App Info -> Permissions -> Revoke specific permission on presented list.

public class MainActivity extends AppCompatActivity {

    private TextView textViewContacts;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewContacts = (TextView)findViewById(R.id.textViewContacts);
    }

    public void buttonContacts_onClick(View view) {

        // If android version is Marshmallow or above AND the permission wasn't granted before:
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && checkSelfPermission(Manifest.permission.READ_CONTACTS) == PackageManager.PERMISSION_DENIED) {

            // Request the permission programmatically. This will present a DENY/ALLOW dialog:
            requestPermissions(new String[]{Manifest.permission.READ_CONTACTS}, 0); // 0 = RequestCode
        }
        else {
            // Android version is Lollipop or below, or permission has been granted before - thus show contacts:
            showContacts();
        }
    }

    // This function will be automatically invoked when user deny or allow the dialog:
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {

        // If permission equals to the one we need (READ_CONTACTS) and user allows it:
        if(permissions[0].equals(Manifest.permission.READ_CONTACTS) && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

            // Show contacts:
            showContacts();
        }
        else {
            // User denies the permission:
            textViewContacts.setText("Permission not granted.");
        }
    }

    // Show contacts:
    private void showContacts() {

        try {
            textViewContacts.setText("");

            ArrayList<String> contacts = ContactsManager.getContacts();

            for (String contact : contacts) {
                textViewContacts.append(contact + "\n");
            }
        }
        catch (Exception ex) {
            textViewContacts.setText(ex.getMessage());
        }
    }
}