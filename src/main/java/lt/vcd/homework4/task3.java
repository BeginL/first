package lt.vcd.homework4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter file mame: ");
        String file = in.next();

        Scanner fIn = new Scanner(new File("duomenys.txt"));
        ;

        int n = fIn.nextInt();
        int count = 0;
        int i = 0;

        while (i < n) {
            int temp = fIn.nextInt();

            if (temp < 0) {
                count++;
            }
            i++;
        }
        if (count == 0) {
            System.out.println("No negative temperature is being recorded");
        } else {
            System.out.println("Days with negative temperature: " + count);
        }
    }
}
