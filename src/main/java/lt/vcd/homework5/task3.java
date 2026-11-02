package lt.vcd.homework5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("pažymys.txt"));

        int subjects = input.nextInt();
        int students = input.nextInt();

        int[][] grades = new int[students][subjects];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < subjects; j++) {
                grades[i][j] = input.nextInt();
            }
        }
        input.close();
        int[] sums = new int[students];
        boolean[] visited = new boolean[subjects];

        int total = 0;
        int highestsum = 0;
        boolean[] haslowgrade = new boolean[students];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < subjects; j++) {
                sums[i] += grades[i][j];

                if (grades[i][j] < 5) {
                    haslowgrade[i] = true;
                }
            }
            total += sums[i];

            if (i == 0 || sums[i] > highestsum) {
                highestsum = sums[i];
            }
        }
        System.out.println("Student averages: ");
        for (int i = 0; i < students; i++) {
            double average = (double) sums[i] / subjects;
            System.out.println(average);
        }
        double groupAverage = (double) total / students / subjects;

        System.out.println("group Average:");
        System.out.println(groupAverage);
        System.out.println("Highest-performing student: ");

        for (int i = 0; i < students; i++) {
            if (sums[i] == highestsum) {
                System.out.println((i + 1) + " ");
            }
        }
        System.out.println();
        System.out.println("Students with at least one grade below 5: ");

        boolean found = false;
        for (int i = 0; i < students; i++) {
            if (haslowgrade[i]) {
                System.out.println((i + 1) + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("None");
        }
        System.out.println();

    }

}
