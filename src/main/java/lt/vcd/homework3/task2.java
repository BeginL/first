package lt.vcd.homework3;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a positive number: ");
        number = scanner.nextInt();

        findEven(number);

    }

    public static void findEven(int number) {
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println();
        System.out.println("Count: " + count);
    }
}

