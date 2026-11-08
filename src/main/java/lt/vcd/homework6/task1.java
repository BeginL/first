package lt.vcd.homework6;

import java.util.Scanner;

public class task1 {
    public static int getArea(int length, int width) {
        return length * width;
    }
    public static double getArea(double length, double width) {
        return length * width;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integers side length: ");
        int length = sc.nextInt();
        int width = sc.nextInt();

        System.out.println("Area with int: " + getArea(length, width));

        System.out.print("Enter two integers two double side lengths: ");
        double doubleLength = sc.nextDouble();
        double doubleWidth = sc.nextDouble();

        System.out.println("Area with double: " + getArea(doubleLength, doubleWidth));
    }
}
