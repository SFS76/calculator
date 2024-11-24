package com.example.calculator.service.impl;

import com.example.calculator.exception.DivideZero;
import com.example.calculator.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public Integer plus(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public Integer minus(Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public Integer divide(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new DivideZero("Нельзя делить на 0!");
        }
        return num1 / num2;
    }
}
