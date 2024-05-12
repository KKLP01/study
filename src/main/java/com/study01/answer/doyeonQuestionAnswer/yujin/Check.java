package com.study01.answer.doyeonQuestionAnswer.yujin;

public class Check {
    public String getResult(int num) {
        return (num > 0) ? ((num % 2 == 0) ? "양수-짝수" : "양수-홀수")
                : ((num % 2 == 0) ? "음수-짝수" : "음수-홀수");
    }

    public static void Mul(int num1, int num2) {
        System.out.println(num1 + " * " + num2 + " = " + num1 * num2);
    }

    public void Div(int num1, int num2) {
        System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
    }
}
