import java.util.Scanner;

public class Main {
    public static int[] locateLargest(double[][] a) {
        int[] location = new int[2];
        double max = a[0][0];
        for (int rows = 0; rows < a.length; rows++) {
            for (int cols = 0; cols < a[0].length; cols++) {
                if (a[rows][cols] > max) {
                    max = a[rows][cols];
                    location[0] = rows;
                    location[1] = cols;
                }
            }
        }
        return location;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows and cols of the array: ");
        int rows = input.nextInt();
        int cols = input.nextInt();

        double[][] array = new double[rows][cols];

        System.out.println("Enter the array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = input.nextDouble();
            }
        }
        int[] location = locateLargest(array);
        System.out.println("The location of the largest element is at (" + location[0] + ","
        + location[1] + ")");
    }
}