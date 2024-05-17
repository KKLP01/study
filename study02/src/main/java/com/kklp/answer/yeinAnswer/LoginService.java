package main.java.com.kklp.answer.yeinAnswer;

import java.util.Scanner;

public class LoginService {

    LoginRepository loginRepository = new LoginRepository();

    // 회원 가입
    public void signUp() {

        while (true) {

            Scanner sc = new Scanner(System.in);

            User user = new User();

            System.out.println("========== 회원 가입 ==========\n");
            System.out.println("사용하실 아이디를 입력해 주세요 : ");
            user.setId(sc.nextLine());

//            String userId = sc.nextLine();
//            boolean idUnique = loginRepository.isUserIdUnique(userId);
//
//            if (idUnique) {
//                user.setId(userId);
//            } else System.out.println("이미 가입된 아이디 입니다.");

            System.out.println("가입자의 이름을 입력해 주세요 : ");
            user.setName(sc.nextLine());

            System.out.println("사용하실 비밀번호를 입력해 주세요 : ");
            String firstPass = sc.nextLine();

            System.out.println("입력하신 비밀번호를 한번 더 입력해 주세요 : ");
            String secondPass = sc.nextLine();

            if (firstPass.equals(secondPass)) {
                user.setPwd(secondPass);
                loginRepository.save(user);
                break;

            } else System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해 주세요.");
        }
    }

    // 로그인 _ 정보 입력 받아 repo 로 넘기기
    public int login() {

        if (loginRepository.showCount()==0) System.out.println("가입한 회원이 없습니다.");

        Scanner sc = new Scanner(System.in);

        System.out.println("========== 로그인 ==========\n");
        System.out.println("아이디 : ");
        String userId = sc.nextLine();
        System.out.println("비밀번호 : ");
        String userPwd = sc.nextLine();

        boolean success = loginRepository.successLogin(userId, userPwd);

        if (success == false) { // 로그인 실패 시 다시 로그인 창
            login();

        } return 1; // 로그인 성공 시 로그인 메인화면으로
    }

    // 회원 탈퇴
    public void deleteUser() {

        System.out.println("탈퇴 후 복구가 불가합니다. 정말 탈퇴하시겠습니까? (Y/N) : ");

        Scanner sc = new Scanner(System.in);
        String isDelete = sc.nextLine();

        if (isDelete.equals("Y")) {

            // 여기에 repo 에서 지우라고 명령하는 코드 입력

            System.out.println("회원 탈퇴가 완료되었습니다. 감사합니다.");
            System.exit(0);

        } else if (isDelete.equals("N")) {
            System.out.println("잘 생각하셨습니다!^^\n");

        } else {
            System.out.println("잘못된 문자를 입력하셨습니다. 다시 입력해 주세요.");
            deleteUser();
        }
    }
}