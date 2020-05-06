package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText First_No = findViewById(R.id.First_No);
        EditText Second_No = findViewById(R.id.Second_No);
        Button addbtn = findViewById(R.id.addbtn);
        Button subbtn = findViewById(R.id.subbtn);
        Button multbtn = findViewById(R.id.multbtn);
        Button dvdbtn = findViewById(R.id.dvdbtn);
        TextView output = findViewById(R.id.output);

        if(First_No.getText().toString().length() == 0)
        {
            First_No.setText("0");
        }

        if(Second_No.getText().toString().length() == 0)
        {
            Second_No.setText("0");
        }


        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float num1 = Float.parseFloat(First_No.getText().toString());
                Float num2 = Float.parseFloat(Second_No.getText().toString());
                Float res = num1 + num2;
                output.setText(String.valueOf(res));
            }
        });

        subbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float num1 = Float.parseFloat(First_No.getText().toString());
                Float num2 = Float.parseFloat(Second_No.getText().toString());
                Float res = num1 - num2;
                output.setText(String.valueOf(res));
            }
        });

        multbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float num1 = Float.parseFloat(First_No.getText().toString());
                Float num2 = Float.parseFloat(Second_No.getText().toString());
                Float res = num1 * num2;
                output.setText(String.valueOf(res));
            }
        });
        dvdbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float num1 = Float.parseFloat(First_No.getText().toString());
                Float num2 = Float.parseFloat(Second_No.getText().toString());
            
                if(num2 == 0)
                {
                    output.setText("Undefined");
                }
                else {
                    Float res = num1 / num2;
                    output.setText(String.valueOf(res));
                }
            }
        });







    }
}