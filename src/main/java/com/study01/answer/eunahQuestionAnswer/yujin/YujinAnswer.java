package com.study01.answer.eunahQuestionAnswer.yujin;

import java.util.Random;
import java.util.Scanner;

public class YujinAnswer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[오늘의 운세를 알려드립니다.]");
        System.out.print("생년월일 8자리를 입력해주세요 : ");
        int birthday = sc.nextInt();

        YujinAnswer answer = new YujinAnswer();
        answer.getResult(birthday);
    }

    public void getResult(int bday) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(6);

        if (randomNumber == 0) {
            System.out.println("프로그램 종료");
            return;
        }

        int remainder = bday % randomNumber;

        System.out.println((remainder == 0) ? "오늘은 행운의 날입니다! 모든 일이 잘 풀릴 것입니다."
                : (remainder == 1) ? "오늘은 좋은 일이 생길 것입니다. 기대해도 좋아요."
                : (remainder == 2) ? "주의해야 할 일이 있을 수 있어요. 조심하세요."
                : "오늘은 조금 어려운 날이 될 수도 있어요. 힘내세요.");
    }
}
