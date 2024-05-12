package com.study01.answer.yeinQuestionAnswer.eunahAnswer_2;

import java.util.Random;

public class EunahLotto {

    public void lotto(int inputNum) {

        Random random = new Random();
        int num1 = random.nextInt(41) - 20;
        int num2 = random.nextInt(41) - 20;

        int minimum = Math.min(num1, num2);

        String result = minimum == inputNum ? "당첨되었습니다!" : "당첨되지 않았습니다.";
        System.out.println("난수는 " + num1 + "와 " + num2 + ", 당첨번호는 " + minimum + "(으)로 " + result);

    }

}
