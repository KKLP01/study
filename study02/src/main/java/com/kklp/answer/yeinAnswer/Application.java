package main.java.com.kklp.answer.yeinAnswer;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /*
         *  사용자 로그인 및 회원가입 시스템을 스캐너를 이용해 객체지향 적으로 구현해보자.
         *
         *  - 회원 가입은 10명까지만 가능
         *  - 가입한 회원이 없는 상태에서 로그인을 시도하면  - 가입한 회원이 없습니다. 출력
         *  - 정상적으로 가입 후 로그인시 로그인 완료 출력된 후 프로그램 종료
         *  - 스캐너로 아이디, 이름, 비밀번호, 비밀번호 확인 을 물어본 후 비밀번호와 비밀번호 확인이 같을 시 가입 진행
         *
         *  Application
         *  - 스캐너로 로그인, 회원가입, 프로그램 종료 구현
         *
         *  LoginService
         *  - 회원 가입, 로그인 메소드 연결
         *
         *  LoginRepository
         *  - 회원 가입 처리, 로그인 처리
         *
         *  User
         *  - 회원의 id, pwd, name 을 받을 DTO
         *
         * */

        Scanner sc = new Scanner(System.in);

        LoginService loginService = new LoginService();

        while (true) {
            System.out.println("\n========사용자 로그인 및 회원가입 프로그램========\n");
            System.out.println("1. 로그인");
            System.out.println("2. 회원 가입");
            System.out.println("9. 프로그램 종료 \n");
            System.out.println("메뉴 선택 : ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1: if (loginService.login() == 1) { // 로그인 성공 여부에 따른 메인화면 전환

                    while (loginService.currentLoginId!=null) {
                        System.out.println("1. 로그 아웃");
                        System.out.println("2. 회원 탈퇴\n");
                        System.out.println("메뉴 입력 : ");
                        int no = sc.nextInt();

                        switch (no) {
                            case 1:
                                loginService.logOut();
                                System.out.println("로그아웃 되었습니다.");
                                break;
                            case 2:
                                loginService.deleteUser();
                                break;
                            default:
                                System.out.println("잘못된 번호를 입력하셨습니다.\n");
                                break;
                        }
                    }
                }
                    break;

                case 2: loginService.signUp(); break;
                case 9:
                    System.out.println("프로그램 종료"); return;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.\n"); break;
            }
        }
    }
}