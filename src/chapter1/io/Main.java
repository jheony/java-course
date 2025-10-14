package chapter1.io;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 출력
        //println 사용
        System.out.println("hello");
        System.out.println("Java");

        //print 사용
        System.out.print("안녕");
        System.out.print("자바");

        // 개행문자 포함 출력
        System.out.println("Hello\nWorld!");

        // 입력(Scanner)
        Scanner sc = new Scanner(System.in);

        // 문자열 입력 받기
        System.out.println("좋아하는 문장을 입력하새요.");
        String sentence = sc.nextLine();
        System.out.println("sentence = " + sentence);

        // 정수형 입력받기
        System.out.println("정수(int)를 입력하세요:");
        int intBox = sc.nextInt();
        System.out.println("intBox = " + intBox);

        System.out.println("정수(long)를 입력하세요:");
        long longBox = sc.nextLong();
        System.out.println("longBox = " + longBox);

        // 소수점
        System.out.println("소수점(double) 입력하세요:");
        double doubleBox = sc.nextDouble();
        System.out.println("doubleBox = " + doubleBox);
    }
}
