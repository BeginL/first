package lt.vcd.homework3;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (at least with 2): ");
        int n = input.nextInt();

        if (n < 2) {
            System.out.println("Number must be at least 2.");
            input.close();
            return;
    }

    for (int number = 2; number <= n; number++) {
        boolean isPrime = true;

        for (int divisor = 2; divisor < number; divisor++) {
            if (number % divisor == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.print(number + " ");
        }
    }
    System.out.println();
    input.close();
    }
}
