package chapter2.pracRamen;

public class BlackRamen implements StirFried{
    @Override
    public void noodle() {
        System.out.println("쫠깃 짜짜로니");
    }

    @Override
    public void source() {
        System.out.println("할머니집 가면 항상 있던 짜장면 짜짜로니");
    }

    @Override
    public void skill() {
        System.out.println("물의 양과, 볶는 시간 등 손맛이 중요해요");
    }
}
