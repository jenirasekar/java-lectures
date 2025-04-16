public class TestCircle {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        Circle yourCircle = new Circle(100);

        System.out.println("The radius of my circle is " + myCircle.radius);
        System.out.println("The area of my circle is " + myCircle.getArea());

        System.out.println("The radius of your circle is " + yourCircle.radius);
        System.out.println("The area of your circle is " + yourCircle.getArea());
    }
}
