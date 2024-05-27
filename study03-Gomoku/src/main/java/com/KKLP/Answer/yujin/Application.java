package main.java.com.KKLP.Answer.yujin;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GameInfo game = new GameInfo();

        System.out.println("오목 게임을 시작합니다.");
        game.initializeOmok();  // 오목판 초기화


        while (true) {
            game.printOmok();   // 오목판 출력
            game.getPlayer();   // 플레이어 정보 출력

            // 행 열 입력
            int row = 0;
            int col = 0;
            boolean isInput = false;
            while (!isInput) {
                try {
                    System.out.print("행 입력 : ");
                    row = sc.nextInt();
                    System.out.print("열 입력 : ");
                    col = sc.nextInt();
                    isInput = true; // 정수를 입력 받았을 때만 isInput을 true로 설정
                } catch (InputMismatchException e) {
                    System.out.println("정수를 입력하세요");
                    sc.next();  // 잘못 입력된 값을 받아서 버림
                }
            }


            // 게임 진행 및 결과
            boolean isTrue = game.placeOmok(row, col);  // 오목돌 놓기 결과
            if (isTrue) {   // 오목돌 놓기
                if (game.checkWin(row, col)) {  // 오목 성공
                    game.printOmok();   // 오목판 출력
                    game.getPlayer();   // 플레이어 출력
                    System.out.println("오목에 성공하여 승리하였습니다.");
                    System.out.println("게임을 종료합니다.");
                    return;     // 무한반복문을 종료하여 프로그램을 종료
                }

                if (game.checkDraw(row, col)) {  // 무승부
                    game.printOmok();
                    System.out.println("무승부입니다.");
                    System.out.println("게임을 종료합니다.");
                    return;
                }
                game.changePlayer();   // 오목돌을 놓은 후 플레이어 교체
            } else {
                System.out.println("위치를 잘못 선택했습니다.");
            }
        }
    }
}