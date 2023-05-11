import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите целое число");

        Scanner in = new Scanner(System.in);
        int[] array = new int[in.nextInt()];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите значение массива");
            array[i] = in.nextInt();
        }
        Arrays.sort(array);
        for (int a : array) {
            System.out.println(a);
        }

        System.out.println("Введите целое количество строк");
        int x = in.nextInt();
        System.out.println("Введите целое количество столбцов");
        int y = in.nextInt();

        int[][] array1 = new int[x][y];
        System.out.println("Введите числа инициализации");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                array1[i][j] = in.nextInt();
            }
        }
        int result = 0;
        for (int[] arr : array1) {
            for (int a : arr) {
                result += a;
            }
        }
        System.out.println(result);

    }
}