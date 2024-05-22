package main.java.com.KKLP.Answer.yein;

public class Application {

    public static void main(String[] args) {

        PlayerAction playerAction = new PlayerAction();
        CheckGame checkGame = new CheckGame();

        // 시작 오목판 보여주기
        playerAction.startGomoku();

        // 플레이어 핑퐁하기
        while (true) {
            // true : 아직 승부 판별 못하는 상태
            // false : 승부가 끝난 상태

            boolean isDone;

            String[][] afterPlayer1 = playerAction.player1Input();
            isDone = checkGame.checkHorizon(afterPlayer1);
            isDone = checkGame.checkVertical(afterPlayer1);

            if (isDone == false) {
                break;
            }

            String[][] afterPlayer2 = playerAction.player2Input();
            isDone = checkGame.checkHorizon(afterPlayer2);
            isDone = checkGame.checkVertical(afterPlayer2);
            if (isDone == false) {
                break;
            }
        }
    }
}
