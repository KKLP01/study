package com.study01.answer.yujinQuestionAnswer.yein;

import java.util.Scanner;

public class TwonumberTest {
    String result;

    public String sameTwoNumber(int a) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 20 사이의 숫자 중 원하는 수를 하나 입력하세요. : ");
        int userNumber = sc.nextInt();

        if (userNumber == a) {
            result = "입력하신 숫자는 " + userNumber + "이고, 맞췄습니다.";
        } else result = "발생한 난수는 "+ a +"이고, 입력하신 숫자는 " + userNumber + "입니다." + "틀렸습니다.";

        return result;
    }
}
