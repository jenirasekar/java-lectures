public class InitializeWithRandomValues {
    public static void main(String[] args) {
        // initializing array with user input
        double[] myList = new double[10];
        for (int i = 0; i < myList.length; i++) {
            myList[i] = Math.random();
        }

        // printing the array
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
        }

        // summing the array
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total = total + myList[i];
        }
        System.out.println();
        System.out.println("The sum of myList is " + total);

        // finding the largest of array
        double max = 0;
        for (int i = 0; i < myList.length; i++) {
            if (max < myList[i]) {
                max = myList[i];
            }
        }
        System.out.println("The largest of userValues is " + max);
    }
}
