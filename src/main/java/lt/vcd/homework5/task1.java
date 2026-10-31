package lt.vcd.homework5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("data.txt"));

        int n = input.nextInt();
        int[] radii = new int[n];

        for (int i= 0; i < n; i++) {
            radii[i] = input.nextInt();
        }
        int largest = radii[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (radii[i] > largest) {
                largest = radii[i];
                count = 1;
            } else if (radii[i] == largest) {
                count++;
            }
        }
        System.out.println(largest + " - " + count);
    }
}
