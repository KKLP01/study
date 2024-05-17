package main.java.com.kklp.answer.yeinAnswer;


public class LoginRepository {

    // 전체 유저 10명 고정
    private final static User[] users = new User[10];
    private static int count;

    public int showCount() {
        return count;
    }

    // 회원가입 완료 후 성공 여부를 반환
    public static boolean save(User newUsers) {

        if (count != 10) {
            users[count] = newUsers;
            count++;
            System.out.println("회원가입이 완료되었습니다. 로그인해 주세요.");
            System.out.println("회원님의 가입이 완료되어 총 회원수는 : " + count + "명 입니다.");
            return true;

        } else {
            System.out.println("정원 초과로 더이상 회원가입이 불가합니다. 죄송합니다.");
            return false;
        }
    }

//    // 아이디 중복 확인
//    public static boolean isUserIdUnique(String id) {
//        boolean result = true;
//
//        for (int i = 0; i < count; i++) {
//            if (users[i].getId() == id) {
//                result = false;
//            } else result = true;
//        } return result;
//    }

    // 로그인 확인 후 성공 여부 반환
    public boolean successLogin(String id, String pwd) {
        boolean isSuccess = false;

        for (int i = 0; i < count; i++) {

            if (users[i].getId().equals(id)) {

                if (users[i].getPwd().equals(pwd)) {
                    System.out.println(users[i].getName() +"님 반갑습니다. 로그인에 성공하셨습니다.");
                    isSuccess = true;
                    return true; // 성공했으니 로그인 확인 끝내기 (안끝내면 nullPointerException 발생)

                } else {
                    System.out.println("비밀번호가 틀렸습니다. 다시 로그인해 주세요.\n");
                    isSuccess = false;
                    return false;
                }
            }
        }
        System.out.println("가입되지 않은 아이디 입니다. 다시 로그인해 주세요.\n");
        return false;
    }

    public void deleteUserData() {

    }
}