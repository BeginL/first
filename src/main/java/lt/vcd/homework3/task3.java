package lt.vcd.homework3;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int factorial = 1;
        for (int i= number; i > 0; i--) {
            factorial *= i;
        }

        if (number < 0 || number > 12) {
            System.out.println("Number must be between 0 & 12.");
            input.close();
            return;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
