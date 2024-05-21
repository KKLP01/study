package main.java.com.KKLP.Answer.yein;

public class Application {

    public static void main(String[] args) {

        PlayerAction playerAction = new PlayerAction();
        CheckGame checkGame = new CheckGame();

        // 시작 오목판 보여주기
        playerAction.startGomoku();

        // 플레이어 핑퐁하기
        while (true) {

            checkGame.checkHorizon(playerAction.player1Input());
            checkGame.checkHorizon(playerAction.player2Input());

            // 이곳에 승리를 판별하는 메서드 작성할 것
            // true : 아직 승부 판별 못하는 상태
            // false : 승부가 끝난 상태
        }
    }
}
