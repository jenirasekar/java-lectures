public class TestTriangle {
    public static void main(String[] args) {
    Triangle triangle = new Triangle(1, 1.15, 1);
    triangle.setColor("yellow");
    triangle.setFilled(true);

    System.out.println("The area is " + triangle.getArea());
    System.out.println("The perimeter is "
                + triangle.getPerimeter());
    System.out.println("The triangle is filled: " + triangle.isFilled());
    System.out.println(triangle);
    }
}
