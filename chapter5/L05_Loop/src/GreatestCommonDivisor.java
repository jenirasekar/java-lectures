import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please input the fist number: ");
        int n1 = input.nextInt();

        System.out.println("Please input the second number: ");
        int n2 = input.nextInt();

        int gcd = 1; // common gcd
        int k = 2; // possible gcd
        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
            k++;
        }
        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
    }
}
