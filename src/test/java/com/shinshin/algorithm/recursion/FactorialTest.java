package com.shinshin.algorithm.recursion;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.Assertions.*;

@Tag("model")
//@Disabled
class FactorialTest {

    @BeforeEach
    void setUp() {

    }

//    @Disabled
    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "shinshin")
    @EnabledOnJre(JRE.JAVA_8)
    void interactiveFactorial() {
    }

    @DisplayName("recursive")
    @EnabledOnOs(OS.WINDOWS)
    @Test
    void recursiveFactorial() {
        assertAll("Test Recursive",
                () -> assertAll("test1",
                        () -> assertTrue(true),
                        () -> assertFalse(false)
                        ),
                () -> assertAll("test2",
                        () -> assertEquals("a", "a", "test"),
                        () -> assertNotEquals(false, true, "failed")
                )
        );
    }
}