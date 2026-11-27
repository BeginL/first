package lt.vcd.homework9.task2;

import java.io.File;
import java.io. FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        List<Double> temperatures = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File("temperatures.txt"))) {
            scanner.useLocale(Locale.US);

            while (scanner.hasNext()) {
                if (!scanner.hasNextDouble()) {
                    System.out.println("Invalid temperature: " + scanner.next());
                    return;
                }
                temperatures.add(scanner.nextDouble());
            }
        } catch (FileNotFoundException e) {
           System.out.println("Could not open temperatures.txt");
           return;
        }
        if (temperatures.isEmpty()) {
            System.out.println("No temperature readings was found.");
            return;
        }
        if (temperatures.isEmpty()) {
            System.out.println();
        }
        double max = Collections.max(temperatures);
        double min = Collections.min(temperatures);

        double sum = 0;
        for (double temperature : temperatures) {
            sum += temperature;
        }
        double average = sum / temperatures.size();

        System.out.println("Maximum temperature: " + max);
        System.out.println("Minimum temperature: " + min);
        System.out.printf(Locale.US,"Average temperature: %.2f%n", average);
    }
}
