package chapter2.abstraction.v2;

import chapter2.abstraction.v2.Cat;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.exist();
        cat.makeSound();
        cat.scratch();
    }
}
