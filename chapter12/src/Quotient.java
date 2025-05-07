import java.util.Scanner;

public class Quotient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 =  sc.nextInt();
        int num2 =  sc.nextInt();

        try {
            System.out.println(num1 + " / " + num2 + " is " + (num1 / num2));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divided by 0");
        }
    }
}
