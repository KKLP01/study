package main.java.com.KKLP.Answer.yujin;

public class CheckOmok {


    // 가로
    public boolean checkHorizontal(String value, String[][] arr, int row, int col) {
        // 오목돌을 하나 놓았기 때문에 count = 1 로 초기화
        int count = 1;

        // 오목돌을 놓은 좌표 기준으로 왼쪽 확인
        for (int i = 1; i < 5; i++) {
            // 배열의 인덱스가 넘어가지 않고 플레이어에 해당하는 오목돌이 있으면 갯수 증가
            if (col - i >= 0 && arr[row][col - i].equals(value))
                count++;
            // 비어있거나 플레이어에 해당하는 값이 아니면 더 확인하지 않고 반복문 나감
            else
                break;
        }

        // 오목돌을 놓은 좌표 기준으로 오른쪽 확인
        for (int i = 1; i < 5; i++) {
            // 배열의 인덱스가 넘어가지 않고 플레이어에 해당하는 오목돌이 있으면 갯수 증가
            if (col + i < arr[0].length && arr[row][col + i].equals(value))
                count++;
            // 비어있거나 플레이어에 해당하는 값이 아니면 더 확인하지 않고 반복문 나감
            else
                break;
        }

        // 갯수가 5개 이상이면 true 리턴
        return count >= 5;
    }


    // 세로
    public boolean checkVertical(String value, String[][] arr, int row, int col) {
        int count = 1;
        // 위
        for (int i = 1; i < 5; i++) {
            if (row - i >= 0 && arr[row - i][col].equals(value))
                count++;
            else
                break;
        }

        // 아래
        for (int i = 1; i < 5; i++) {
            if (row + i < arr.length && arr[row + i][col].equals(value))
                count++;
            else
                break;
        }
        return count >= 5;
    }


    // 왼쪽위 오른쪽아래 대각선
    public boolean checkLeftDiagonal(String value, String[][] arr, int row, int col) {
        int count = 1;
        // 위
        for (int i = 1; i < 5; i++) {
            if (row - i >= 0 && col - i >= 0 && arr[row - i][col - i].equals(value))
                count++;
            else
                break;
        }

        // 아래
        for (int i = 1; i < 5; i++) {
            if (row + i < arr.length && col + i < arr[0].length && arr[row + i][col + i].equals(value))
                count++;
            else
                break;
        }
        return count >= 5;
    }


    // 오른쪽위 왼쪽아래 대각선
    public boolean checkRightDiagonal(String value, String[][] arr, int row, int col) {
        int count = 1;
        // 위
        for (int i = 1; i < 5; i++) {
            if (row - i >= 0 && col + i < arr[0].length && arr[row - i][col + i].equals(value))
                count++;
            else
                break;
        }

        // 아래
        for (int i = 1; i < 5; i++) {
            if (row + i < arr.length && col - i >= 0 && arr[row + i][col - i].equals(value))
                count++;
            else
                break;
        }
        return count >= 5;
    }
}