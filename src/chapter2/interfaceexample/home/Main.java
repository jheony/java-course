package chapter2.interfaceexample.home;

public class Main {
    public static void main(String[] args) {
        Tv tv = new Tv();
        AirConditioner ac = new AirConditioner();
        Computer computer = new Computer();

        tv.turnOn();
        tv.changeChannel(5);
        tv.turnOff();

        ac.turnOn();
        ac.changeMode();
        ac.turnOff();

        computer.turnOn();
        computer.click();
        computer.turnOff();
    }
}
