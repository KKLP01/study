package com.study01.answer.doyeonQuestionAnswer.yujin;

import java.util.Random;
import java.util.Scanner;

public class YujinAnswer {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("-10에서 10사이의 숫자 하나를 입력하세요 : ");
        int num = sc.nextInt();
        int randomNum = rand.nextInt(21) - 10;

        if (randomNum == 0 || num == 0 || num > 10 || num < -10) {
            System.out.println("프로그램 종료");
            System.exit(0);
        }

        Check ck = new Check();
        System.out.println(ck.getResult(randomNum));

        YujinAnswer answer = new YujinAnswer();
        System.out.println(randomNum + " + " + num + " = " + answer.Add(randomNum, num));
        System.out.println(randomNum + " - " + num + " = " + Sub(randomNum, num));
        Check.Mul(randomNum, num);
        ck.Div(randomNum, num);
    }

    public int Add(int num1, int num2) {
        return num1 + num2;
    }

    public static int Sub(int num1, int num2) {
        return num1 - num2;
    }
}
