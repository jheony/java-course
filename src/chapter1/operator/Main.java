package chapter1.operator;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // 기본적인 사칙연산
        int sum = a + b;
        System.out.println("sum = " + sum);

        int sub = a - b;
        System.out.println("sub = " + sub);

        int mul = a * b;
        System.out.println("mul = " + mul);

        // 나눗셈
        int div = a / b;
        System.out.println("div = " + div);

        double div2 = a/3.0;
        System.out.println("div2 = " + div2);

        // 모듈러 연산자(나머지 연산) - %
        int mod = 10 % 3;
        System.out.println("mod = " + mod);

        int mod2 = 15 % 4;
        System.out.println("mod2 = " + mod2);

        // 시간 연산
        int mod3 = (10 + 5) % 12;
        System.out.println("mod3 = " + mod3);

        // 짝수 홀수 연산
        int mod4 = 6 % 2;
        System.out.println("mod4 = " + mod4);

        int mod5 = 7 % 2;
        System.out.println("mod5 = " + mod5);

        // 대입 연산자
        int num = 5;
        // 복합 대입 연산자
        num += 3;
        System.out.println("num = " + num);

        num -= 2;
        System.out.println("num = " + num);

        num *= 2;
        System.out.println("num = " + num);

        num /= 3;
        System.out.println("num = " + num);

        num %= 3;
        System.out.println("num = " + num);

        // 증감 연산자
        num = 1;
        num++;
        num++;
        num--;
        num--;
        System.out.println("num = " + num);

        // 전위연산(++i) - 연산 후 값이 활용됨
        int intBox = 5;
        System.out.println("(++intBox) = "+ (++intBox));

        // 후위 연산
        int intBox2 = 5;
        System.out.println("(intBox2++) = "+ (intBox2++));
        System.out.println("intBox2 = " + intBox2);

        // 비교연산자
        // 같음 연산자(=) 같으면 true, 다르면 false
        System.out.println("10 == 10: " + (10==10));

        // 다름 연산자(!=) 다르면 true, 같으면 false
        System.out.println("10 != 5: " + (10!=5));

        // 크기 비교 연산자
        System.out.println("10 < 5: " + (10<5));
        System.out.println("10 >= 10: " + (10>=10));
        System.out.println("10 <= 5: " + (10<=5));

        // 논리연산자
        // AND 연산(&&) - 두 조건이 모두 참일 때 true
        System.out.println("true && true: "+(true && true));

        int age = 20;
        boolean isStudent = true;
        System.out.println("age = " + age);

        // OR 연산(||) - 두 조건 중 하나라도 참이라면 true
        System.out.println("true || false: "+(true || false));

        // NOT 연산자(!) - true -> false, false -> true
        System.out.println("!true: "+!true);

        // 연산자 우선순위
        boolean flag = 10 + 5 > 12 && true;
        System.out.println(flag);

        // 실행 순서: (10 + 5) > 12 && true : 산술
        // → 15 > 12 && true : 비교
        // → true && true : 논리
        // → flag = true 대입

        // 논리 연산자 우선순위( ! -> && -> ||)
        boolean res = true || (false && false);
        System.out.println("res = " + res);

        boolean res2 = true || (false && (!false));
        System.out.println("res2 = " + res2);

        // 문자열 비교
        String text = "hello";
        String test2 = "Hello";

        // 나쁜 예: (text == text2)
        boolean isEqual = text.equals(test2);
        System.out.println(isEqual);
    }
}
