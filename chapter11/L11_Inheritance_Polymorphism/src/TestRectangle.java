public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(15, 19);

        rectangle.setColor("Blue");

        System.out.printf("The area of the rectangle is " + rectangle.getArea() +
                " the perimeter of the rectangle is " + rectangle.getPerimeter() +
                " the color of the rectangle is " + rectangle.getColor());
    }
}
