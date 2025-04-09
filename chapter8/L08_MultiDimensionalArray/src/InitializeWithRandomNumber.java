public class InitializeWithRandomNumber {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = (int) (Math.random() * 100);
            }
        }
        System.out.println("OK");

        // print the array
        for (int row = 0; row < matrix.length; row++){
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }

        // sum the array
        int total = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                total += matrix[row][col];
            }
        }
        System.out.println("Sum of the array is " + total);
    }
}
