package Figures;

import java.sql.SQLOutput;

public class Circle extends Shape implements Drawable{
    private double radius;

     public Circle (String color, double radius) {
         super("круг", color, Math.PI * radius * radius);
         this.radius = radius;
     }

    public double getRadius() {
        return radius;
    }

    public void draw() {
        System.out.printf("Фигура: %s, площадь: %.2f кв.ед., радиус: %.2f ед., цвет: %s", getName(), getArea(), getRadius(), getColor());
    }
}
