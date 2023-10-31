package com.hengetech.simple_demo.exercises._03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GregorianLeapYearCalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "1999, false",
            "1996, true",
            "2024, true",
            "1700, false",
            "2000, true",
            "3000, false"
    })
    public void testIsLeap(long year, boolean expected) {

        // Arrange
        //
        LeapYearCalculator calculator = new GregorianLeapYearCalculator();

        // Act
        //
        boolean result = calculator.isLeap(year);

        // Assert
        //
        Assertions.assertEquals(expected, result);
    }
}
