package com.karp.anna.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;


public class MatrixButton extends AppCompatButton implements IBasicAction {



    private int col;
    private int row;
    public static int rank;

    public MatrixButton(int col, int row,final Context context) {
        super(context);
        this.col=col;
        this.row=row;
        setWidth(200);
        setHeight(200);

        this.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, getDescription(), Toast.LENGTH_LONG).show();
            }
        });
    }

    public ArrayList<String> matrixState(){

        ArrayList<String> strDescription=new ArrayList<String>();
        if(col==row ||col+row==rank-1){
            strDescription.add("Digonals");
        }
        if(col+row<rank-1){
            strDescription.add("Top-Left");
        }
        if(col+row>rank-1){
            strDescription.add("Bottom-Right");
        }
        if(col>row){
            strDescription.add("Top-Right");
        }
        if(col<row){
            strDescription.add("Bottom-Left");
        }
        if(col==0||row==0 ||col==rank-1||row==rank-1){
            strDescription.add("Frame");
        }
        return strDescription;

    }
    @Override
    public void setState(String str) {
        ArrayList<String> array=matrixState();
        if(array.contains(str))
            this.setBackgroundColor(Color.GREEN);
        else
            this.setBackgroundColor(Color.RED);
    }

    @Override
    public String getDescription() {

        String tempStr="";
       for ( String str:matrixState()){
           tempStr+=str + "  ";
       }
        return tempStr;
    }
}
