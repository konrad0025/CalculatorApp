package com.example.kalkulator;

import org.mariuszgromada.math.mxparser.*;

public class HandleCalculations {
    private String value;
    private String operation;

    public HandleCalculations()
    {
        this.value = "0";
        this.operation = "";
    }

    public int updateValue(String value){

        Expression exp;
        if(!(value == null))
        {
            exp = new Expression(this.value + this.operation + "(" + value + ")");
        }
        else
        {
            exp = new Expression(this.operation + "(" + this.value + ")");
        }
        this.value = String.valueOf(exp.calculate());
        if(this.value.endsWith(".0"))
        {
            this.value = this.value.substring(0, this.value.length() - 2);
        }
        if(this.value.equals("NaN"))
        {
            this.value = "0";
            return -1;
        }
        return 0;
    }

    public void setOperation(String calculation) {
        this.operation = calculation;
    }

    public String getOperation() {
        return operation;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    public String getCalcLine()
    {
        return this.value+this.operation;
    }
}
