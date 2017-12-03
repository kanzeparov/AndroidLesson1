package example.examplejava.Java;

/**
 * Created by Franck on 01.12.2017.
 */

public class Методы {

    static int sum(int a, int b){
        int x;
        x = a + b;
        return x;
    }

    public static void main(String[] args) {
        Point p = new Point();
        System.out.println(sum(4,5));
    }

}
