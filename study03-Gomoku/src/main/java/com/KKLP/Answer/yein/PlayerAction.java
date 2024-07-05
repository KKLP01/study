package main.java.com.KKLP.Answer.yein;

import java.util.Arrays;
import java.util.Scanner;

public class PlayerAction {

    public static String[][] gumoku = new String[11][11];

    // 시작 오목판 세팅
    public void startGomoku() {

        gumoku[0][0] = "   ";

        for (int i = 1; i < gumoku.length; i++) {
            gumoku[0][i] = String.valueOf(i-1)+"  ";
            gumoku[i][0] = String.valueOf(i-1)+" ";
        }

        for (int i = 0; i < gumoku.length-1; i++) {
            for (int j = 0; j < gumoku.length-1; j++) {
                gumoku[i+1][j+1] = "[ ]";
            }
        }
        currentGomoku();
    }

    // 현재 오목판 출력
    public static void currentGomoku() {
        for (int i = 0; i < gumoku.length; i++) {
            for (int j = 0; j < gumoku.length; j++) {
                System.out.print(gumoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    // player1 의 돌놓기
    public String[][] player1Input() {

        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("player1 의 차례입니다.");
            System.out.println("몇 행을 선택할까요? : ");
            int player1FirstNum = sc.nextInt()+1;
            System.out.println("몇 열을 선택할까요? : ");
            int player1SecondNum = sc.nextInt()+1;

            if (gumoku[player1FirstNum][player1SecondNum].equals("[ ]")) { // 빈 자리라면

                System.out.println((player1FirstNum-1) + "행 " + (player1SecondNum-1) + "열에 돌을 둡니다.");
                gumoku[player1FirstNum][player1SecondNum] = "[O]"; // 돌을 둔다

                // 돌을 둔 후 현재 오목판 출력
                currentGomoku();
                return gumoku;

            } else System.out.println("이미 둔 돌이 존재합니다. 다시 입력해 주세요.\n");
        }
    }

    // player2 의 돌놓기
    public String[][] player2Input() {

        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("player2 의 차례입니다.");
            System.out.println("몇 행을 선택할까요? : ");
            int player2FirstNum = sc.nextInt()+1;
            System.out.println("몇 열을 선택할까요? : ");
            int player2SecondNum = sc.nextInt()+1;

            if (gumoku[player2FirstNum][player2SecondNum].equals("[ ]")) {
                System.out.println((player2FirstNum-1) + "행 " + (player2SecondNum-1) + "열에 돌을 둡니다.");
                gumoku[player2FirstNum][player2SecondNum] = "[X]";

                currentGomoku();
                return gumoku;

            } else System.out.println("이미 둔 돌이 존재합니다. 다시 입력해 주세요.\n");
        }
    }
}
