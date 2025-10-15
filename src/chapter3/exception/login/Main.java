package chapter3.exception.login;

import java.util.Scanner;

public class Main {
    public static void login(String id, String pw) throws Exception {
        if("admin".equals(id) && "1234".equals(pw)) {
            System.out.println("로그인 성공!!!");
        }else {
            throw new Exception("로그인 실패! 아이디 또는 비밀번호가 잘못되었습니다.");
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("아이디를 입력하세요: ");
            String id = sc.nextLine();
            System.out.print("비밀번호를 입력하세요: ");
            String pw = sc.nextLine();

            login(id, pw);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
