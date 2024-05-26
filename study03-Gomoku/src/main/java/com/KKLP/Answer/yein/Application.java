package main.java.com.KKLP.Answer.yein;

public class Application {

    public static void main(String[] args) {
        PlayerAction playerAction = new PlayerAction();
        CheckGame checkGame = new CheckGame();

        // 시작 오목판 보여주기
        playerAction.startGomoku();

        // 플레이어 핑퐁하기
        while (true) {

            boolean isDone;
            // true : 아직 승부 판별 불가
            // false : 승부가 끝난 상태

            // player1 돌 놓기
            String[][] afterPlayer1 = playerAction.player1Input();

            // 승부 검증
            isDone = checkGame.checkHorizon(afterPlayer1);
            if (isDone == false) break;
            isDone = checkGame.checkVertical(afterPlayer1);
            if (isDone == false) break;
            isDone = checkGame.checkCross(afterPlayer1);
            if (isDone == false) break;

            // player2 돌 놓기
            String[][] afterPlayer2 = playerAction.player2Input();

            // 승부 검증
            isDone = checkGame.checkHorizon(afterPlayer2);
            if (isDone == false) break;
            isDone = checkGame.checkVertical(afterPlayer2);
            if (isDone == false) break;
            isDone = checkGame.checkCross(afterPlayer2);
            if (isDone == false) break;


        }
    }
}
