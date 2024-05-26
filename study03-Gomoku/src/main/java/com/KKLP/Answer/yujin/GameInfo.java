package main.java.com.KKLP.Answer.yujin;

public class GameInfo {

    private String[][] array = new String[10][10];
    private boolean isPlay1 = true;


    // 오목 초기화
    public void initializeOmok() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = "•";
            }
        }
    }


    // 오목판 출력
    public void printOmok() {
        // 좌표 출력
        for (int i = 0; i < array[0].length; i++) {
            System.out.print("\t" + i);
        }
        System.out.println();

        // 배열에 담긴 값 출력 = 현재 오목판 출력
        for (int i = 0; i < array.length; i++) {
            System.out.print(i);
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("\t" + array[i][j]);
            }
            System.out.println();
        }
    }


    // 플레이어 정보 출력
    public void getPlayer() {
        System.out.println(isPlay1 ? "Player 1" : "Player 2");
    }


    // 오목돌 놓기 확인
    public boolean placeOmok(int row, int col) {
        // 음수, 배열 범위를 벗어난 값, 비어있지 않는 곳에 접근하면 false 리턴
        if (row < 0 || row >= array.length || col < 0 || col >= array[0].length
                || !array[row][col].equals("•"))
            return false;

        if (isPlay1)    // 플레이어1 이면 흑돌 놓기
            array[row][col] = "●";
        else            // 플레이어2 이면 백돌 놓기
            array[row][col] = "○";
        return true;    // 오목돌을 놓았으면 true 리턴
    }


    // 오목 승리 확인
    public boolean checkWin(int row, int col) {
        CheckOmok check = new CheckOmok();
        String value = isPlay1 ? "●" : "○";
        // 가로, 세로, 대각선 중 하나라도 연속된 5개 이상의 오목돌이 있다면 true 리턴
        // 배열에 값을 비교하기 위해 플레이어의 오목돌 값을 매개변수로 전달
        return check.checkHorizontal(value, array, row, col)
                || check.checkVertical(value, array, row, col)
                || check.checkLeftDiagonal(value, array, row, col)
                || check.checkRightDiagonal(value, array, row, col);
    }


    // 오목 무승부 확인
    public boolean checkDraw(int row, int col) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                // 빈 칸이 있으면 게임 진행 중
                if (array[i][j].equals("•"))
                    return false;
            }
        }
        // 빈칸 없으면 무승부 true 리턴
        return true;
    }


    // 플레이어 교체
    public void changePlayer() {
        isPlay1 = !isPlay1;
    }
}