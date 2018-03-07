package anna.karp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// The DiamondHolder will be created only for the initial shown items and not for all items: 
public class DiamondHolder extends RecyclerView.ViewHolder {

    private Context context;
    private ImageView imageViewDiamond;
    private TextView textViewColor;
    private TextView textViewCarat;
    private Diamond diamond;
    private OnDiamondClickListener listener;

    public DiamondHolder(Context context, View itemView) {
        super(itemView);
        this.context = context;

        // itemView is the root element of each item's layout,
        // which in our case is the LinearLayout of item_diamond.xml.
        imageViewDiamond = (ImageView) itemView.findViewById(R.id.imageViewDiamond);
        textViewColor = (TextView) itemView.findViewById(R.id.textViewColor);
        textViewCarat = (TextView) itemView.findViewById(R.id.textViewCarat);

        // Register different clicks:
        itemView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(listener != null) {
                    listener.onBackgroundClick(diamond);
                }
            }
        });

        imageViewDiamond.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(listener != null) {
                    listener.onImageClick(getImageIdFromImageName(diamond.getColor() + "_diamond"));
                }
            }
        });

        textViewColor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(listener != null) {
                    listener.onColorClick(diamond.getColor());
                }
            }
        });

        textViewCarat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(listener != null) {
                    listener.onCaratClick(diamond.getCarat());
                }
            }
        });
    }

    public void setOnDiamondClickListener(OnDiamondClickListener listener) {
        this.listener = listener;
    }

    // Binds the given diamond object to the layout item's UI:
    public void bindDiamond(Diamond diamond) {

        this.diamond = diamond;

        // Bind image:
        imageViewDiamond.setImageResource(getImageIdFromImageName(diamond.getColor() + "_diamond"));

        // Bind color text:
        textViewColor.setText(String.format("%s Diamond", diamond.getColor()));
        textViewColor.setTextColor(Diamond.getColorValue(diamond.getColor()));

        // Bind carat text:
        textViewCarat.setText(String.format("%.3f Ct.", diamond.getCarat()));
    }

    private int getImageIdFromImageName(String imageName) {
        return context.getResources().getIdentifier(imageName.toLowerCase(), "drawable", context.getPackageName());
    }

    public interface OnDiamondClickListener {
        void onColorClick(String color);
        void onCaratClick(float carat);
        void onImageClick(int imageId);
        void onBackgroundClick(Diamond diamond);
    }
}