package example.examplejava.Java;

/**
 * Created by Franck on 01.12.2017.
 */

class Point {
    private int x;
    public int y;

    Point() {
        this(0, 0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void printPoint() {
        System.out.println("(" + x + "," + y + ")");
    }
}