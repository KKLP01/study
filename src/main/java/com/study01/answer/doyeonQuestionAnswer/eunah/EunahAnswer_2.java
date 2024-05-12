package com.study01.answer.doyeonQuestionAnswer.eunah;

public class EunahAnswer_2 {

    public static void MultiDiv(int num, int inputNum) {
        if (inputNum != 0) {
            int result = num * inputNum;
            int result2 = num / inputNum;
            System.out.println(num + " * " + inputNum + " = " + result);
            System.out.println(num + " / " + inputNum + " = " + result2);
        } else {
            System.out.println("프로그램 종료");
        }
    }

    public static String CheckNum(int num) {
        if (num > 0) {
            return (num % 2 == 0) ? "양수-짝수" : "양수-홀수";
        } else if (num < 0) {
            return (num % 2 == 0) ? "음수-짝수" : "음수-홀수";
        } else {
            return "0 이외의 수를 입력해주세요.";
        }

    }

}
