package anna.karp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private int[] imageIDs = {R.drawable.bunny, R.drawable.chameleon, R.drawable.deer, R.drawable.duckling, R.drawable.elephant, R.drawable.giraffe, R.drawable.kitten, R.drawable.owl, R.drawable.panda, R.drawable.puppy, R.drawable.bunny, R.drawable.chameleon, R.drawable.deer, R.drawable.duckling, R.drawable.elephant, R.drawable.giraffe, R.drawable.kitten, R.drawable.owl, R.drawable.panda, R.drawable.puppy, R.drawable.bunny, R.drawable.chameleon, R.drawable.deer, R.drawable.duckling, R.drawable.elephant, R.drawable.giraffe, R.drawable.kitten, R.drawable.owl, R.drawable.panda, R.drawable.puppy};
    private Context context;

    public ImageAdapter(Context context) {
        this.context = context;
    }

    public int getCount() {
        return imageIDs.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // Create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView;

        // if it's not recycled:
        if (convertView == null) {
            imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(200, 200));
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(imageIDs[position]);

        return imageView;
    }
}