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

    public void updateValue(String value){
        Expression exp = new Expression(this.value + this.operation + value);
        this.value = String.valueOf(exp.calculate());
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
