package chapter3.practice;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CampService camp = new CampService();

        System.out.print("캠프에서 찾고 싶은 수강생의 이름을 입력하세요: ");
        String name = sc.nextLine();

        Optional<Student> student = camp.findStudentByName(name);

        if (student.isPresent()) {
            Student findStudent = student.get();
            System.out.println("캠프에 " + name + "수강생이 존재합니다.");
        } else {
            System.out.println("해당 수강생은 캠프에 존재하지 않습니다.");
        }
    }

}
