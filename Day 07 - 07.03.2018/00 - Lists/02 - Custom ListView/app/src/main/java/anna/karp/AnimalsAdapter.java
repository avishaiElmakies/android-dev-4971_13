package anna.karp;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;

public class AnimalsAdapter extends ArrayAdapter<Animal> {

    private LayoutInflater layoutInflater;
    private Resources resources;
    private String packageName;

    public AnimalsAdapter(Context context, ArrayList<Animal> animals) {
        super(context, 0, animals);
        layoutInflater = LayoutInflater.from(context);
        resources = context.getResources();
        packageName = context.getPackageName();
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        // Inflate layout and get controls:
        RelativeLayout relativeLayout = (RelativeLayout)layoutInflater.inflate(R.layout.item_animal, null);
        ImageView imageViewAnimal = (ImageView)relativeLayout.findViewById(R.id.imageViewAnimal);
        TextView textViewType = (TextView)relativeLayout.findViewById(R.id.textViewType);
        TextView textViewDescription = (TextView)relativeLayout.findViewById(R.id.textViewDescription);

        // Get current item:
        Animal animal = getItem(position);

        // Set control data:
        int imageID = resources.getIdentifier(animal.getType().toLowerCase(), "drawable", packageName);
        imageViewAnimal.setImageResource(imageID);
        textViewType.setText(animal.getType());
        textViewDescription.setText(animal.getDescription());

        // Return created layout:
        return relativeLayout;
    }
}
