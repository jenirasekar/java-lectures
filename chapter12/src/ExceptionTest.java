import java.util.Scanner;

public class ExceptionTest {
    public static void setRadius(double radius) throws IllegalArgumentException {
        if (radius <= 0) {
            throw new IllegalArgumentException("radius cannot be less than or equals to zero");
        } else {
            System.out.println("set radius to" + radius);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();
        try {
            setRadius(radius);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
