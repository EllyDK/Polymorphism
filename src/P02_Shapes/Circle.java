package P02_Shapes;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        super.setArea(calculateArea());
        super.setPerimeter(calculatePerimeter());
    }

    public final double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.sqrt(getRadius());
    }
}
