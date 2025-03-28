import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        double width = 10;
        double height = 5;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double xAxis = input.nextDouble();
        double yAxis = input.nextDouble();

        // to check whether the point is in the rectangle by its the negative and positive range
        if (xAxis <= -width / 2 && xAxis <= width &&
                yAxis <= -height / 2 && yAxis <= height) {
            System.out.println("Point " + "(" + xAxis + ", " + yAxis +
                    ")" + " is in rectangle");
        } else {
            System.out.println("Point " + "(" + xAxis + ", " + yAxis +
                    ")" + " is not in the rectangle");
        }
    }
}
