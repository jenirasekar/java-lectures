import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("PLease input your weight in kilogram");
        double weight = input.nextDouble();

        System.out.println("Please input your height in meter");
        double height = input.nextDouble();

        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println("You are underweight");
        } else if (bmi < 25) {
            System.out.println("You are normal");
        } else if (bmi < 30) {
            System.out.println("You are overweight");
        } else {
            System.out.println("You are obese");
        }
    }
}
