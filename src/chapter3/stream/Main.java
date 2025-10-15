package chapter3.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        // for 명령형 스타일: 각 요소 * 10 처리
        List<Integer> ret1 = new ArrayList<>();
        for (Integer num : arrayList) {
            Integer multipliedNum = num * 10;
            ret1.add(multipliedNum);
        }
        System.out.println(ret1);

        // stream 선언형 스타일: 각 요소 * 10 처리
        List<Integer> ret2 = arrayList.stream()     // 1. 데이터 흐름 준비
                .map(num -> num * 10)       // 2. 중간 연산 등록
                .collect(Collectors.toList());      // 3. 최종 연산
        System.out.println(ret2);

        // 1. 익명 클래스를 직접 만들어서 변수에 담아 매개변수로 전달
        Function<Integer, Integer> function = new Function<>() {
            @Override
            public Integer apply(Integer num) {
                return num * 10;
            }
        };
        List<Integer> ret3 = arrayList.stream()     // 1. 데이터 흐름 준비
                .map(function)       // 2. 중간 연산 등록
                .collect(Collectors.toList());      // 3. 최종 연산
        System.out.println(ret3);

        // 2. 람다식을 만들어서 변수에 담아 매개변수로 전달
        Function<Integer, Integer> functionLambda = (integer -> integer * 10);
        List<Integer> ret4 = arrayList.stream()
                .map(functionLambda)
                .collect(Collectors.toList());
        System.out.println(ret4);

        // 3. 람다식을 집접 매개변수로 전달
        List<Integer> ret5 = arrayList.stream()     // 1. 데이터 흐름 준비
                .map(num -> num * 10)       // 2. 중간 연산 등록
                .collect(Collectors.toList());      // 3. 최종 연산
        System.out.println(ret5);

        // 4. 중간 연산을 함께 사용하는 방법(filter() + map())
        // 요구사항: 리스트에서 짝수를 찾아 * 10
        // - 1. 짝수 찾기
        // - 2. * 10
        List<Integer> ret6 = arrayList.stream()      // 1. 데이터 흐름 준비(1, 2, 3, 4, 5)
                .filter(num -> num % 2 == 0)    // 2. 중간 연산 등록(짝수 찾기)
                .map(num -> num * 10)           // 3. 중간 연산 등록(*10)
                .collect(Collectors.toList());
        System.out.println(ret6);
    }
}