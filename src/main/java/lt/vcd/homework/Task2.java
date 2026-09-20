package lt.vcd.homework;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter room length: ");
        int length = sc.nextInt();

        System.out.print("Enter room width: ");
        int width = sc.nextInt();

        System.out.print("Enter price per square meter: ");
        double price = sc.nextDouble();

        int area = length * width;
        double totalCost = area * price * 1.05;

        System.out.printf("Total cost: %.2f%n", totalCost);

        sc.close();

    }
}
