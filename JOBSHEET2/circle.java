package JOBSHEET2;

public class circle {

    private double radius;

    // Konstruktor (+Circle(radius : double))
    public circle(double radius) {
        this.radius = radius;
    }

    // Method untuk menghitung luas (+area() : double)
    public double area() {
        return Math.PI * radius * radius;
    }

    // Method untuk menghitung keliling (+circumference() : double)
    public double circumference() {
        return 2 * Math.PI * radius;
    }
}