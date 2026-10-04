package lt.vcd.homework2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int h = sc.nextInt();

        System.out.print("Enter minutes: ");
        int m = sc.nextInt();

        System.out.print("Enter seconds: ");
        int s = sc.nextInt();

        s = s + 1;

        if (s == 60) {
            s = 0;
            m = m + 1;
        }

        if (m == 60) {
            m = 0;
            m = m + 1;
        }

        if (h == 24) {
            h = 0;
        }

        System.out.println(h + " " + m + " " + s);

        sc.close();''
    }
}
