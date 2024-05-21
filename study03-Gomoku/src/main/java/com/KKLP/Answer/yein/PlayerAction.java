package main.java.com.KKLP.Answer.yein;

import java.util.Arrays;
import java.util.Scanner;

public class PlayerAction {
    CheckGame checkGame = new CheckGame();

    public static String[][] gumoku = new String[10][10];
    int player1Count = 0; // 몇번째 두는 돌인지 체크
    public static int[][] player1 = new int[10][2];

    // 시작 오목판 출력
    public void startGomoku() {
        for (int i = 0; i < gumoku.length; i++) {
            for (int j = 0; j < gumoku.length; j++) {
                gumoku[i][j] = "[ ]";
                System.out.print(gumoku[i][j] + " ");
            }
            System.out.println();
        }
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
            int player1FirstNum = sc.nextInt();
            System.out.println("몇 열을 선택할까요? : ");
            int player1SecondNum = sc.nextInt();

            if (gumoku[player1FirstNum][player1SecondNum].equals("[ ]")) { // 빈 자리라면

                System.out.println(player1FirstNum + "행 " + player1SecondNum + "열에 돌을 둡니다.");
                gumoku[player1FirstNum][player1SecondNum] = "[O]"; // 돌을 둔다

                // 몇행 몇열에 뒀는지 배열에 저장 후 출력
                player1[player1Count][0] = player1FirstNum;
                player1[player1Count][1] = player1SecondNum;
                player1Count++;

                for (int[] ints : player1) {
                    System.out.print(Arrays.toString(ints));
                }
                System.out.println();

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
            int player2FirstNum = sc.nextInt();
            System.out.println("몇 열을 선택할까요? : ");
            int player2SecondNum = sc.nextInt();

            if (gumoku[player2FirstNum][player2SecondNum].equals("[ ]")) {
                System.out.println(player2FirstNum + "행 " + player2SecondNum + "열에 돌을 둡니다.");
                gumoku[player2FirstNum][player2SecondNum] = "[X]";

                currentGomoku();
                return gumoku;

            } else System.out.println("이미 둔 돌이 존재합니다. 다시 입력해 주세요.\n");
        }
    }
}
