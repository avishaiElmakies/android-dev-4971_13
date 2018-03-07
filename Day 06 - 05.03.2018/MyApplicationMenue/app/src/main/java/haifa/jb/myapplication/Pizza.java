package haifa.jb.myapplication;

import android.content.Context;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Android on 3/5/2018.
 */

 public  class Pizza extends Food {
    @Override
    public LinearLayout foodInfo(Context context) {
        LinearLayout linear=new LinearLayout(context);

        TextView tx=new TextView(context);
        tx.setText("Pizza");
        linear.addView(tx);
        return linear;

    }


    public void slicePizza(int numOfSlices) {
        Log.d("Pizza","slicePizza in pizza");

    }

}