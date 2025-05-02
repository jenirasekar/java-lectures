public class Triangle extends GeometricObject{
    private double side1 = 1.0, side2 = 1.0, side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double side1() {
        return side1;
    }

    public double side2() {
        return side2;
    }

    public double side3() {
        return side3;
    }

    public double getArea() {
        return (side1 * side2) / side3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
