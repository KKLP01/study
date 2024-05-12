package com.study01.answer.yeinQuestionAnswer;

import com.study01.answer.yeinQuestionAnswer.doyeonAnswerLotto.DoyeonAnswerLotto;

public class DoyeonAnswer {
    public static void main(String[] args) {

        DoyeonAnswerLotto answer = new DoyeonAnswerLotto();
        String result = answer.lottoNumber();

        System.out.println(result);

    }
}
