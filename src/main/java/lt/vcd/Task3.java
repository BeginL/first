package lt.vcd;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1: ");
        int x1 = sc.nextInt();

        System.out.print("Enter y1: ");
        int y1 = sc.nextInt();

        System.out.print("Enter x2: ");
        int x2 = sc.nextInt();

        System.out.print("Enter y2: ");
        int y2 = sc.nextInt();

        int width = Math.abs(x2 - x1);
        int height = Math.abs(y1 - y2);

        int s = width * height;
        int p = 2 * (width + height);

        System.out.println("s = " + s);
        System.out.println("p = " + p);

        sc.close();
    }
}
