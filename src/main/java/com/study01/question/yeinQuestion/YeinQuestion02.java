package com.study01.question.yeinQuestion;

import java.util.Scanner;

public class YeinQuestion02 {
    public String testTwoNumber(int a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 20까지의 숫자 중 원하는 숫자를 입력해주세요 : ");

        int inputNum = sc.nextInt();

        System.out.println("입력하신 숫자는 " + inputNum + "이며, ");

        String result = (a < 0) ? ((Math.abs(a) == inputNum) ? "당첨입니다!" : "당첨되지 않았습니다.")
                : ((inputNum == a) ? "당첨입니다!" : "당첨되지 않았습니다.");

        return result;
    }
}
