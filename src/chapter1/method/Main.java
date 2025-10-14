package chapter1.method;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. 객체를 객체화(소한)
        Calculator calculator = new Calculator();

        // 2. 함수 호출
        int res = calculator.sum(1, 2);
    }
}
