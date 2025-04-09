import java.util.Scanner;

public class InitializeWithInput {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = input.nextInt();
            }
        }
        System.out.printf("OK");
    }
}
