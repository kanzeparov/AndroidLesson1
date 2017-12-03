package example.examplejava.Java.extendss;

/**
 * Created by Franck on 01.12.2017.
 */

class Circle extends Shape {  // ключевое слово "extends" означает наследование

    private static final double PI = Math.PI;   // константа
    private double diameter; //любое число, представляющее диаметр этого круга

    public Circle(double diameter) { // конструктор
        this.diameter = diameter;
    }

    public double area(){
        double radius = diameter / 2.0;
        return PI * radius * radius;
    }
}
