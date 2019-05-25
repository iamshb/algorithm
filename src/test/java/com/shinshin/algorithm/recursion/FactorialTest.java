package com.shinshin.algorithm.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled
class FactorialTest {

    @BeforeEach
    void setUp() {

    }

    @Disabled
    @Test
    void interactiveFactorial() {
    }

    @DisplayName("recursive")
    @Test
    void recursiveFactorial() {
        assertAll("Test Recursive",
                () -> assertAll("test1",
                        () -> assertTrue(true),
                        () -> assertFalse(false)
                        ),
                () -> assertAll("test2",
                        () -> assertEquals(true, true, "test"),
                        () -> assertNotEquals(false, true, "failed")
                )
        );
    }
}