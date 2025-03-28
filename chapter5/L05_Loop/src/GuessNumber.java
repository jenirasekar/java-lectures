import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 101);

        Scanner input = new Scanner(System.in);

        System.out.println("Guess the number between 0 and 100");
        int guess = -1;
        while (guess != number) {
            guess = input.nextInt();
            if (guess == number) {
                System.out.println("You guess the number right!");
            } else if (guess < number) {
                System.out.println(guess + " is too small");
            } else if (guess > number) {
                System.out.println(guess + " is too big");
            }
        }
    }
}
