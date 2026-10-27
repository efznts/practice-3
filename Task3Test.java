import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Task3Test {
    @Test
    public void testEvenSize() {
        assertArrayEquals(new int[]{20, 40, 10, 30}, Task3.rewrite(new int[]{10, 20, 30, 40}));
    }

    @Test
    public void testOddSize() {
        assertArrayEquals(new int[]{2, 4, 1, 3, 5}, Task3.rewrite(new int[]{1, 2, 3, 4, 5}));
    }
}
