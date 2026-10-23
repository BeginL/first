package lt.vcd.homework4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int evenCount = 0;
        int oddCount = 0;

        do {System.out.println("please enter an integer number (on 0 to stop): ");
            number = input.nextInt();

            if (number != 0) {
                if (number % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        } while (number != 0);

        System.out.println("The total number of even numbers: " + evenCount);
        System.out.println("The total number of odd numbers: " + oddCount);
    }
}
