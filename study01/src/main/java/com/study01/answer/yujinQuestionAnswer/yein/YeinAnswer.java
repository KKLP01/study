package com.study01.answer.yujinQuestionAnswer.yein;

import java.util.Random;

public class YeinAnswer {
    /*
     *
     * 숫자 맞추기 게임
     * 1 부터 20 사이의 난수를 1개 발생시켜 입력한 숫자와 일치하는 지 비교
     * 맞추면 맞췄습니다. 틀리면 틀렸습니다. 출력
     *
     * 단, 숫자 일치를 확인하는 메소드를 만들어서 작성
     *
     * */

    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(20)+1;

        TwonumberTest twonumberTest = new TwonumberTest();
        System.out.println(twonumberTest.sameTwoNumber(randomNumber));

    }
}
