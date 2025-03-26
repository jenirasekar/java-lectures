public class TestMax {
    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }
        return result;
    }

    public static double max(double num1, double num2) {
        System.out.println("This is the double version of max");
        double result;
        if (num1 > num2){
            result = num1;
        } else {
            result = num2;
        }
        return result;
    }

    public static void main(String[] args) {
        int i = 98;
        int j = 45;

        int k = max(i, j);
        System.out.printf("The max value between " + i + " and " + j + " is " + k);
    }
}
