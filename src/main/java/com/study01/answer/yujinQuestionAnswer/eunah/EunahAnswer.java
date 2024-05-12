package com.study01.answer.yujinQuestionAnswer.eunah;

import java.util.Random;
import java.util.Scanner;

public class EunahAnswer {
    public static void main(String[] args) {

        /*
         * 숫자 맞추기 게임
         * 1 부터 20 사이의 난수를 1개 발생시켜 입력한 숫자와 일치하는 지 비교
         * 맞추면 맞췄습니다. 틀리면 틀렸습니다. 출력
         *
         * 단, 숫자 일치를 확인하는 메소드를 만들어서 작성
         */

        Scanner scr = new Scanner(System.in);
        System.out.println("1부터 20 사이의 숫자를 하나 입력하세요 : ");
        int inputNum = scr.nextInt();

        EunahAnswer eunah = new EunahAnswer();
        eunah.numGame(inputNum);

    }

    public void numGame(int inputNum) {

        Random random = new Random();
        int num = random.nextInt(20) + 1;

        String result = num == inputNum ? "맞췄습니다." : "틀렸습니다.";
        System.out.println("난수는 " + num + " 이고, " + "입력하신 숫자는 " + inputNum + " (으)로 " + result);

    }

}
