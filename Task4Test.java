import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Task4Test {
    @Test
    public void testThree() {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        assertArrayEquals(new int[]{1, 4, 7, 8, 9, 6, 3, 2, 5}, Task4.spiral(a));
    }

    @Test
    public void testOne() {
        assertArrayEquals(new int[]{5}, Task4.spiral(new int[][]{{5}}));
    }
}
