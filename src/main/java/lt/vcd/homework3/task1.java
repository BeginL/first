package lt.vcd.homework3;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int number = scanner.nextInt();

        for (int i = 1; i <=10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));

        }
        scanner.close();
    }
}
