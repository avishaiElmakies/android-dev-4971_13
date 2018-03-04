package com.karp.anna.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {

    private static int rank=3;
    MatrixButton[][] mat=new MatrixButton[rank][rank];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        GridLayout grid=new GridLayout(this);


        grid.setColumnCount(3);
        grid.setRowCount(5);


        setContentView(grid);



        String[] btnActions={"Digonals","Frame","Top-Left","Top-Right","Bottom-Right","Bottom-Left"};

        for(String action:btnActions){
            Button btn=new Button(this);

            btn.setText(action);
            btn.setWidth(230);
            btn.setTextSize(11);

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    for(int row=0; row<rank;row++){
                        for(int col=0; col<rank;col++){
                            mat[row][col].setState(((Button)view).getText().toString());
                        }
                    }
                }
            });
            grid.addView(btn);
        }

        MatrixButton.rank=rank;
        for(int row=0; row<rank;row++){
            for(int col=0; col<rank;col++){
                mat[row][col]=new MatrixButton(col,row,this);
                mat[row][col].setText(row+" , "+col);
                grid.addView(mat[row][col]);
            }
        }

    }
}
