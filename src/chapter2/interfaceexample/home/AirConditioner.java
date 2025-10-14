package chapter2.interfaceexample.home;

public class AirConditioner implements Control {
    int temp = 24;

    @Override
    public void turnOn() {
        System.out.println("에어컨을 켰습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("에어컨을 껐습니다.");
    }

    public void changeMode() {
        System.out.println("모드를 변경했습니다");
    }
}
