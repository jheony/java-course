package chapter2.capsulation;

public class Person {
    // 속성
    public String name;
    private String secret;

    // 생성자
    Person(String name ) {
        this.name = name;
    }

    // 기능
    public void methodA() { }
    private void methodB() { }

    // 게터

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
