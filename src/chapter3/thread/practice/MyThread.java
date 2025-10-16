package chapter3.thread.practice;

public class MyThread extends Thread {
    // 속성
    int start, end;

    // 생성자
    public MyThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    // 기능
    public void run() {
        // 네이밍
        String threadName = Thread.currentThread().getName();
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
            // 진행 상황 출력
            System.out.println("현재 진행중인 스레드: " + threadName + " / 현재 진행 상황: " + i + " " + sum);
            try {
                Thread.sleep(10); // ✅ 0.01 초마다 계산
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
