package haifa.jb.myapplication;

import android.content.Context;
import android.util.Log;
import android.widget.LinearLayout;

/**
 * Created by Android on 3/5/2018.
 */

public abstract class Food {

    public Food(){
       Log.d("Food","in Food constructor");
    }
    //declare a function without body
    //must be implemented in all sub classes
    public abstract LinearLayout foodInfo(Context context);
}
