import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task2Test {
    @Test
    public void testAlternating() {
        assertEquals(0, Task2.check(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void testBroken() {
        // 4 и 6 оба чётные, нарушает 3-й элемент
        assertEquals(3, Task2.check(new int[]{1, 4, 6, 7}));
    }
}
