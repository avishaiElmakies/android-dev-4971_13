package haifa.jb.myapplication;

import android.content.Context;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Android on 3/5/2018.
 */

public class Chips extends Food {

    @Override
    public LinearLayout foodInfo(Context context) {
        LinearLayout linear=new LinearLayout(context);
        TextView tx=new TextView(context);
        tx.setText("Chips");
        linear.addView(tx);
       return linear;

    }
}
