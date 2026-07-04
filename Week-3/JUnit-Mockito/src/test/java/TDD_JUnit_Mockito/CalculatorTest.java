package TDD_JUnit_Mockito;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("Setup completed.");
    }

    @AfterEach
    void tearDown() {
        calculator = null;
        System.out.println("Cleanup completed.");
    }

    @Test
    void testAddition() {
        assertEquals(15, calculator.add(10, 5));
    }

    @Test
    void testSubtraction() {
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    void testMultiplication() {
        assertEquals(50, calculator.multiply(10, 5));
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.divide(10, 5));
    }

    @Test
    void testNotEquals() {
        assertNotEquals(20, calculator.add(10, 5));
    }

    @Test
    void testTrue() {
        assertTrue(calculator.add(2, 3) == 5);
    }

    @Test
    void testFalse() {
        assertFalse(calculator.subtract(10, 5) == 10);
    }

    @Test
    void testNull() {
        Object obj = null;
        assertNull(obj);
    }

    @Test
    void testNotNull() {
        assertNotNull(calculator);
    }

    @Test
    void testException() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }
}