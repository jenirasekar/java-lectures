public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(10);

        circle.setColor("Red");
        circle.setFilled(true);

        System.out.printf("The color of the circle is " + circle.getColor()
        + " the area of the circle is " + circle.getArea());
    }
}
