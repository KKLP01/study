package com.study01.answer.yeinQuestionAnswer.yujin;

import com.study01.answer.yeinQuestionAnswer.yujin.yujinAnswer.Check;

import java.util.Random;
import java.util.Scanner;

public class YujinAnswer {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber1 = random.nextInt(41) - 20;
        int randomNumber2 = random.nextInt(41) - 20;

        Check check = new Check();
        int min = check.getMinNumber(randomNumber1, randomNumber2);

        System.out.println("로또 당첨 확인하기");
        System.out.print("1부터 20까지의 숫자 중 원하는 숫자를 입력해주세요 : ");
        int number = scanner.nextInt();
        System.out.println(check.getResult(min, number));
    }
}
