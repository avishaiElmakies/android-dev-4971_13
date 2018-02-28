package haifa.jb.myapplication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

private int counter=0;
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);

    }

    public void buttonSetLinear_onClick(View view){

        //-----------------------------STEP 1 : CREATE THE LAYOUT---------------------------------
        // creating LinearLayout
        LinearLayout linLayout = new LinearLayout(this);

        // specifying vertical orientation
        linLayout.setOrientation(LinearLayout.VERTICAL);

        // creating LayoutParams - first parameter is width , second parameter is height
        LinearLayout.LayoutParams linLayoutParam = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        // set LinearLayout as a root element of the screen
        //config the attributes to the linearLayout itself
        setContentView(linLayout,linLayoutParam );


        //-----------------------------STEP 2 : CREATE THE TEXTVIEW (to add as content to the layout)---------------------------------


        // creating TextView
        TextView txtView = new TextView(this);
        txtView.setText("Linear Layout "+(counter++));


        // creating LayoutParams to add settings to the TextView- first parameter is width , second parameter is height
        LinearLayout.LayoutParams textViewParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        textViewParams.setMargins(300,200,300,0);
        //config the attributes to the TextView
        txtView.setLayoutParams(textViewParams);

        //here we add the TextView to the LinearLayout that we creared in step 1
        linLayout.addView(txtView);



        //-----------------------------STEP 3 : CREATE THE BUTTON (to add as content to the layout)---------------------------------

        // creating Button
        Button btn = new Button(this);
        btn.setText("Switch to Relative");

        View.OnClickListener  myOnClickListener= new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    buttonSetRelative_onClick(view);
                }
         };

        //this is the way to add an event to the click listener
        btn.setOnClickListener(myOnClickListener);

        LinearLayout.LayoutParams btnParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        //if we set the width by code - it is px
        btnParams.setMargins(300,200,300,200);

        btn.setLayoutParams(btnParams);

        //here we add the Button to the LinearLayout that we creared in step 1
        linLayout.addView(btn);

    }



    public void buttonSetRelative_onClick(View view){


        //-----------------------------STEP 1 : CREATE THE LAYOUT---------------------------------
        // creating RelativeLayout
        RelativeLayout relativeLayout = new RelativeLayout(this);

        // Defining the RelativeLayout layout parameters.
        // In this case I want to fill its parent
        // creating LayoutParams - first parameter is width , second parameter is height
        RelativeLayout.LayoutParams relParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT);


        // set RelativeLayout as a root element of the screen
        //config the attributes to the relativeLayout itself
        setContentView(relativeLayout,relParams );


        //-----------------------------STEP 2 : CREATE THE TEXTVIEW (to add as content to the layout)---------------------------------


        // creating TextView
        TextView txtView = new TextView(this);
        txtView.setText("Relative Layout "+(counter++));


        // creating LayoutParams to add settings to the TextView- first parameter is width , second parameter is height
        RelativeLayout.LayoutParams textViewParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        textViewParams.addRule(RelativeLayout.CENTER_IN_PARENT);
        //config the attributes to the TextView
        txtView.setLayoutParams(textViewParams);

        //here we add the TextView to the LinearLayout that we creared in step 1
        relativeLayout.addView(txtView);



        //-----------------------------STEP 3 : CREATE THE BUTTON (to add as content to the layout)---------------------------------

        // creating Button
        Button btn = new Button(this);
        btn.setText("Switch to Linear");

        View.OnClickListener  myOnClickListener= new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonSetLinear_onClick(view);
            }
        };

        //this is the way to add an event to the click listener
        btn.setOnClickListener(myOnClickListener);
        // Defining the layout parameters of the TextView
        RelativeLayout.LayoutParams btnParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        btnParams.topMargin=200;
        btnParams.addRule(RelativeLayout.CENTER_HORIZONTAL);

        btn.setLayoutParams(btnParams);

        //here we add the Button to the LinearLayout that we creared in step 1
        relativeLayout.addView(btn);
    }

}