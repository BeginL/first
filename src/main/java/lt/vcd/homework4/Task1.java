package lt.vcd.homework4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Price of the laptop(p): ");
        double p = input.nextDouble();

        System.out.print("Current savings(s): ");
        double s = input.nextDouble();

        System.out.print("Weekly savings(m): ");
        double m = input.nextDouble();

        int k = 0;

        if (m <= 0 && s < p) {
            System.out.println("Weekly savings should be positive!");
        } else {
            while (s < p) {
                s += m;
                k++;
            }
            System.out.println("k = " + k);
        }
    }
}
