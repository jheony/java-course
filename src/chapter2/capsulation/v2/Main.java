package chapter2.capsulation.v2;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();

        // 무분별한 세터
//        robot.setLeftLeg(true);
//        robot.setRightLeg(true);
//        robot.setLeftArm(true);
//        robot.setRightArm(true);

        robot.walk(true);
    }
}
