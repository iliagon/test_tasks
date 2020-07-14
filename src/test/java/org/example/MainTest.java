package org.example;

import static org.example.Main.sortStringAccordingCustomAlphabetOrder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MainTest {

    @ParameterizedTest
    @CsvSource({
            "cba, abcde, abc",
            "ccbaa, abcde, aabcc",
            "Azcba1, 123AaBbCcZz, 1Aabcz"
    })
    void testSortStringAccordingCustomAlphabetOrder(String sourceString, String alphabet, String expectedResult) {
        String actualResult = sortStringAccordingCustomAlphabetOrder(sourceString, alphabet);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
