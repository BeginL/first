package lt.vcd.homework7;

/** Class called Point in a 2D space */
public class Point {
    /** Horizontal coordinate point */
    private int x;

    /** Vertical coordinate point */
    private int y;

    /** Creates point with given coordinates (constructor) */
    public Point(int x, int y)
    {this.x = x;
    this.y = y;}

    /** Returns coordinate getX */
    public int getX() {
        return x;
    }
    /** Returns coordinate getY */
    public int getY() {
        return y;
    }

    /** Sets new coordinate setX */
    public void setX(int x) {
        this.x = x;
    }

    /** Sets new coordinate SetY */
    public void setY(int y) {
        this.y = y;
    }
    /** Returns distanceFromOrigin (0, 0) */
    public double distanceFromOrigin() {
        return Math.sqrt((double) x * x + (double) y * y);
    }

    /** Creates an additional method void translate()(int dx, int dy) that moves the point by dx and dy units */
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    /** Create a toString() method that represents the point's location in the format [x;y] */
    @Override
    public String toString() {
        return "[" + x + ";" + y + "]";
    }

    /** returns the distance(Point p) */
    public double distance(Point p) {
        double dx = (double) x - p.x;
        double dy = (double) y - p.y;
        return Math.sqrt(dx * dx + dy *dy);
    }

    /** Add a method setLocation(int x, int y) and updates the coordinates of the current point */
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
