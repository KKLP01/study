package main.java.com.kklp.answer.yeinAnswer;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;

public class LoginRepository {

    // 전체 유저 10명 고정
//    private final static User[] users = new User[]{new User(),new User(),new User(),new User(),new User(),new User(),new User(),new User(),new User(),new User()};
//    private final static User[] users = new User[10]
    private final static User[] users = new User[]{null,null,null,null,null,null,null,null,null,null};
    private static int count;

    public int showCount() {
        return count;
    }

    // 회원가입 완료 후 성공 여부를 반환
    public static boolean save(User newUsers) throws InterruptedException {

        LoginService loginService = new LoginService();

        if (count != 10) {

            // 탈퇴한 회원이랑 가입하려는 회원 id/시간 비교
            for (int i = 0; i < deleteUsers.length; i++) {
                if (deleteUsers[i] == null) break;

                Date currentDate = new Date();
                // 아이디 같고 5분 넘었을 때
                if (newUsers.getId().equals(deleteUsers[i].getId()) && deleteUsers[i].getDeleteDate().getTime()+5000 > currentDate.getTime()) {
                    break;

                } else {
                    System.out.println("탈퇴한지 5분이 안되었습니다. 잠시 후 다시 시도해 주세요.");
                    return false;
                }
            }

            // 가입 본격 시도
            for (int i = 0; i < users.length; i++) {
                if (users[i] == null) {
                    users[i] = newUsers;
                    break;
                }
            }
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

        for (int i = 0; i < users.length; i++) {
            if (users[i]==null || users[i].getId()==null){
                continue;
            }
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


    private final static User[] deleteUsers = new User[10];

    public boolean deleteUserData(String currentLoginId) {
        for (int i = 0, k=0; i < users.length; i++) {
            if (users[i] == null) continue;;
            if (users[i].getId().equals(currentLoginId)) {
                deleteUsers[i] = users[i]; // null 처리 전 삭제회원 배열에 저장

                Date deleteDate = new Date();
                deleteUsers[i].setDeleteDate(deleteDate); // 삭제 시간 저장

                users[i] = null;
                count--;
                return true;
            }
        }
        System.out.println( "탈퇴 실패.\n");
        return false;
    }

}