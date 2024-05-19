package main.java.com.kklp.answer.yujinAnswer;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LoginService loginService = new LoginService();

        while (true) {
            System.out.println("----- 로그인 및 회원가입 -----");
            System.out.println("1. 로그인    2. 회원가입    9. 회원가입정보확인    0. 프로그램 종료");

            int menu = sc.nextInt();

            if (menu == 1) {
                loginService.loginUser();
            } else if (menu == 2) {
                loginService.signUpUser();
            } else if (menu == 9) {
                LoginRepository repo = new LoginRepository();
                repo.print();
            } else if (menu == 0) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                System.out.println("잘못입력하였습니다. 다시 입력하세요");
            }
        }
    }

    // 로그인 시 메인화면
    public void loginSuccessForm(UserDTO user) {
        Scanner sc = new Scanner(System.in);
        LoginService loginService = new LoginService();

        while (true) {
            System.out.println("----------");
            System.out.println("1. 로그아웃    2. 회원탈퇴     0. 프로그램 종료");

            int menu = sc.nextInt();

            if (menu == 1) {
                // 로그아웃 하면 메인화면으로 돌아감
                break;
            } else if (menu == 2) {
                loginService.deleteUser(user);
                break;
            } else if (menu == 0) {
                System.out.println("프로그램을 종료합니다");
                System.exit(0);
            } else {
                System.out.println("잘못입력하였습니다. 다시 입력하세요");
            }
        }
    }
}