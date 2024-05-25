package main.java.com.kklp.answer.eunahAnswer;

import java.util.Scanner;

public class LoginService {

    Scanner scr = new Scanner(System.in);
    LoginRepository loginRepository = new LoginRepository();
    private UserDTO loggedInUser;

    public int login() {
        System.out.println("아이디를 입력 해주세요 : ");
        String a = scr.nextLine();
        System.out.println("비밀번호를 입력 해주세요 : ");
        String b = scr.nextLine();

        UserDTO userDTO = new UserDTO(a, b);
        int isTrue = loginRepository.login(userDTO);
        if (isTrue == 0) {
            System.out.println(userDTO.getName());
            loggedInUser = userDTO;
            return 1;
        } else {
            return 2;
        }
    }

    public void signUp() {
        System.out.println("======회원 가입 창======");
        System.out.println("아이디를 입력 해주세요 : ");
        String a = scr.nextLine();

        // ID 중복 체크
        while (true) {
            if (loginRepository.isIdDuplicate(a)) {
                System.out.println("이미 가입된 아이디입니다. 다시 입력해 주세요.");
            } else {
                break; // 중복되지 않는 ID가 입력되면 루프를 벗어남
            }
            System.out.println("아이디를 입력 해주세요 : ");
            a = scr.nextLine();
        }

        System.out.println("사용 가능한 아이디입니다.");
        System.out.println("이름을 입력 해주세요 : ");
        String b = scr.nextLine();

        while (true) {
            System.out.println("비밀번호를 입력 해주세요 : ");
            String c = scr.nextLine();
            System.out.println("비밀번호를 다시 한 번 입력 해주세요 : ");
            String d = scr.nextLine();
            if (c.equals(d)) {
                UserDTO userDTO = new UserDTO(a, c, b);
                boolean isTrue = loginRepository.join(userDTO);
                if (isTrue) {
                    System.out.println("등록 완료 되었습니다.");
                    System.out.println(" ");
                    return;
                }
                System.out.println(" ");
                return;
            } else {
                System.out.println("비밀번호가 서로 다릅니다.");
            }
        }
    }

    // 회원탈퇴 메소드
    public void delete() {
        System.out.println("정말 탈퇴하시겠습니까? 복구 불가능합니다 (Y/N)");
        String choice = scr.nextLine();

        // 사용자가 'Y' 또는 'y'를 입력했을 경우
        if (choice.equalsIgnoreCase("Y")) {
            // loginRepository의 deleteUser 메소드를 호출, 현재 로그인된 사용자의 ID로 탈퇴 시도
            boolean isDeleted = loginRepository.deleteUser(loggedInUser.getId());
            if (isDeleted) {
                System.out.println("회원 탈퇴가 완료되었습니다.");
                // 로그인된 사용자 정보를 초기화하여 로그아웃 상태로 만듦
                loggedInUser = null;
            }
            // 사용자가 'N' 또는 'n'를 입력했을 경우
        } else if (choice.equalsIgnoreCase("N")) {
            System.out.println("잘 생각하셨습니다.");
            // 탈퇴 취소 후 로그인 상태 메뉴로 돌아가기
            loggedInMenu();
        } else {
            System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
        }
    }

    // 로그인된 상태에서의 메뉴
    public void loggedInMenu() {
        while (loggedInUser != null) {
            System.out.println("");
            System.out.println("========로그인 상태========");
            System.out.print("1. 로그아웃   ");
            System.out.println("2. 회원탈퇴   ");
            System.out.println("==========================");
            int choice = scr.nextInt();
            scr.nextLine();

            switch (choice) {
                case 1:
                    loggedInUser = null; // 로그아웃
                    System.out.println("로그아웃 되었습니다.");
                    return;
                case 2:
                    delete();
                    break;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");
            }
        }
    }
}