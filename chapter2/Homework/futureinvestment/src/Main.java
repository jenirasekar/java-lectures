import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double investmentAmount;
        double monthlyInterestRate;
        double annualInterestRate;
        int numberOfYears;
        double futureInvestmentValue;

        System.out.print("Enter investment amount: ");
        investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate: ");
        annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years: ");
        numberOfYears = input.nextInt();

        // convert annual interest rate to monthly interest rate in percent
        monthlyInterestRate = (annualInterestRate / 100) / 12;

        futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);

        // using formatter to round the value and displays two decimal places
        System.out.print("Accumulated value is: " + String.format("%.2f", futureInvestmentValue));
    }
}
