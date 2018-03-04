package anna.karp;

import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.ContactsContract;
import java.util.ArrayList;

public class ContactsManager {

    public static ArrayList<String> getContacts() {

        ArrayList<String> contacts = new ArrayList<>();

        // Get contacts cursor:
        ContentResolver contentResolver = MyApp.getContext().getContentResolver();

        // If there are no such content provider, return empty list:
        if(contentResolver == null) {
            return contacts;
        }

        Cursor contactsCursor = contentResolver.query(ContactsContract.Contacts.CONTENT_URI, new String[]{ContactsContract.Contacts.DISPLAY_NAME}, null, null, null);
        int displayNameIndex = contactsCursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME);

        // Run on all contacts:
        while (contactsCursor.moveToNext()) {
            String displayName = contactsCursor.getString(displayNameIndex);
            contacts.add(displayName);
        }
        contactsCursor.close();

        return contacts;
    }
}