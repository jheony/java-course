package chapter2.interfaceexample.home;

public class Computer implements Control{

    @Override
    public void turnOn() {
        System.out.println("컴퓨터를 켰습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("컴퓨터를 껐습니다.");
    }

    public void click(){
        System.out.println("마우스로 클릭합니다.");
    }
}