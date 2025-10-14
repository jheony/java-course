package chapter2.clazz;

public class Main {
    public static void main(String[] args) {
        Person personA = new Person("steve", 10);
        Person personB = new Person("gygim", 44);

        // 속성에 직접 접근
//        System.out.println("설정 전 personA 이름: " + personA.name);
//        System.out.println("설정 전 personB 이름: " + personB.name);
//        personA.name = "gygim";
//        personB.name = "Steve";
//        System.out.println("설정 후 personA 이름: " + personA.name);
//        System.out.println("설정 후 personB 이름: " + personB.name);

//        // 기능 활용
//        int result1 = personA.sum(1, 2);
//        int result2 = personB.sum(31, 2);
//        System.out.println(result1 );
        Car car = new Car("myCar", "bus", 100);
        car.drive();
        System.out.println(car.accelerate(50));

    }
}
