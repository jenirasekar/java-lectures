import java.util.Scanner;

public class UseBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Please input name: ");
        String name = input.nextLine();

        System.out.printf("Please input weight in kg: ");
        double weight = input.nextDouble();

        System.out.printf("Please input height in meter: ");
        double height = input.nextDouble();

        BMI bmi = new BMI(name, weight, height);
        System.out.println("-------------------");
        System.out.println("Hello, " + bmi.getName() +
                ", your BMI is " + bmi.getBMI() +
                ", you are " + bmi.getStatus());
    }
}
