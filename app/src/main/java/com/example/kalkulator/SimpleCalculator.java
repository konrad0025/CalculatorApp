package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SimpleCalculator extends AppCompatActivity {
    HandleCalculations handleCalculations;
    TextView textView,textViewUpper;
    Button buttonC,buttonMark,buttonDot,button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonPlus,buttonMinus,buttonEqual,buttonMultiply,buttonDivide,buttonBscp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calculator);
        handleCalculations = new HandleCalculations();
        textView = findViewById(R.id.textView4);
        textViewUpper = findViewById(R.id.textView5);
        setValue("0");
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
        buttonPlus = findViewById(R.id.button22);
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setOperation(buttonPlus.getText().toString());
            }
        });
        buttonMinus = findViewById(R.id.button18);
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setOperation(buttonMinus.getText().toString());
            }
        });
        buttonEqual = findViewById(R.id.button21);
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                equalButton();
            }
        });
        buttonMultiply = findViewById(R.id.button18);
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setOperation(buttonMultiply.getText().toString());
            }
        });
        buttonMinus = findViewById(R.id.button14);
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setOperation(buttonMinus.getText().toString());
            }
        });
        buttonDivide = findViewById(R.id.button10);
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setOperation(buttonDivide.getText().toString());
            }
        });
        buttonBscp = findViewById(R.id.button4);
        buttonBscp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bscpCalcLine();
            }
        });
        buttonC = findViewById(R.id.button5);
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CButton();
            }
        });
        buttonDot = findViewById(R.id.button20);
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dotButton();
            }
        });
        buttonMark = findViewById(R.id.button6);
        buttonMark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeMarkButton();
            }
        });
    }

    public void setValue(String value){
        textView.setText(value);
    }

    public void updateCalcLine(String value)
    {
        if(!textView.getText().equals("0") && !textView.getText().equals("NaN"))
        {
            String var = textView.getText().toString();
            textView.setText(var.concat(value));
        }
        else
        {
            textView.setText(value);
        }
    }
    public void changeMarkButton()
    {
        if(!textView.getText().toString().equals("0") || !textView.getText().toString().equals("NaN"))
        {
            if(!textView.getText().toString().contains("-"))
            {
                String var = textView.getText().toString();
                textView.setText("-".concat(var));
            }
            else
            {
                String var = textView.getText().toString();
                textView.setText(var.replace("-",""));
            }
        }

    }
    public void dotButton()
    {
        if(!textView.getText().toString().contains(".") && !textView.getText().equals("NaN"))
        {
            String var = textView.getText().toString();
            textView.setText(var.concat("."));
        }
    }
    public void bscpCalcLine()
    {
        String var = textView.getText().toString();
        var = var.substring(0, var.length()-1);
        if(var.equals("") || var.equals("Na"))
        {
            textView.setText("0");
        }
        else {
            textView.setText(var);
        }
    }
    public void CButton()
    {
        if(!textView.getText().equals("0"))
        {
            textView.setText("0");
        }
        else
        {
            textViewUpper.setText("");
            handleCalculations.setOperation("");
            handleCalculations.setValue("0");
        }
    }
    public void setOperation(String Operation)
    {
        if(!textView.getText().equals("NaN"))
        {
            if(handleCalculations.getOperation().equals(""))
            {
                handleCalculations.setOperation(Operation);
                handleCalculations.setValue(textView.getText().toString());
                textViewUpper.setText(handleCalculations.getCalcLine());
                setValue("0");
            }
            else if(!handleCalculations.getOperation().equals(Operation))
            {
                calculate(textView.getText().toString());
                if(!handleCalculations.getValue().contains("NaN"))
                {
                    handleCalculations.setOperation(Operation);
                    textViewUpper.setText(handleCalculations.getCalcLine());
                    setValue("0");
                }
                else
                {
                    handleCalculations.setOperation("");
                    handleCalculations.setValue("0");
                    textViewUpper.setText("");
                    setValue("NaN");
                }
            }
        }
    }

    public void equalButton()
    {
        calculate(textView.getText().toString());
        setValue(handleCalculations.getValue());
        textViewUpper.setText("");
        handleCalculations.setOperation("");
    }

    public void calculate(String value)
    {
        handleCalculations.updateValue(value);
    }

}