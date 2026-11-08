package lt.vcd.homework6;

import java.util.Scanner;

public class task3 {
    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        int onesPlaceValue = n % 10;
        int trimmedItems = n / 10;
        int sumofRemainingItems = sumDigits(trimmedItems);
        return onesPlaceValue + sumofRemainingItems;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int x = sc.nextInt();

        if (x < 0) {
            System.out.println("Invalid natural number");
        } else {
            System.out.println("sum of digits: " + sumDigits(x));
        }
    }
}
