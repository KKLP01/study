package main.java.com.kklp.answer.yujinAnswer;

import java.util.Scanner;

public class LoginService {

    Scanner sc = new Scanner(System.in);
    LoginRepository loginRepository = new LoginRepository();


    public void loginUser() {
        if (loginRepository.checkUsers()) {
            System.out.println("가입한 회원이 없습니다.");
        } else {
            System.out.print("아이디를 입력해주세요 : ");
            String id = sc.next();

            System.out.print("비밀번호를 입력해주세요 : ");
            String pwd = sc.next();

            UserDTO user = new UserDTO(id, pwd);
            if (loginRepository.login(user)) {
                System.out.println("로그인에 성공했습니다.");
                Application application = new Application();
                application.loginSuccessForm(user);
            } else {
                System.out.println("로그인에 실패했습니다.");
            }
        }
    }


    public void signUpUser() {
        System.out.print("아이디를 입력해주세요 : ");
        String id = sc.next();

        sc.nextLine();

        System.out.print("이름을 입력해주세요 : ");
        String name = sc.nextLine();

        System.out.print("비밀번호를 입력해주세요 : ");
        String pwd = sc.next();

        System.out.print("비밀번호를 다시 한 번 입력해주세요 : ");
        String pwdCheck = sc.next();

        // 비밀번호와 비밀번호 확인이 일치하면 객체 생성후 repo에 등록
        if (pwd.equals(pwdCheck)) {
            UserDTO user = new UserDTO(id, pwd, name);
            if (loginRepository.signUp(user)) {
                System.out.println("회원가입이 완료되었습니다.");
            } else {
                System.out.println("정원 초과로 회원가입에 실패했습니다.");
            }
        } else {
            System.out.println("비밀번호가 서로 다릅니다.");
        }
    }


    public void deleteUser(UserDTO user) {
        while (true) {
            System.out.println("정말 탈퇴하시겠습니까? 복구가 불가능합니다(Y/N)");
            String answer = sc.nextLine();

            // 회원탈퇴 후 메인화면으로 돌아감
            if (answer.equals("Y") || answer.equals("y")) {
                loginRepository.delete(user);
                System.out.println("회원 탈퇴가 완료되었습니다.");
                break;
            } else if (answer.equals("N") || answer.equals("n")) {
                System.out.println("잘 생각하셨습니다");
                // 회원 탈퇴를 하지 않으면 로그인한 상태로 다시 돌아감
                Application application = new Application();
                application.loginSuccessForm(user);
                break;
            } else {
                System.out.println("잘못입력하였습니다. 다시 입력하세요");
            }
        }
    }
}