package lt.vcd.homework3;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        for (int number = 10; number <= 99; number++) {
            int tens = number / 10;
            int ones = number % 10;

            int reversed = ones * 10 + tens;

            if (ones == tens * 2 && reversed - number == 36) {
                System.out.println("Print the number that student though of: " + number);
            }
        }
    }
}
