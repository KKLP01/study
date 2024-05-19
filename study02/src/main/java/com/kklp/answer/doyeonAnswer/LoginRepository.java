package main.java.com.kklp.answer.doyeonAnswer;

public class LoginRepository {

    //private final static User[] users = new User[10]; 선언과 동시 초기화
    private final static User[] users;
    private static int count;

    //static초기화
    static {
        users = new User[10];
    }


    public boolean store(User newUser) {            //DB저장

        System.out.println("가입 전 DB 속 데이터 수: "+count);
        if (count < 10) {
            users[count] = newUser;         //초기화
            System.out.println("해당 데이터 users["+count+"]="+users[count]+"로 초기화");
            count++;            //객체 배열 속 객체 증가

            System.out.println("가입되었습니다");
            System.out.println("가입 후 DB 속 데이터 수: "+count);
            return true;
        } else {
            System.out.println("정원초과");
            return false;
        }
    }


    public User[] findAllUsers() {          //final static 객체배열 접근
        return users;
    }


    public void storeDel(User newUser) {            //DB삭제

        System.out.println("탈퇴 전 DB 속 데이터 수: "+count);
        for (int i = 0; i < count; i++) {
            if (users[i].getId().equals(newUser.getId())&&users[i].getPwd().equals(newUser.getPwd())) {
                users[i] = null;            //초기화
                System.out.println("해당 데이터 users["+i+"]="+users[i]+"로 초기화");
                break;
            }
        }

        for (int j = 1; j < count; j++) {           //DB정렬
            if (users[j - 1] == null && users[j] != null) {
                users[j - 1] = users[j];
                users[j] = null;
            }
            System.out.println(j+"번째 데이터: "+users[j-1]);            //정렬된 DB출력
        }

        count--;            //객체 배열 속 객체 감소
        System.out.println("탈퇴되었습니다");
        System.out.println("탈퇴 후 DB 속 데이터 수: "+count);
    }
}

