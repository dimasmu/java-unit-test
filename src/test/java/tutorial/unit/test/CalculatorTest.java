package tutorial.unit.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testAddSuccess() {
        var result = calculator.add(10, 10);

        assertEquals(20, result);
    }

    @Test
    public void testDivideSuccess() {
//      Jika ingin mencari tidak sama dengan bisa memakai assertNotEquals
        var result = calculator.divide(100, 10);
        assertEquals(10, result);
    }

    @Test
    public void testDivideFailed() {
//      jika ada throw errors pada codingan bisa memakai assertThrows
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(100, 0);
        });
    }

}
