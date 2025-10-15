package chapter2.pracRamen;

public class Samyang implements Soup {
    @Override
    public void noodle() {
        System.out.println("꼬불꼬불");
    }

    @Override
    public void source() {
        System.out.println("남녀노소 다 좋아하는 Standard 맛!!");
    }

    @Override
    public void water() {
        System.out.println("1개 500ml, 1개 반 700ml");
    }
}
