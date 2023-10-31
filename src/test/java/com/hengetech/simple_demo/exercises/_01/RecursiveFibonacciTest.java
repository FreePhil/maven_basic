package com.hengetech.simple_demo.exercises._01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RecursiveFibonacciTest {

    @ParameterizedTest
    @CsvSource({
        "0, 0",
        "1, 1",
        "2, 1",
        "5, 5",
        "10, 55"
    })
    public void testCompute(int number, int expected) {
        // Arrange
        //
        Fibonacci calculator = new RecursiveFibonacci();

        // Act
        //
        long result = calculator.compute(number);

        // Assert
        //
        Assertions.assertEquals(expected, result);
    }
}
