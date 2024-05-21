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
                    System.out.println("player1HorizonCount : "+player1HorizonCount);

                }
                if (currentGomoku[i][j].equals("[X]")) {
                    player2HorizonCount ++;
                    player1HorizonCount = 0;
                    System.out.println("player2HorizonCount : "+player2HorizonCount);

                }
                if (!currentGomoku[i][j].equals("[O]") && !currentGomoku[i][j].equals("[X]")){
                    player1HorizonCount = 0;
                    player2HorizonCount = 0; // 빈 칸이므로 모두 초기화
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
}
