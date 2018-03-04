package com.karp.anna.myapplication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

// Debugging Shortcuts:
// Ctrl + F8    Insert Breakpoint / Remove Breakpoint
// Shift + F9   Start Debugging (Or click on the bug icon near to the start icon).
// F8           Step Over
// F7           Step Into
// F9           Continue Debugging
// Ctrl + F2    Stop Debugging

public class MainActivity extends AppCompatActivity {

    private EditText editNum;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editNum=(EditText)findViewById(R.id.editNum);

    }


    public int mulNum(int num){
        return num*2;
    }

    public int addNum(int num){

        return num+2;
    }

    public boolean isEven(int num){
        return num%2==0;
    }

    public String isEvenMsg(boolean param){
        return "I am "+((param)?"Even":"Odd");
    }

    public void showEvenNumbers_onClick(View view) {

        int num=Integer.parseInt(editNum.getText().toString());
        //chaining
        /*
        * 1. mulNum(3)
        * 2. addNum sends the result of step 1
        * 3. isEven sends the result of step 2
        * 4. isEvenMsg sends the result of step 3
        * 5. the returned string from step 4 is used with the concat function - and returns a new string
        * 6. the returned string from step 5 is used with the replace function - and returns a new string
        * 7. the returned string from step 6 is used with the replace function - and returns a new string
        * 8. we store in " String msg" the value that step 7 returned
        * */
        String msg=isEvenMsg(isEven(addNum(mulNum(num))))
                .concat(" ,Added by concat  ")
                .replace('A','*')
                .replace('*','a');


        Toast.makeText(this, msg+num, Toast.LENGTH_LONG).show();
    }
}
