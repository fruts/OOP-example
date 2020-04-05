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
        System.out.println("Фигура: " + getName() + ", " + "площадь: " + getArea() + "кв. ед., " + "радиус: " + getRadius());
    }
}
