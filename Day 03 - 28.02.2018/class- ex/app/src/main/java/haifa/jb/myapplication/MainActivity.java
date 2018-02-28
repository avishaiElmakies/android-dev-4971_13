package haifa.jb.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ContentFrameLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.GridLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

// The ViewGroup is the base class for all containers.
// All layouts derived directly or indirectly from the ViewGroup.

public class MainActivity extends AppCompatActivity {

    private ContentFrameLayout contentFrameLayoutMain;
    private TextView txt;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contentFrameLayoutMain = (ContentFrameLayout)findViewById(android.R.id.content);
        txt=(TextView)findViewById(R.id.action);
    }

    public void buttonMul_onClick(View view) {
        updateContent(contentFrameLayoutMain,"Mul");
    }

    public void buttonPrime_onClick(View view) {
        updateContent(contentFrameLayoutMain,"Prime");
    }


    public void updateContent(ViewGroup parent,String action) {

        for (int i = 0; i < parent.getChildCount(); i++) {

            View child = parent.getChildAt(i);

            if(child instanceof TableLayout && action.equals("Mul")) {
                if (((TableLayout) child).getChildCount() == 1) {


                    for (int outer = 1; outer <= 10; outer++) {


                        TableRow tr = new TableRow(this);
                        for (int inner = 1; inner <= 10; inner++) {
                            TextView txtCol = new TextView(this);
                            txtCol.setText(inner * outer + " ");
                            tr.addView(txtCol);
                        }

                        ((TableLayout) child).addView(tr);
                    }
                }

                txt.setText(action + "1");

            }
            else if(child instanceof GridLayout && action.equals("Prime")) {

                if (((GridLayout) child).getChildCount() == 1) {


                    for (int num = 1; num <= 5; num++) {
                        TextView txtCol1 = new TextView(this);
                        txtCol1.setText(num + " ");


                        TextView txtCol2 = new TextView(this);
                        txtCol2.setText("num "+ num);

                        ((GridLayout) child).addView(txtCol1);
                        ((GridLayout) child).addView(txtCol2);
                        }
                }
                txt.setText(action + "2");
            }
            else if(child instanceof ViewGroup) {
                updateContent((ViewGroup)child,action);
            }
        }
    }
}