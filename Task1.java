import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static int[] fibonacci(int n) {
        int[] f = new int[n];
        f[0] = 1;
        f[1] = 1;
        for (int k = 2; k < n; k++) {
            f[k] = f[k - 2] + f[k - 1];
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите N (> 2): ");
        int n = in.nextInt();
        System.out.println(Arrays.toString(fibonacci(n)));
    }
}
