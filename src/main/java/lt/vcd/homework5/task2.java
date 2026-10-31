package lt.vcd.homework5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("residents.txt"));

        int n = input.nextInt();
        int[] residents = new int[n];

        for (int i = 0; i < n; i++) {
            residents[i] = input.nextInt();
        }
        input.close();

        int leftResidents = 0;
        int rightResidents = 0;
        int leftHouses = 0;
        int rightHouses = 0;

        for (int i = 0; i < n; i++){
            int houseNumber = i + 1;

            if (houseNumber % 2 != 0) {
                leftResidents += residents[i];
                leftHouses++;
            } else {
                rightResidents += residents[i];
                rightHouses++;
            }
        }
        int total = leftResidents + rightResidents;

        System.out.println("Total residents: " + total);
        System.out.println("Residents on the left: " + leftResidents);
        System.out.println("Residents on the right: " + rightResidents);

        if (leftHouses > 0) {
            double averageLeft = (double) leftResidents / leftHouses;
            System.out.println("Average per house on the left: " + averageLeft);
        } else {
            System.out.println("Average per house on the left: N/A ");
        }
        if (rightHouses > 0) {
            double averageRight = (double) rightResidents / rightHouses;
            System.out.println("Average per house on the right: " + averageRight);
        } else {
            System.out.println("Average per house on the right: N/A ");
        }
    }
}
