package anna.karp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

// 9patch-resizer is an .exe tool that can be downloaded from:
// https://github.com/redwarp/9-Patch-Resizer/releases
// To use it - do the following:
// 1. Take some image you wish to use in your app and put it in some empty folder.
//    The image must be with the highest resolution, but not with a high weight.
// 2. Make sure the image file name is in lower case / underscore / digits.
// 3. Run the tool.
// 4. Select all checkboxes you wish to use images for (dpi values).
// 5. Drag the image to the arrow inside the tool.
// 6. The tool will create several folders, each containing one image in its specific density.
// 7. Mark all the created folders and copy them.
// 8. In Android Studio - paste all directories on the res folder.
// 9. This will copy all folders to the "drawable" folder inside the "res" folder.
// 10. You can't paste them directly on the "drawable" folder - it doesn't work.
// 11. To use those images, set @drawable/image_name_without_extension to the suitable attribute.
//     e.g: <ImageView ... android:src="@drawable/home" ... />
// Android will automatically take the correct dpi image.

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
