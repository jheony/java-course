package chapter2.clazz;

public class Person {
    // 1. 속성
    String name;
    int age;
    String address;

    // 2. 생성자
    public Person(){};
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 3. 기능(메서드)
    int sum(int value1, int value2) {
        int result = value1 + value2;
        return result;
    }


}
