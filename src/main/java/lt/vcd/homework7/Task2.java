package lt.vcd.homework7;

public class Task2 {
    public static void main(String[] args) {
        Line line = new Line(new Point(0, 0), new Point(3, 4));

        System.out.println(line);  //[0;0] -> [3;4]
        System.out.println(line.length());  // 5.0

        Line defaultLine = new Line();
        System.out.println(defaultLine.length()); // 0.0

        defaultLine.setP2(new Point(0, 6));
        System.out.println(defaultLine.length()); // 6.0
    }
}
