import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Task1Test {
    @Test
    public void testThree() {
        assertArrayEquals(new int[]{1, 1, 2}, Task1.fibonacci(3));
    }

    @Test
    public void testSeven() {
        assertArrayEquals(new int[]{1, 1, 2, 3, 5, 8, 13}, Task1.fibonacci(7));
    }
}
