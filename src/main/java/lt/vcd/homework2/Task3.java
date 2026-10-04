package lt.vcd.homework2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int year;

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter year: ");
        year = scn.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " : This is a leap year");
        } else {
            System.out.println(year + " : This is not a leap year");
        }

        scn.close();

    }
}
