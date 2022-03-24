package com.SpringRest.springRestAnswers.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringRest.springRestAnswers.models.Calculator;
import com.SpringRest.springRestAnswers.services.CalculatorService;


@RestController
public class CalculatorController {
	
    @Autowired
    CalculatorService calculatorService;
    

    @PostMapping("/calculator/add")
    public int add(@RequestBody Calculator value){
        return calculatorService.add(value);
    }

    @PostMapping("/calculator/subtract")
    public int subtract(@RequestBody Calculator value){
        return calculatorService.subtract(value);
    }

    @PostMapping("/calculator/multiply")
    public int multiply(@RequestBody Calculator value){
        return calculatorService.multiply(value);
    }

    @PostMapping("/calculator/divide")
    public int divide(@RequestBody Calculator value){
        return calculatorService.divide(value);
    }
}