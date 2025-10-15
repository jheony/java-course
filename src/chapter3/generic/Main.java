package chapter3.generic;

public class Main {
    public static void main(String[] args) {
        // 1. 재사용 불가
        Box box1 = new Box(100);
//        Box box2 = new Box(100);
//        Box box3 = new Box(100);

        // 2. 낮은 타입 안정성
        ObjectBox strBox = new ObjectBox("ABC");
        ObjectBox intBox = new ObjectBox(100);

        // item을 활용하기 위해서는 down casting 필요
        String item = (String) strBox.getItem();
        System.out.println("item = "+ item);

//        String item2 = (String) intBox.getItem();

        // 제네릭 활용
        // 1. 재사용성 보장(타입소거: T -> Object)
        GenericBox<String> strGBox = new GenericBox<>("ABC");
        GenericBox<Integer> intGBox = new GenericBox<>(100);
        GenericBox<Double> doubleGBox = new GenericBox<>(0.1);

        // 2. 타입 안정성 보장(타입소거: 자동으로 down casting )
        String strBoxItem = strGBox.getItem();
        System.out.println("strBoxItem = "+ strBoxItem);

        Integer intBoxItem = intGBox.getItem();
        System.out.println("intBoxItem = "+ intBoxItem);

        Double doubleBoxItem = doubleGBox.getItem();
        System.out.println("doubleBoxItem = "+ doubleBoxItem);

        // 일반 메서드(String 기준으로 타입소거 발생)
        strGBox.printItem("ABC");
//        strGBox.printItem(100);
//        strGBox.printItem(0.1);

        // 제네릭 메서드(String과 상관 없음)
        strGBox.printBoxItem("ABC");
        strGBox.printBoxItem(100);
        strGBox.printBoxItem(0.1);


    }
}
