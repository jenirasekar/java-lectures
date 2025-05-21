package interfaces;

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
        cat.eat();
        Animal.sleep();
    }
}
