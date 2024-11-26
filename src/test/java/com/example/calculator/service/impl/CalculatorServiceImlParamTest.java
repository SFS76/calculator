package com.example.calculator.service.impl;

import com.example.calculator.exception.DivideZero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


public class CalculatorServiceImlParamTest {

    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    private static Stream<Arguments> argumentProvider() {
        return Stream.of(
                Arguments.of(6, 2),
                Arguments.of(6, 0),
                Arguments.of(0, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentProvider")
    void plus(int num1, int num2) {
        // дано
        int expectedResult = num1 + num2;

        // тест
        Integer actualResult = calculatorService.plus(num1, num2);

        // результат
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("argumentProvider")
    void minus(int num1, int num2) {
        // дано
        int expectedResult = num1 - num2;

        // тест
        Integer actualResult = calculatorService.minus(num1, num2);

        // результат
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("argumentProvider")
    void multiply(int num1, int num2) {
        // дано
        int expectedResult = num1 * num2;

        // тест
        Integer actualResult = calculatorService.multiply(num1, num2);

        // результат
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("argumentProvider")
    void divide(int num1, int num2) {
        if (num2 == 0) {
            Assertions.assertThrows(DivideZero.class, () -> calculatorService.divide(num1, num2));
        } else {
            // дано
            int expectedResult1 = num1 / num2;

            // тест
            Integer actualResult = calculatorService.divide(num1, num2);

            // результат
            Assertions.assertEquals(expectedResult1, actualResult);
        }
    }
}
