package com.study01.answer.doyeonQuestionAnswer;

public class DoyeonAnswer2 {
    public String number(int num){
        return (num>0)? (num%2==0)? "양수-짝수":"양수-홀수":(num%2==0)? "음수-짝수":"음수-홀수";
    }

    public static void multiDiv(int a, int b){
        System.out.println(a+", "+b+"의 곱셈값 : "+(a*b));
        System.out.println(a+", "+b+"의 나눗셈값 : "+(a/b));
    }
}
