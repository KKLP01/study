package com.study01.answer.doyeonQuestionAnswer;

import java.util.Random;
import java.util.Scanner;

public class DoyeonAnswer {
    public static void main(String[] args) {

        Random ran = new Random();
        int num1 = ran.nextInt(21)-10;

        Scanner sc = new Scanner(System.in);
        System.out.println("-10에서 10까지의 하나의 정수를 입력하세요");
        int num2 = sc.nextInt();

        if(num1==0||num2==0||num2<-10||num2>10){
            System.out.println("프로그램 종료");
        }else{
            System.out.println("-10에서 10까지의 난수: "+num1+" 입력값: "+num2);
            DoyeonAnswer2 check = new DoyeonAnswer2();
            System.out.println("----------난수 확인----------");
            System.out.println(check.number(num1));

            System.out.println("----------덧셈-뺄셈----------");
            DoyeonAnswer pm = new DoyeonAnswer();
            int minus = pm.plusMinus(num1, num2);
            System.out.println(num1+", "+num2+"의 뺄셈값 : "+minus);

            System.out.println("----------곱셈-나눗셈----------");
            DoyeonAnswer2.multiDiv(num1, num2);
        }
    }

    public int plusMinus(int a, int b){
        System.out.println(a+", "+b+"의 덧셈값 : "+(a+b));
        return a-b;
    }
}
