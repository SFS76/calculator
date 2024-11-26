package com.example.calculator.service.impl;

import com.example.calculator.exception.DivideZero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {

    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @Test
    void plus() {

        // дано
        int num1 = 10;
        int num2 = 2;
        int expectedResult = 12;

        // тест
        Integer actualResult = calculatorService.plus(num1, num2);

        // результат
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void minus() {
        // дано
        int num1 = 10;
        int num2 = 2;
        int expectedResult = 8;

        // тест
        Integer actualResult = calculatorService.minus(num1, num2);

        // результат
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void multiply() {
        // дано
        int num1 = 10;
        int num2 = 2;
        int expectedResult = 20;

        // тест
        Integer actualResult = calculatorService.multiply(num1, num2);

        // результат
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void divide() {
        // дано
        int num1 = 10;
        int num2 = 2;
        int expectedResult = 5;

        // тест
        Integer actualResult = calculatorService.divide(num1, num2);

        // результат
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void divideIfNum2Is0() {
        // дано
        int num1 = 10;
        int num2 = 0;

        // результат
        Assertions.assertThrows(DivideZero.class, () -> calculatorService.divide(num1, num2));
    }
}