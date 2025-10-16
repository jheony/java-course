package chapter3.thread.practice;

public class Main {
    public static void main(String[] args) {
        System.out.println("::: main 쓰레드 시작");

        MyThread single = new MyThread(1, 1000);

        MyThread multi1 = new MyThread(1, 250);
        MyThread multi2 = new MyThread(251, 500);
        MyThread multi3 = new MyThread(501, 750);
        MyThread multi4 = new MyThread(751, 1000);

        long startTime = System.currentTimeMillis();
        System.out.println("멀티 스레드 시작");
        multi1.start();
        multi2.start();
        multi3.start();
        multi4.start();

        // 스레드 대기
        try {
            multi1.join();
            multi2.join();
            multi3.join();
            multi4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("멀티 스레드 종료");

        long multiTotalTime = endTime - startTime;
        System.out.println("멀티스레드 총 소요시간: " + multiTotalTime);

        startTime = System.currentTimeMillis();
        System.out.println("싱글 스레드 시작");
        single.start();

        try {
            single.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        endTime = System.currentTimeMillis();
        System.out.println("싱글 스레드 종료");
        long singleTotalTime = endTime - startTime;
        System.out.println("싱글스레드 총 소요시간: " + singleTotalTime);

        System.out.println("::: main 쓰레드 종료 :::");
    }
}