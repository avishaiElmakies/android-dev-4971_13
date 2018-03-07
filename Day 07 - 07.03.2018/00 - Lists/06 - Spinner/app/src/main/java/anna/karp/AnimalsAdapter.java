package anna.karp;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

public class AnimalsAdapter extends BaseAdapter {

    private ArrayList<String> animals;
    private LayoutInflater layoutInflater;
    private Resources resources;
    private String packageName;

    public AnimalsAdapter(Context context, ArrayList<String> animals) {
        this.resources = context.getResources();
        this.packageName = context.getPackageName();
        this.animals = animals;
        layoutInflater = LayoutInflater.from(context);
    }

    public int getCount() {
        return animals.size();
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        // Create layout and get controls:
        LinearLayout linearLayout = (LinearLayout)layoutInflater.inflate(R.layout.item_spinner, null);
        TextView textViewAnimal = (TextView) linearLayout.findViewById(R.id.textViewAnimal);
        ImageView imageViewAnimal = (ImageView) linearLayout.findViewById(R.id.imageViewAnimal);

        // Set data:
        textViewAnimal.setText(animals.get(position));
        int imageID = resources.getIdentifier(animals.get(position).toLowerCase(), "drawable", packageName);
        imageViewAnimal.setImageResource(imageID);

        // Return layout:
        return linearLayout;
    }
}