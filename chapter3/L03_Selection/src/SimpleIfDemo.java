import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer");

        int radius = input.nextInt();

        if (radius >= 0) {
            double area = radius * radius * 3.1415926;
            System.out.println("The area for a circle of radius " + radius + " is " + area);
        } else {
            System.out.println("The radius is negative, please input again");
        }
    }
}
