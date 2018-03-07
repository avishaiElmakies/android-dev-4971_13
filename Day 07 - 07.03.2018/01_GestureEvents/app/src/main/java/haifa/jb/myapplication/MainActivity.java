package haifa.jb.myapplication;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;

//every activity in android inherits from the Activity (AppCompatActivity inherits Activity)
//for every Gesture event we have to implement a special matching interface
public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener {
    private TextView t;
    private GestureDetectorCompat gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t = (TextView) findViewById(R.id.defaultVal);


        //new GestureDetectorCompat takes the following parameters:
        // 1) Context context
        // 2) OnGestureListener listener
            this.gestureDetector = new GestureDetectorCompat(this, this);


        //the "setOnDoubleTapListener" function gets the following parameter:
        //1)OnDoubleTapListener listener
        gestureDetector.setOnDoubleTapListener(this);
    }

    ///////// OnGestureListener METHODS //////////
    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        t.setText("onSingleTapConfirmed");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        t.setText("onDoubleTap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        t.setText("onDoubleTapEvent");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        t.setText("onDown");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        t.setText("onShowPress");

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        t.setText("onSingleTapUp");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        t.setText("onScroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        t.setText("onLongPress");

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        t.setText("onFling");
        return true;
    }

    ///////// OnDoubleTapListener METHODS //////////


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }


}


