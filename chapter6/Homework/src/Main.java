import java.util.Scanner;

public class Main {
    // method to calculate future investment value
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt user for input
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate (in percentage): ");
        double annualInterestRate = input.nextDouble();

        // convert annual interest rate to monthly interest rate
        double monthlyInterestRate = annualInterestRate / 12 / 100;

        // display table header
        System.out.printf("%-5s %15s%n", "Years", "Future Value");

        // compute and display future values for years 1 to 30
        for (int year = 1; year <= 30; year++) {
            double futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, year);
            System.out.printf("%-5d %15.2f%n", year, futureValue);
        }

        input.close();
    }
}