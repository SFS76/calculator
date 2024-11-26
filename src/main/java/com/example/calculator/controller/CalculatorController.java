package com.example.calculator.controller;

import com.example.calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String start() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping("plus")
    public String plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Укажите оба аргумента!";
        }
        Integer result = calculatorService.plus(num1, num2);
        return num1 + " + " + num2 + " = " + result;
    }

    @GetMapping("minus")
    public String minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Укажите оба аргумента!";
        }
        Integer result = calculatorService.minus(num1, num2);
        return num1 + " - " + num2 + " = " + result;
    }

    @GetMapping("multiply")
    public String multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Укажите оба аргумента!";
        }
        Integer result = calculatorService.multiply(num1, num2);
        return num1 + " * " + num2 + " = " + result;
    }

    @GetMapping("divide")
    public String divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Укажите оба аргумента!";
        }
        Integer result = calculatorService.divide(num1, num2);
        return num1 + " / " + num2 + " = " + result;
    }
}
