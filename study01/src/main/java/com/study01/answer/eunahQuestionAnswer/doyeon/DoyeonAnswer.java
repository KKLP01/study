package com.study01.answer.eunahQuestionAnswer.doyeon;

import java.util.Random;
import java.util.Scanner;

public class DoyeonAnswer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("생년월일 8자리를 입력해주세요");
        int birth = sc.nextInt();

        DoyeonAnswer answer = new DoyeonAnswer();
        answer.luck(birth);
    }

    public void luck(int birth){
        Random ran = new Random();
        int num = ran.nextInt(6);
        System.out.println("0-5 중 난수 : "+num);

        if(num==0||birth/10000000==0||birth/10000000>2) {
            System.out.println("프로그램 종료");
        }else {
            int result = birth % num;

            if (result == 0) {
                System.out.println("오늘은 행운의 날입니다! 모든 일이 잘 풀릴 것입니다.");
            } else if (result == 1) {
                System.out.println("오늘은 좋은 일이 생길 것입니다. 기대해도 좋아요.");
            } else if (result == 2) {
                System.out.println("주의해야 할 일이 있을 수 있어요. 조심하세요.");
            } else {
                System.out.println("오늘은 조금 어려운 날이 될 수도 있어요. 힘내세요.");
            }
        }
    }
}
