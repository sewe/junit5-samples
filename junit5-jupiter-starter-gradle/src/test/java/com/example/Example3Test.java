package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class Example3Test extends BaseClass {

    @Nested
    class NestedClass extends BaseClass.NestedClass {

        @Test
        void additionalTest(TestInfo testInfo) {
            String actualName = testInfo.getTestClass().get().getName();
            Assertions.assertTrue(actualName.matches("com.example.Example3Test\\$NestedClass"), actualName);
        }
    }
}
