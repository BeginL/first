package lt.vcd.homework3;

import java.util.Scanner;

public class task5 {
    public static void printHollowRect(int n, int m) {
        int i, j;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a height: ");
        int n = input.nextInt();

        System.out.print("enter a width: ");
        int m = input.nextInt();

        if (n >= 2 && m >= 2) {
            printHollowRect(n, m);
        } else {
            System.out.println("Height and width should start from 2!");
        }

        input.close();
    }
}

