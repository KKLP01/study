package main.java.com.kklp.answer.doyeonAnswer;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        /*
         * 사용자로그인 및 회원가입 시스템을 스캐너를 이용해 객체지향적으로 구현
         *
         * - 회원가입은 10명까지만 가능
         * - 가입한 회원이 없는 상태에서 로그인을 시도하면 - 가입한 회원이 없습니다 출력
         * - 정상적으로 가입 후 로그인시 로그인 완료 출력된 후 프로그램 종료
         * - 아이디, 이름, 비밀번호, 비밀번호 확인 을 물어본 후 비밀번호와 비밀번호 확인이 같을 시 가입 진행
         *
         * Application
         * - 스캐너로 로그인, 회원가입, 프로그램 종료 구현
         * LoginService
         * - 회원 가입, 로그인 메소드 연결
         *
         * LoginRepository
         * - 회원가입처리, 로그인 처리
         *
         * User
         * - 회원의 id, pwd, name을 받을 DTO
         * */

        Scanner sc = new Scanner(System.in);
        LoginService loginService = new LoginService();

        loop:
        while (true) {
            System.out.println("==========로그인 및 회원가입==========");
            System.out.println("1. 로그인");
            System.out.println("2. 회원가입");
            System.out.println("9. 프로그램 종료");
            System.out.println("메뉴 선택하세요");
            int num = sc.nextInt();
            sc.nextLine();          //nextInt(), next() 뒤 버퍼처리
            switch (num) {
                case 1:
                    loginService.login();
                    break;
                case 2:
                    loginService.signUpUsers();
                    break;
                case 9:
                    System.out.println("프로그램 종료");
                    break loop;
                default:
                    System.out.println("잘못된 번호를 입력");
                    break;
            }

        }
    }
}