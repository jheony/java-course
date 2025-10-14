package chapter2.polymorphism;

public class Main {
    public static void main(String[] args) {
        // 다형성 활용
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        animal1.exist();
        animal1.makeSound();

        animal2.exist();
        animal2.makeSound();
    }
}
