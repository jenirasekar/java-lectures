import  java.util.Scanner;

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
//        create a scanner object
        Scanner input = new Scanner(System.in);

//        prompt a user to enter a radius
        System.out.print("Please enter a radius ");
        double radius = input.nextDouble();

        double area = radius * radius * 3.14159;

        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
