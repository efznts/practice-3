import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    // номера элементов считаются с 1: A1, A2, A3 ...
    public static int[] rewrite(int[] a) {
        int[] b = new int[a.length];
        int k = 0;
        for (int i = 1; i < a.length; i += 2) {   // чётные номера: A2, A4, ...
            b[k] = a[i];
            k++;
        }
        for (int i = 0; i < a.length; i += 2) {   // нечётные номера: A1, A3, ...
            b[k] = a[i];
            k++;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = in.nextInt();
        int[] a = new int[n];
        System.out.print("Введите элементы: ");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(rewrite(a)));
    }
}
