package chapter2.pracRamen;

public class Shin implements Soup {

    @Override
    public void water() {
        System.out.println("물양 맞추는게 중요해요");
    }

    @Override
    public void noodle() {
        System.out.println("꼬불꼬불 라면이에요 신라면은 건면도 있어요~!! 다이어트에 좋아요");
    }

    @Override
    public void source() {
        System.out.println("매운맛의 민족!! 꽤 매워요 ");
    }

    public void spicy() {
        System.out.println("온 식당의 기준점! 신라면보다 안매워요~ 신라면 정도에요~ 신라면보다 매워요!!");
    }
}
