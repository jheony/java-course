package chapter1.operator;

import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        System.out.println(" --------------- Q1. 산술 연산자 문제 ----------------");
        int a = 15;
        int b = 4;
        int sum = a + b;
        System.out.println("덧셈 결과: "+sum);

        int sub = a-b;
        System.out.println("뺄셈 결과: "+sub);

        int mul = a*b;
        System.out.println("덧셈 결과: "+mul);

        int div = a/b;
        System.out.println("나눗셈 결과: "+div);

        int mod = a%b;
        System.out.println("나머지 결과: " + mod);

        System.out.println(" --------------- Q2. 비교 연산자 문제 ----------------");
        int x = 5;
        int y = 10;

        boolean xBig = x>y;
        boolean yBig = x<y;
        boolean xyEqual = x==y;
        boolean xyDiff = x!=y;

        System.out.println("x가 y보다 큰가? " + xBig);
        System.out.println("x가 y보다 작은가? " + yBig);
        System.out.println("x와 y가 같은가? " + xyEqual);
        System.out.println("x와 y가 다른가? " + xyDiff);

        System.out.println(" --------------- Q3. 문자열 비교 문제 ----------------");

        // TODO: 사용자로부터 첫 번째 문자열 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 문자열을 입력하세요: ");
        String str1 = sc.nextLine();

        // TODO: 사용자로부터 두 번째 문자열 입력받기
        System.out.print("두 번째 문자열을 입력하세요: ");
        String str2 = sc.nextLine();

        // TODO: 문자열 비교 결과를 변수 result 에 저장
        boolean result = str1.equals(str2);

        // TODO: 결과 출력
        System.out.println("두 문자열이 같은가요? "+result);
    }
}
