import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static int[] spiral(int[][] a) {
        int n = a.length;
        int[] result = new int[n * n];
        int k = 0;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (k < n * n) {
            for (int i = top; i <= bottom && k < n * n; i++) {     // вниз по левому столбцу
                result[k++] = a[i][left];
            }
            left++;
            for (int j = left; j <= right && k < n * n; j++) {     // вправо по нижней строке
                result[k++] = a[bottom][j];
            }
            bottom--;
            for (int i = bottom; i >= top && k < n * n; i--) {     // вверх по правому столбцу
                result[k++] = a[i][right];
            }
            right--;
            for (int j = right; j >= left && k < n * n; j--) {     // влево по верхней строке
                result[k++] = a[top][j];
            }
            top++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите нечётный порядок матрицы: ");
        int n = in.nextInt();
        int[][] a = new int[n][n];
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }
        System.out.println(Arrays.toString(spiral(a)));
    }
}
