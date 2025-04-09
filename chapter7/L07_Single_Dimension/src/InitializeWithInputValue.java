import java.util.Scanner;

public class InitializeWithInputValue {
    public static void main(String[] args) {
        // initializing array with user input
        int[] userValues = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Please input 5 int elements");
        for (int i = 0; i < userValues.length; i++) {
            userValues[i] = input.nextInt();
        }

        // printing the array
        for (int i = 0; i < userValues.length; i++) {
            System.out.print(userValues[i] + " ");
        }

        // summing the array
        int total = 0;
        for (int i = 0; i < userValues.length; i++) {
            total = total + userValues[i];
        }
        System.out.println("The sum of userValues is " + total);

        // finding the largest of array
        int max = 0;
        for (int i = 0; i < userValues.length; i++) {
            if (max < userValues[i]) {
                max = userValues[i];
            }
        }
        System.out.println("The largest of userValues is " + max);
    }
}
