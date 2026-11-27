package lt.vcd.homework8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Marta", 82),
                new Student("Jonas", 95),
                new Student("Ieva", 71),
                new Student("Tomas", 88)
        };
        Arrays.sort(students, (a, b) -> a.getName().compareTo(b.getName()));
        System.out.println("By name: " + Arrays.toString(students));

        Arrays.sort(students, (a, b) -> Integer.compare(b.getGrade(), a.getGrade()));
        System.out.println("By grade: " + Arrays.toString(students));
    }
}
