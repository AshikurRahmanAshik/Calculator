package com.ashik.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button but1,but2,but3,but4,but5,but6,but7,but8,but9,but0,
            butAdd,butDiv,butSub,butMul,butMod,butDot,butEqual,butX,butC,butSqrt;
    private TextView content,contentRes;
    private String opStatus = "NOT";

    private double value = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but1 = findViewById(R.id.button1);
        but2 = findViewById(R.id.button2);
        but3 = findViewById(R.id.button3);
        but4 = findViewById(R.id.button4);
        but5 = findViewById(R.id.button5);
        but6 = findViewById(R.id.button6);
        but7 = findViewById(R.id.button7);
        but8 = findViewById(R.id.button8);
        but9 = findViewById(R.id.button9);
        but0 = findViewById(R.id.button0);
        butAdd = findViewById(R.id.buttonAdd);
        butDiv = findViewById(R.id.buttonDiv);
        butSub = findViewById(R.id.buttonSub);
        butMul = findViewById(R.id.buttonMul);
        butMod = findViewById(R.id.buttonMod);
        butDot = findViewById(R.id.buttonDot);
        butSqrt = findViewById(R.id.buttonSqrt);
        butC = findViewById(R.id.buttonC);
        butEqual = findViewById(R.id.buttonEqual);
        content = findViewById(R.id.content);
        contentRes = findViewById(R.id.contentRes);
        butX = findViewById(R.id.buttonX);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText(content.getText().toString() + "1");
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText(content.getText().toString() + "2");
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText(content.getText().toString() + "3");
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText(content.getText().toString() + "4");
            }
        });
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText(content.getText().toString() + "5");
            }
        });
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText(content.getText().toString() + "6");
            }
        });
        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText(content.getText().toString() + "7");
            }
        });
        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText(content.getText().toString() + "8");
            }
        });
        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText(content.getText().toString() + "9");
            }
        });
        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText(content.getText().toString() + "0");
            }
        });
        butAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(content.getText().toString().matches("")){
                    content.setText("");
                    opStatus = "ADD";
                }
                else{
                    value = Double.parseDouble(content.getText().toString());
                    contentRes.setText(content.getText().toString());
                    content.setText("");
                    opStatus = "ADD";
                }
            }
        });
        butSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(content.getText().toString().matches("")){
                    content.setText("");
                    opStatus = "SUB";
                }
                else{
                    value = Double.parseDouble(content.getText().toString());
                    contentRes.setText(content.getText().toString());
                    content.setText("");
                    opStatus = "SUB";
                }
            }
        });
        butDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(content.getText().toString().matches("")){
                    content.setText("");
                    opStatus = "DIV";
                }
                else{
                    value = Double.parseDouble(content.getText().toString());
                    contentRes.setText(content.getText().toString());
                    content.setText("");
                    opStatus = "DIV";
                }
            }
        });
        butMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("tag",Double.toString(value));
                if(content.getText().toString().matches("")){
                    content.setText("");
                    opStatus = "MUL";
                }
                else{
                    value = Double.parseDouble(content.getText().toString());
                    contentRes.setText(content.getText().toString());
                    content.setText("");
                    opStatus = "MUL";
                }
            }
        });
        butMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(content.getText().toString().matches("")){
                    content.setText("");
                    opStatus = "MOD";
                }
                else{
                    value = Double.parseDouble(content.getText().toString());
                    contentRes.setText(content.getText().toString());
                    content.setText("");
                    opStatus = "MOD";
                }
            }
        });
        butSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!content.getText().toString().matches("")){
                    value = Math.sqrt(Double.parseDouble(content.getText().toString()));
                    contentRes.setText(String.valueOf(value));
                    content.setText("");
                }
            }
        });
        butEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(opStatus.equals("ADD")){
                    if(!content.getText().toString().matches("")){
                        value += Double.parseDouble(content.getText().toString());
                        contentRes.setText(Double.toString(value));
                        opStatus = "NOT";
                        content.setText("");
                    }
                }
                else if(opStatus.equals("SUB")){
                    value -= Double.parseDouble(content.getText().toString());
                    contentRes.setText(Double.toString(value));
                    opStatus = "NOT";
                    content.setText("");
                }
                else if(opStatus.equals("MUL")){
                    value *= Double.parseDouble(content.getText().toString());
                    contentRes.setText(Double.toString(value));
                    opStatus = "NOT";
                    content.setText("");
                }
                else if(opStatus.equals("DIV")){
                    double tmp = Double.parseDouble(content.getText().toString());
                    if(tmp != 0){
                        value /= tmp;
                        contentRes.setText(Double.toString(value));
                    }
                    else{
                        contentRes.setText("Invalid");
                    }
                    opStatus = "NOT";
                    content.setText("");
                }
                else if(opStatus.equals("MOD")){
                    value %= Double.parseDouble(content.getText().toString());
                    contentRes.setText(Double.toString(value));
                    opStatus = "NOT";
                    content.setText("");
                }
                else{

                }
            }
        });
        butDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(content.getText().toString().matches("")){
                    content.setText("0.");
                }
                else{
                    if(!content.getText().toString().contains(".")){
                        content.setText(content.getText().toString()+".");
                    }
                }
            }
        });
        butX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!content.getText().toString().matches("")){
                    String tmp = content.getText().toString();
                    content.setText(tmp.substring(0,tmp.length()-1));
                }
            }
        });
        butC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contentRes.setText("0");
                content.setText("");
                value = 0;
                opStatus = "NOT";
            }
        });
    }
}