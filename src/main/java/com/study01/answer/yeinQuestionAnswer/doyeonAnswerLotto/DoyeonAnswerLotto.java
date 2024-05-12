package com.study01.answer.yeinQuestionAnswer.doyeonAnswerLotto;

import java.util.Random;
import java.util.Scanner;

public class DoyeonAnswerLotto {
    public String lottoNumber(){

        Random ran = new Random();
        int num1 = ran.nextInt(41)-20;
        int num2 = ran.nextInt(41)-20;
        int min = 0;

        if(num1>num2){
            min=num2;
        }else{
            min=num1;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 20까지의 숫자 중 원하는 숫자를 입력해주세요 : ");
        int push = sc.nextInt();

        System.out.println(num1+", "+num2+" 중 최솟값은 "+min);
        return (min==push)? "당첨되었습니다!":"당첨되지 않았습니다.";
    }
}

