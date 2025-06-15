import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Jenira");
        names.add("Sekar");
        names.add("Azzahra");

        System.out.println("First name: " + names.get(0));
        names.remove(1);

        for (String name : names) {
            System.out.println(name
            );
        }
    }
}
