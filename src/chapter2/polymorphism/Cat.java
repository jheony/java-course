package chapter2.polymorphism;

public class Cat implements Animal {

    @Override
    public void exist() {
        System.out.println("고양이가 존재합니다.");
    }

    @Override
    public void makeSound() {
        System.out.println("야오오오오옹");

    }

    public void scratch() {
        System.out.println("긁기");

    }
}
