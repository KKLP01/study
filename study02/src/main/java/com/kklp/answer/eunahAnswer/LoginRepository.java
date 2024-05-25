package main.java.com.kklp.answer.eunahAnswer;

public class LoginRepository {

    private final static UserDTO[] users = new UserDTO[10];

    private static int count;

    // ID 중복 체크 메소드 추가
    public boolean isIdDuplicate(String id) {
        // 향상된 for 문으로 배열 전체 조회 비교
        for (UserDTO user : users) {
            if (user != null && user.getId().equals(id)) {
                return true; // ID가 이미 존재함
            }
        }
        return false; // ID가 중복되지 않음
    }

    public boolean join(UserDTO userDTO) {
        if (count < 10) {
            users[count++] = userDTO;
            return true;
        } else {
            System.out.println("유저가 꽉 찼습니다.");
            return false;
        }
    }

    public int login(UserDTO userDTO) {
        if (users[0] == null) {
            System.out.println("등록된 회원이 없습니다.");
            return 2;
        }

        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getId().equals(userDTO.getId())) {
                if (users[i].getPwd().equals(userDTO.getPwd())) {
                    return 0;
                }
            }
        }
        System.out.println("아이디나 비밀번호가 다릅니다.");
        return 1;
    }

    // 회원탈퇴 처리 메소드
    public boolean deleteUser(String userId) {
        // 모든 사용자 정보를 순회하며 탈퇴 시도
        for (int i = 0; i < users.length; i++) {
            // 사용자가 배열에 존재하고, 매개변수로 받은 userId가 일치하는 경우
            if (users[i] != null && users[i].getId().equals(userId)) {
                // 해당 사용자 정보를 null로 설정
                users[i] = null;
                // 배열을 재정렬하여 빈 공간 삭제
                for (int j = i; j < users.length - 1; j++) {
                    users[j] = users[j + 1];
                }
                // 마지막 공간은 다음 인덱스가 없기 때문에 null로 최종 처리
                users[users.length - 1] = null;

                // 사용자 수 감소
                count--;

                // 배열 재정렬 값 출력 확인
                System.out.println("탈퇴 시 회원목록 : ");
                for (int c = 0; c < users.length; c++) {
                    if (users[c] != null) {
                        System.out.println((c + 1) + " 번째 회원 : " + users[c] + "");
                    } else {
                        System.out.println("더 이상 회원이 없습니다.");
                        break;
                    }
                }
                return true;
            }
        }
        return false;
    }
}