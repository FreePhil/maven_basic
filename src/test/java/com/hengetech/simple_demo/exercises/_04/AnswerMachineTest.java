package com.hengetech.simple_demo.exercises._04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AnswerMachineTest {

    @ParameterizedTest
    @CsvSource({
            "0, 'en', 'Sunday'",
            "3, 'en', 'Wednesday'",
            "1, 'zh', '星期一'",
            "4, 'zh', '星期四'",
            "2, 'jp', '火曜日'",
            "5, 'jp', '金曜日'"
    })
    public void testGetName(int weekday, String language, String expected) {
        // Arrange
        //
        AnswerMachine machine = new AnswerMachine("en");

        // Act
        //
        String result = machine.getName(weekday);

        // Assert
        //
        Assertions.assertEquals(expected, result);
    }
}
