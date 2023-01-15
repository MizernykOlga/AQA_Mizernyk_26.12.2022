package homework10;

/*
Транспонуйте матрицю M x N. Розміри M та N задаються з консолі.
Після введення повинні автоматично створюватися два масиви розміром M x N перший та N x M другий.
1 масив - заповнити рандомними числами.
2 масив - перекласти значення. Рядком 2го масиву, має бути стовпець 1го.
 */

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = 0;
        int n = 0;

        while (true) {
            System.out.println("Enter matrix row: ");
            if (scanner.hasNextInt()) {
                m = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Oops, not a number. Try again!");
                scanner.nextLine();
            }
        }

        while (true) {
            System.out.println("Enter matrix column: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Oops, not a number. Try again!");
                scanner.nextLine();
            }
        }
        scanner.close();

        int[][] array = new int[m][n];
        int[][] array2 = new int[n][m];

        //fill in with random numbers
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 101);
            }
        }

        System.out.println();
        System.out.println("Original array items:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        //transpose matrix creation
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array2[j][i] = array[i][j];
            }
        }
        System.out.println("Transpose matrix:");
        for (int[] r : array2) {
            System.out.println(Arrays.toString(r));
        }
    }
}