package anna.karp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.util.ArrayList;

public class DiamondsAdapter extends RecyclerView.Adapter<DiamondHolder> {

    private Context context;
    private ArrayList<Diamond> diamonds;
    private DiamondHolder.OnDiamondClickListener listener;

    public DiamondsAdapter(Context context, ArrayList<Diamond> diamonds) {
        this.context = context;
        this.diamonds = diamonds;
    }

    public void setOnDiamondClickListener(DiamondHolder.OnDiamondClickListener listener) {
        this.listener = listener;
    }

    // Automatically invoked when it should insert a new item to the list.
    // This method is done only for the few items that are shown in the list
    // and not for the rest of the items which will be presented on scrolling:
    public DiamondHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // Get a layout inflater for inflating the layout xml:
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        // Inflate the layout xml for only the few initial presented items:
        RelativeLayout relativeLayout = (RelativeLayout)layoutInflater.inflate(R.layout.item_diamond, parent, false); // false = don't append the inflate to the root but create a new one.

        // Return back a recycled holder object:
        DiamondHolder diamondHolder = new DiamondHolder(context, relativeLayout);
        diamondHolder.setOnDiamondClickListener(listener);
        return diamondHolder;
    }

    // Automatically invoked for each item presented in the list, when the item is shown,
    // for updating the holder object with the item's internal data:
    public void onBindViewHolder(DiamondHolder holder, int position) {
        Diamond diamond = diamonds.get(position);
        holder.bindDiamond(diamond);
    }

    // Return the items count:
    public int getItemCount() {
        return diamonds.size();
    }
}