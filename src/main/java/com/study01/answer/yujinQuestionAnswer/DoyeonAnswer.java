package com.study01.answer.yujinQuestionAnswer;

import java.util.Random;
import java.util.Scanner;

public class DoyeonAnswer {

    public static void main(String[] args) {

        Random ran = new Random();
        int num = ran.nextInt(20) + 1;

        DoyeonAnswer answer = new DoyeonAnswer();
        answer.match(num);
    }

    public void match(int num){

        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 20 사이의 숫자를 하나 입력하세요");
        int push = sc.nextInt();

        System.out.println("1부터 20 사이의 난수 : "+num);
        if(push==num){
            System.out.println("맞췄습니다.");
        }else{
            System.out.println("틀렸습니다.");
        }
    }
}
