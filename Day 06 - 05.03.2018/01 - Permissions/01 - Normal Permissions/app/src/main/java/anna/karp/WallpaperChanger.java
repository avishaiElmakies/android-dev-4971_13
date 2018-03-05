package anna.karp;

import android.app.WallpaperManager;
import java.io.IOException;

public class WallpaperChanger {

    // Note: on newer Android Studio (2.3+) there is a warning for using images from the drawable directory.
    // The solution is to use them from the raw directory.
    // This may solve the crashes of large images resides in the drawable directory.:
    private static int[] imageIDs = {R.raw.bridge, R.raw.dots, R.raw.electrons, R.raw.feet, R.raw.lines, R.raw.rain, R.raw.space, R.raw.spheres, R.raw.squares, R.raw.stem};

    public static void changeWallpaper() throws IOException {

        WallpaperManager wallpaperManager = WallpaperManager.getInstance(MyApp.getContext());

        int index = (int) (Math.random() * 10);

        int imageID = imageIDs[index];

        wallpaperManager.setResource(imageID);
    }
}