package com.study01.answer.eunahQuestionAnswer.yein;

public class FortuneTest {

    String result;
    public String fortune(int a) {

        if (a == 0) {
            result = "오늘은 행운의 날입니다! 모든 일이 잘 풀릴 것입니다.";
        } else if (a == 1) {
            result = "오늘은 좋은 일이 생길 것입니다. 기대해도 좋아요.";
        } else if (a == 2) {
            result = "주의해야 할 일이 있을 수 있어요. 조심하세요";
        } else result = "오늘은 조금 어려운 날이 될 수도 있어요. 힘내세요";

        return result;
    }
}
