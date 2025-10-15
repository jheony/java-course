package chapter3.practice;

import java.util.Optional;

public class CampService {
    // 속성
    private static final Student[] students = {
            new Student("Spartan"),
            new Student("Steve"),
            new Student("John")
    };
    // 생성자

    // 기능
    public Optional<Student> findStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return Optional.of(student);
            }
        }
        return Optional.ofNullable(null);
    }
}
