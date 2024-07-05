package main.java.com.KKLP.Answer.yein;

public class CheckGame {

    // 게임의 진행을 판단 (승부판단)
    // 승리자가 없으면 : true, 승리자가 있으면 : false 반환
    
    // 가로방향 확인
    public boolean checkHorizon(String[][] currentGomoku) {

        int player1HorizonCount; // player1 가로방향 돌 갯수
        int player2HorizonCount; // player2 가로방향 돌 갯수

        for (int i = 0; i < currentGomoku.length; i++) {

            player1HorizonCount = 0;
            player2HorizonCount = 0;

            for (int j = 0; j < currentGomoku[i].length; j++) {

                if (currentGomoku[i][j].equals("[O]")) {
                    player1HorizonCount ++;
                    player2HorizonCount = 0;
                }

                if (currentGomoku[i][j].equals("[X]")) {
                    player2HorizonCount ++;
                    player1HorizonCount = 0;
                }

                if (!currentGomoku[i][j].equals("[O]") && !currentGomoku[i][j].equals("[X]")){
                    player1HorizonCount = 0;
                    player2HorizonCount = 0;
                }

                if (player1HorizonCount == 5) {
                    System.out.println("Player 1 wins!");
                    return false;

                } else if (player2HorizonCount == 5) {
                    System.out.println("Player 2 wins!");
                    return false;
                }
            }
        }
        return true;
    }

    // 세로 방향
    public boolean checkVertical(String[][] currentGomoku) {

        int player1VerticalCount;
        int player2VerticalCount;

        for (int i = 0; i < currentGomoku.length; i++) {

            player1VerticalCount = 0;
            player2VerticalCount = 0;

            for (int j = 0; j < currentGomoku[i].length; j++) {

                if (currentGomoku[j][i].equals("[O]")) {
                    player1VerticalCount ++;
                    player2VerticalCount = 0;

                }
                if (currentGomoku[j][i].equals("[X]")) {
                    player2VerticalCount ++;
                    player1VerticalCount = 0;

                }
                if (!currentGomoku[j][i].equals("[O]") && !currentGomoku[j][i].equals("[X]")){
                    player1VerticalCount = 0;
                    player2VerticalCount = 0;
                }

                if (player1VerticalCount == 5) {
                    System.out.println("Player 1 wins!");
                    return false;

                } else if (player2VerticalCount == 5) {
                    System.out.println("Player 2 wins!");
                    return false;
                }
            }
        }
        return true;
    }

    // 대각선 확인
    public boolean checkCross(String[][] currentGomoku) {

        for (int i = 1; i < currentGomoku.length; i++) {
            for (int j = 1; j < currentGomoku[i].length; j++) {

                // 왼쪽 아래 (+,-)
                if (i + 4 < currentGomoku.length && j - 4 > 0) {
                    if (currentGomoku[i][j].equals("[O]") && currentGomoku[i+1][j-1].equals("[O]") &&
                            currentGomoku[i+2][j-2].equals("[O]") && currentGomoku[i+3][j-3].equals("[O]") &&
                            currentGomoku[i+4][j-4].equals("[O]")) {
                        System.out.println("Player 1 wins!");
                        return false;

                    } else if (currentGomoku[i][j].equals("[X]") && currentGomoku[i+1][j-1].equals("[X]") &&
                            currentGomoku[i+2][j-2].equals("[X]") && currentGomoku[i+3][j-3].equals("[X]") &&
                            currentGomoku[i+4][j-4].equals("[X]")) {
                        System.out.println("Player 2 wins!");
                        return false;
                    }
                }

                // 오른쪽 아래 대각선 (+,+)
                if (i + 4 < currentGomoku.length && j + 4 < currentGomoku[i].length) {
                    if (currentGomoku[i][j].equals("[O]") && currentGomoku[i+1][j+1].equals("[O]") &&
                            currentGomoku[i+2][j+2].equals("[O]") && currentGomoku[i+3][j+3].equals("[O]") &&
                            currentGomoku[i+4][j+4].equals("[O]")) {
                        System.out.println("Player 1 wins!");
                        return false;

                    } else if (currentGomoku[i][j].equals("[X]") && currentGomoku[i+1][j+1].equals("[X]") &&
                            currentGomoku[i+2][j+2].equals("[X]") && currentGomoku[i+3][j+3].equals("[X]") &&
                            currentGomoku[i+4][j+4].equals("[X]")) {
                        System.out.println("Player 2 wins!");
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
