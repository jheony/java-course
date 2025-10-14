package chapter2.capsulation;

public class Main {
    public static void main(String[] args) {
        // 생성자 호출
        Person person = new Person("gggg");

        // 인스턴스 변수 접근
        person.name = "g";
//        person.secret = "shhhh";

        // 인스턴스 메서드 접근
        person.methodA();
//        person.methodB();

        String name = person.getName();
        System.out.println(name);

        person.setName("Steeve");


    }
}
