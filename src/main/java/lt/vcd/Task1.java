package lt.vcd;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.print("Enter average books per month: ");
        int v = sc.nextInt();

        System.out.print("Enter average visitors per year: ");
        int n = sc.nextInt();

        int total = v * 12 * n;
        System.out.println("Books read per year: " + total);


        sc. close();


    }
}
