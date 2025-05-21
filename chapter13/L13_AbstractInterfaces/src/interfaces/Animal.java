package interfaces;

public interface Animal {
    void makeSound();
    default void eat() {
        System.out.println("This animal eat foods");
    }
    static void sleep() {
        System.out.println("This animal is sleeping");
    }
}
