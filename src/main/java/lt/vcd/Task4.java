package lt.vcd;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("side of triangle a: ");
        double a = sc.nextDouble();

        System.out.print("side of triangle b: ");
        double b = sc.nextDouble();

        System.out.print("side of triangle c: ");
        double c = sc.nextDouble();

        if (a + b >= c && a + c >= b && b + c >= a) {
            double halfP = (a + b + c) / 2;
            double area = Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));

            System.out.println("Triangle area: " + area);
        } else {
            System.out.println("These sides cannot form a triangle.");
        }

        sc.close();
    }
}
