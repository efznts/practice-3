import java.util.Scanner;

public class Task2 {
    public static int check(int[] a) {
        for (int i = 1; i < a.length; i++) {
            boolean prevEven = a[i - 1] % 2 == 0;
            boolean curEven = a[i] % 2 == 0;
            if (prevEven == curEven) {
                return i + 1;
            }
        }
        return 0;
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
        System.out.println(check(a));
    }
}
