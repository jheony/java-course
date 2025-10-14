package chapter2.interitance.abstractexample;

public class Main {
    public static void main(String[] args) {
        // 추상클래스는 직접 선언할 수 없음
//        Animal animal = new Animal();

        Cat cat = new Cat();
        cat.name = "cat";
        cat.sleep();
        cat.eat();

    }
}
