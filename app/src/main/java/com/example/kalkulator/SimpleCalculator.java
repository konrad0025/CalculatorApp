package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SimpleCalculator extends AppCompatActivity {
    HandleCalculations handleCalculations;
    TextView textView;
    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calculator);
        handleCalculations = new HandleCalculations();
        textView = findViewById(R.id.textView4);
        setValue();
        button0 = findViewById(R.id.button19);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateCalcLine(button0.getText().toString());
            }
        });
        button1 = findViewById(R.id.button15);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateCalcLine(button1.getText().toString());
            }
        });
        button2 = findViewById(R.id.button16);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateCalcLine(button2.getText().toString());
            }
        });
        button3 = findViewById(R.id.button17);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateCalcLine(button3.getText().toString());
            }
        });
        button4 = findViewById(R.id.button11);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateCalcLine(button4.getText().toString());
            }
        });
        button5 = findViewById(R.id.button12);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateCalcLine(button5.getText().toString());
            }
        });
        button6 = findViewById(R.id.button13);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateCalcLine(button6.getText().toString());
            }
        });
        button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateCalcLine(button7.getText().toString());
            }
        });
        button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateCalcLine(button8.getText().toString());
            }
        });
        button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateCalcLine(button9.getText().toString());
            }
        });
    }

    public void setValue(){
        textView.setText(handleCalculations.getValue());
    }

    public void updateCalcLine(String value)
    {
        if(textView.getText().equals("0"))
        {
            handleCalculations.setValue(value);
        }
        else
        {
            handleCalculations.setValue(handleCalculations.getValue()+value);
        }
        setValue();
    }

    public void setOperation(String Operation)
    {
        handleCalculations.setOperation(Operation);
    }

    public void calculate(String value)
    {
        handleCalculations.updateValue(value);
    }
}