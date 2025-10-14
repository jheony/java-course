package chapter2.clazz;

public class Car {
    // 속성
    String name;
    String type;
    int speed;

    Car(String name, String type, int speed) {
        this.name = name;
        this.type = type;
        this.speed = speed;
    }

    public void drive(){
        System.out.println(name + "주행을 시작합니다.");
    }

    public int accelerate(int acc){
        System.out.println(acc + "만큼 속도를 높입니다.");
        return speed+acc;
    }

}
