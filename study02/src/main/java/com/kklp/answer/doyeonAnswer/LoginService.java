package main.java.com.kklp.answer.doyeonAnswer;

import java.util.Scanner;

public class LoginService {

    //클래스 내 선언
    Scanner sc = new Scanner(System.in);
    LoginRepository loginRepository = new LoginRepository();

    public void login() {           //로그인

        System.out.println("====================");
        if (loginRepository.findAllUsers()[0] == null) {            //DB확인
            System.out.println("가입한 회원이 없습니다");
            System.out.println("회원가입 창으로 이동합니다");
            signUpUsers();          //회원가입
        } else {
            while (true) {
                System.out.println("아이디 입력");
                String id = sc.nextLine();
                System.out.println("비밀번호 입력");
                String pwd = sc.nextLine();

                User newUser = new User(id, pwd);
                //향상된 for문(foreach문)
                for (User user : loginRepository.findAllUsers()) {
                    if(user!=null) {            //DB확인
                        if (newUser.getId().equals(user.getId()) && newUser.getPwd().equals(user.getPwd())) {
                            System.out.println("---------로그인 완료------");
                            loginOn(newUser);           //로그인 후 메인
                            return;         //메인 홈
                        }
                    }
                }
                System.out.println("------로그인 실패-------");
                System.out.println("아이디나 비밀번호가 다릅니다. 다시 입력하세요");
            }
        }
    }


    public void signUpUsers() {         //회원가입

        System.out.println("====================");
        while (true) {
            System.out.println("아이디 입력");
            String id = sc.nextLine();
            System.out.println("이름 입력");
            String name = sc.nextLine();
            System.out.println("비밀번호 입력");
            String pwd = sc.nextLine();

            System.out.println("비밀번호 확인");
            String pwdCheck = sc.nextLine();

            if (pwd.equals(pwdCheck)) {         //비밀번호 동일여부확인
                User newUser = new User(id, pwd, name);
                System.out.println("회원가입을 합니다");
                System.out.println(newUser.toString() + "회원 가입 시도");            //객체출력
                if (loginRepository.store(newUser)) {           //DB저장
                    System.out.println("회원 가입 성공");
                } else {
                    System.out.println("인원 10명 마감되어 등록에 실패했습니다");
                }
                break;          //메인 홈
            } else {
                System.out.println("비밀번호 같지않음. 다시 입력");
            }
        }
    }

    public void loginOn(User newUser) {         //로그인 후 메인

        System.out.println("====================");
        while (true) {
            System.out.println("1. 로그아웃");
            System.out.println("2. 회원탈퇴");
            System.out.println("메뉴 선택하세요");
            int num = sc.nextInt();
            sc.nextLine();          //nextInt(), next() 뒤 버퍼처리
            switch (num) {
                case 1:
                    System.out.println("로그아웃 되었습니다");
                    System.out.println("메인 창으로 이동합니다");
                    return;         //메인 홈
                case 2:
                    System.out.println("정말 탈퇴하시겠습니까? 복구 불가능합니다 (y/n)");
                    String str = sc.nextLine();
                    if (str.equals("y") || str.equals("Y")) {
                        loginRepository.storeDel(newUser);          //DB삭제
                        System.out.println("메인 창으로 이동합니다");
                        return;         //메인 홈
                    } else if (str.equals("n") || str.equals("N")) {
                        System.out.println("잘 생각하셨습니다");
                        System.out.println("이전 화면으로 이동합니다");
                        break;
                    } else {
                        System.out.println("y와 n 또는 Y와 N 중 하나를 입력해주세요");
                        break;
                    }
                default:
                    System.out.println("1과 2 중 하나를 입력해주세요");
                    break;
            }
        }
    }
}

