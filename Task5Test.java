import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class Task5Test {
    @Test
    public void testCalculate() {
        assertEquals(9.0, Task5.calculate(new double[]{2, 3}), 0.0001);
    }

    @Test
    public void testIsValid() {
        assertTrue(Task5.isValid(5));
        assertFalse(Task5.isValid(-1));
    }
}
