package lt.vcd.homework6;

import java.util.Scanner;

public class task2 {
    public static boolean isLeap(int year) {
    return year % 400 == 0
            || (year % 4 == 0 && year % 100 != 0);
}

public static int getDays(int month, int year) {
    if (month == 2) {
        return isLeap(year) ? 29 : 28;
    }

    if (month == 4 || month == 6
            || month == 9 || month == 11) {
        return 30;
    }

    return 31;
}

public static boolean isValidDate(int year, int month, int day) {
    return year >= 1 && year <= 9999
            && month >= 1 && month <= 12
            && day >= 1 && day <= getDays(month, year);
}

public static void nextDate(int[] date) {
    date[0]++;

    if (date[0] > getDays(date[1], date[2])) {
        date[0] = 1;
        date[1]++;
    }

    if (date[1] > 12) {
        date[1] = 1;
        date[2]++;
    }
}

public static int numOfDays(
        int year_from, int month_from, int day_from,
        int year_to, int month_to, int day_to) {

    if (!isValidDate(year_from, month_from, day_from)
            || !isValidDate(year_to, month_to, day_to)) {
        throw new IllegalArgumentException("Invalid date.");
    }

    boolean reversed = year_from > year_to
            || (year_from == year_to && month_from > month_to)
            || (year_from == year_to && month_from == month_to
            && day_from > day_to);

    // Skaičiuojame nuo ankstesnės datos iki vėlesnės.
    int[] date;
    int[] end;

    if (reversed) {
        date = new int[] {day_to, month_to, year_to};
        end = new int[] {day_from, month_from, year_from};
    } else {
        date = new int[] {day_from, month_from, year_from};
        end = new int[] {day_to, month_to, year_to};
    }

    int count = 0;

    while (!(date[0] == end[0]
            && date[1] == end[1]
            && date[2] == end[2])) {
        nextDate(date);
        count++;
    }

    if (reversed) {
        return -count;
    }

    return count;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter start date (year month day): ");
    int yearFrom = sc.nextInt();
    int monthFrom = sc.nextInt();
    int dayFrom = sc.nextInt();

    System.out.print("Enter end date (year month day): ");
    int yearTo = sc.nextInt();
    int monthTo = sc.nextInt();
    int dayTo = sc.nextInt();

    if (isValidDate(yearFrom, monthFrom, dayFrom)
            && isValidDate(yearTo, monthTo, dayTo)) {

        int days = numOfDays(
                yearFrom, monthFrom, dayFrom,
                yearTo, monthTo, dayTo
        );

        System.out.println("Days between dates: " + days);
    } else {
        System.out.println("Invalid date.");
    }
}
}
