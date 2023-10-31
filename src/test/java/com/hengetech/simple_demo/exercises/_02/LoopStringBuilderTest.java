package com.hengetech.simple_demo.exercises._02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class LoopStringBuilderTest {

    @ParameterizedTest
    @CsvSource({
            "0, ''",
            "1, 'loop1'",
            "2, 'loop1,loop2'",
            "5, 'loop1,loop2,loop3,loop4,loop5'",
            "10, 'loop1,loop2,loop3,loop4,loop5,loop6,loop7,loop8,loop9,loop10'"
    })
    public void testBuild(int number, String expected) {
        // Arrange
        //
        StringBuilder builder = new LoopStringBuilder();

        // Act
        //
        String result = builder.concatenate(number);

        // Assert
        //
        Assertions.assertEquals(expected, result);
    }
}
