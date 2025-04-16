import java.util.Scanner;

public class TestCalculateBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter your weight in kg: ");
        double weight = input.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = input.nextDouble();

        CalculateBMI person = new CalculateBMI(name, age, weight, height);

        System.out.println("\nBMI results for " +  name + ":");
        System.out.println("BMI: " + String.format("%.2f", person.getBMI()));
        System.out.println("Status: " + person.getStatus());
    }
}
