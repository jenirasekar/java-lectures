import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input seconds");
        int second = input.nextInt();
        int minute;
        int remaining_seconds;

        minute = second / 60;
        remaining_seconds = second % 60;

        System.out.println("The minutes of " + second + " second is " + minute
                + ", the remaining second is " + remaining_seconds);
    }
}
