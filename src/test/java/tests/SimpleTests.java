package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class SimpleTests {
        int a = 5;
        int b = 10;
        @Test
        @Tag("simple_tests")
        void positiveTest1() {
            assertEquals(a * b, 50);
        }
        @Tag("simple_tests")
        @Test
        void negativeTest() {
        assertEquals(a / b, 0.5);
        }



}
