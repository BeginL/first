package lt.vcd.homework2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the years for Olympics game: ");
        int year = sc.nextInt();

        if (year >= 1896 && (year - 1896) % 4 == 0) {
            int edition = (year - 1896) / 4 + 1;

            System.out.println(year + " is an Olympic year.");
            System.out.println("Edition numbers: " + edition);
        } else {
            System.out.println(year + " this is not an Olympic game years. ");
        }

        sc.close();
    }
}
