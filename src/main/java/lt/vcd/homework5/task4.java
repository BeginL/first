package lt.vcd.homework5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("matrixas.txt"));
        int n = sc.nextInt();
        int [][]  matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        for (int i = 0; i < n; i++) {
            matrix[i][i] = 0;
            matrix[n-i-1][i] = 0;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > 0) {
                    System.out.print(" ");
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
