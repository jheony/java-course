package chapter3.stream.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        Predicate<Integer> predicate = new Predicate<>() {
            @Override
            public boolean test(Integer integer) {
                return (integer % 2) == 0;
            }
        };

        List<Integer> collect = arrayList.stream()
                .filter(predicate)
                .map(num -> num * 10)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
