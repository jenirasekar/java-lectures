import java.util.ArrayList;
import java.util.Collections;

public class SortingListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers);
        Collections.reverse(numbers);
        System.out.println("Reversed: " + numbers);
    }
}
