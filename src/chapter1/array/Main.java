package chapter1.array;

public class Main {
    public static void main(String[] args) {
        // 모험가 명단을 관리하는 법
        String name1 = "gygim";
        String name2 = "Steve";

        String[] adventurList = {"Steve", "Gygim"};

        // 1. 배열 선언
//        int[] arr;

        // 2. 배열 길이 할당
//        arr = new int[5];
        // arr = [] [] [] [] []

        // 3. 배열 선언과 동시에 할당
//        int[] arr = new int[5];

        // 4. 배열 선언과 동시에 배열의 요소 할당
        int[] arr = {10, 20, 30, 40, 50};
        // [10] [20] [30] [40] [50]
        System.out.println(arr);

        // 배열의 길이
        int arrLength = arr.length;
        System.out.println(arrLength);

        // 문자열 배열 선언
        String[] strArr = new String[5];

        // 논리형 배열 선언
        boolean[] boolArr = new boolean[5];

    }
}
