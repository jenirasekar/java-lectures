import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();

        cities.add("Linhai");
        cities.add("Jiaojiang");
        cities.add("Huangyang");
        cities.add("Luqiao");

        System.out.println("The size of the array list is " + cities.size());
        System.out.println("Luqiao is in the cities: " + cities.contains("Luqiao"));
    }
}
