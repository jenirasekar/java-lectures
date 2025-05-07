import java.util.Scanner;

public class NullPointTest {
    public static void main(String[] args) {
        Scanner sc = null;

        System.out.println("Please input a number: ");
        int num = sc.nextInt();
    }
}
