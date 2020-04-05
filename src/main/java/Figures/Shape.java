package Figures;

public class Shape {
    private String name;
    private String color;
    private double area;

    public Shape (String name, String color, double area) {
        this.name = name;
        this.color = color;
        this.area = area;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
