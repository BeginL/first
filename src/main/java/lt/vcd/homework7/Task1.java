package lt.vcd.homework7;

public class Task1 {
    public static void main(String[] args) {
        Point p = new Point(3, 4);
        System.out.println(p);  // [3;4]
        System.out.println(p.distanceFromOrigin());  // 5.0

        p.setX(5);
        p.setY(3);
        System.out.println(p.getX() + ", " + p.getY()); // 5, 3

        p.translate(2, 1);
        System.out.println(p);  // [7;4]

        Point q = new Point(4, 0);
        System.out.println(p.distance(q));  // 5.0

        p.setLocation(1, 2);
        System.out.println(p);  // [1;2]
    }
}
