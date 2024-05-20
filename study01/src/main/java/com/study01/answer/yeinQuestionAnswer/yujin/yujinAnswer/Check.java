package com.study01.answer.yeinQuestionAnswer.yujin.yujinAnswer;

public class Check {
    public int getMinNumber(int random1, int random2) {
        return (random1 > random2) ? random2 : random1;
    }

    public String getResult(int min, int num) {
        return (min == num) ? "당첨되었습니다!" : "당첨되지 않았습니다.";
    }
}
