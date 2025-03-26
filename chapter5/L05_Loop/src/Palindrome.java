import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Input a string");
        Scanner input = new Scanner(System.in);

        String s = input.next();

        int low = 0;
        int high = s.length() - 1;

        boolean isPalindrome = true;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                isPalindrome = false;
            }
            low++;
            high--;
        }
        if (isPalindrome) {
            System.out.println(s + " is palindrome");
        } else {
            System.out.println(s + " is not palindrome");
        }
    }
}
