package chapter3.collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 배열의 한계
        // 선언과 동시에 길이 설정 필요
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        // 배열의 정적인 특징의 한계
//        numbers[3] = 4;

        // 컬렉션
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(10);
        arr.add(10);
        arr.add(10);

        // ArrayList 활용
        ArrayList<String> names = new ArrayList<>();

        // 데이터 추가
        names.add("Spartan");
        names.add("Steve");
        names.add("Isac");
        names.add("1");
        System.out.println(names);

        // 중복 데이터 허용
        names.add("Spartan");
        System.out.println(names);

        // 데이터 단건 조회
        String name1 = names.get(0);
        System.out.println("name1 = "+name1);

        // 데이터 삭제
        names.remove("Steve");
        System.out.println(names);

        // HashSet 사용 방법
        HashSet<String> uniqueNames = new HashSet<>();

        // 데이터 추가
        uniqueNames.add("Spartan");
        uniqueNames.add("Steve");
        uniqueNames.add("Isac");
        uniqueNames.add("1");
        uniqueNames.add("2");

        // 순서를 보장 안 함
        System.out.println(uniqueNames);

        // get() 활용 불가
//        uniqueNames.get();

        // 중복 데이터 불가
        uniqueNames.add("Spartan");
        System.out.println(uniqueNames);

        // 데이터 제거
        uniqueNames.remove("Spartan");
        System.out.println(uniqueNames);

        // HashMap 활용
        // <키, 값> -> 저장
        HashMap<String, Integer> memberMap = new HashMap<>();

        // 데이터 추가
        memberMap.put("Spartan", 10);
        memberMap.put("Steve", 13);
        memberMap.put("Isac", 105);
        memberMap.put("John", 1);
        memberMap.put("Alice", 32);
        System.out.println(memberMap);

        // 키 중복 불가: 값이 덮어쓰기 발생
        memberMap.put("Alice", 423);
        System.out.println(memberMap);

        // 단건 조회
        Integer spartanNum = memberMap.get("Spartan");
        System.out.println(spartanNum);

        // 삭제
        memberMap.remove("Spartan");
        System.out.println(memberMap);

        // 키 확인
        Set<String> keySets = memberMap.keySet();
        System.out.println("keySets = " + keySets);

        // 값 확인
        Collection<Integer> valueSets = memberMap.values();
        System.out.println("valueSets = " + valueSets);
    }
}
