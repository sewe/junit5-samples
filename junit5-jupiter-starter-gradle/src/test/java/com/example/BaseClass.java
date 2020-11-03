package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

abstract class BaseClass {

    @Test
    void test(TestInfo testInfo) {
        String actualName = testInfo.getTestClass().get().getName();
        Assertions.assertTrue(actualName.matches("com.example.Example[123]Test"), actualName);
    }

    @Nested
    class NestedClass {

        @Test
        void nestedTest(TestInfo testInfo) {
            String actualName = testInfo.getTestClass().get().getName();
            Assertions.assertTrue(actualName.matches("com.example.Example[123]Test\\$NestedClass"), actualName);
        }
    }
}
