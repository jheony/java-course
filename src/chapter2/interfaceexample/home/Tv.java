package chapter2.interfaceexample.home;

public class Tv implements Control {
    int channel = 0;
    
    @Override
    public void turnOn() {
        System.out.println("Tv를 켰습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv를 껐습니다.");
    }

    public void changeChannel(int newChannel) {
        this.channel = newChannel;
        System.out.println("채널을 변경했습니다.");
    }
}
