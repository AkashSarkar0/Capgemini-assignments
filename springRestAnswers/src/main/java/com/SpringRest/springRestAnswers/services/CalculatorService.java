package com.SpringRest.springRestAnswers.services;
import org.springframework.stereotype.Service;

import com.SpringRest.springRestAnswers.models.Calculator;

@Service
public class CalculatorService {

    public Calculator createvalues(){
        Calculator cal = new Calculator();
        return cal;
    }

    public int add(Calculator value){
        createvalues();
        return value.getNum1() + value.getNum2();
    }
    public int subtract(Calculator value){
        createvalues();
        return value.getNum1() - value.getNum2();
    }
    public int multiply(Calculator value){
        createvalues();
        return value.getNum1() * value.getNum2();
    }
    public int divide(Calculator value){
        createvalues();
        return value.getNum1() / value.getNum2();
    }
}