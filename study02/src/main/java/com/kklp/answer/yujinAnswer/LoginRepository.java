package main.java.com.kklp.answer.yujinAnswer;

public class LoginRepository {

    private final static UserDTO[] users = new UserDTO[10];

    private static int count;


    public boolean checkUsers() {
        return users[0] == null;
    }


    public boolean checkId(String id) {
        for (int i = 0; i < count; i++) {
            if (id.equals(users[i].getId())) {
                return true;
            }
        }
        return false;
    }


    public boolean login(UserDTO user) {
        for (int i = 0; i < count; i++) {
            if (users[i].getId().equals(user.getId())
                    && users[i].getPwd().equals(user.getPwd())) {
                return true;
            }
        }
        return false;
    }


    public boolean signUp(UserDTO user) {
        if (count < 10) {
            users[count++] = user;
            return true;
        } else {
            return false;
        }
    }


    public void delete(UserDTO user) {

        int index = 0;

        // 탈퇴 전 users 갯수까지 회원가입한 정보들과
        // 로그인한 정보를 확인하여 로그인한 유저의 인덱스 값을 저장함
        for (int i = 0; i < count; i++) {
            if (user.getId().equals(users[i].getId())
                    && user.getPwd().equals(users[i].getPwd())) {
                index = i;
                break;
            }
        }

        // 탈퇴한 유저의 인덱스를 기준으로 그 이후의 유저들의
        // 정보를 한칸씩 앞당기며 탈퇴한 유저의 정보를 지움
        for (int i = index; i < count - 1; i++) {
            users[i] = users[i + 1];
        }

        // 하나씩 인덱스를 당겨준 후 마지막 인덱스 값을 지워줌
        // 예를 들어 탈퇴하기 전 users의 갯수(count)가 6이면 인덱스는 0~5까지 있음
        // 따라서 기존의 5번 인덱스의 값을 지워줘야하기 때문에 count-1 인덱스 값을 지워줌
        users[count - 1] = null;

        // users 갯수를 하나 줄임
        count--;
    }


    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println("아이디 : " + users[i].getId()
                    + ", 비밀번호 : " + users[i].getPwd() + ", 이름 : " + users[i].getName());
        }
    }
}