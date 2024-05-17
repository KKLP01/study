package com.study01.answer.doyeonQuestionAnswer.yein;

public class RandomNumTest {
    // 난수 양수/음수 & 홀/짝 판별 메서드
    public String randomNumberTest(int a) {

        String result = "";

        // String result = (a > 0)? ((a%2==0)? "양수-짝수" : "양수-홀수") : ((a%2==0)? "음수-짝수" : "음수-홀수");

        System.out.println("발생한 난수는 " + a + " 입니다.");

        if (a > 0) {
            if (a%2==0) {
                result = "양수-짝수";
            } else result ="양수-홀수";
        } else if (a < 0) {
            if (a%2==0) {
                result = "음수-짝수";
            } else result = "음수-홀수";
        } else result = "0 이 아닌 정수를 입력해 주세요.";

        return result;

    }

    // 더하기 메서드
    public int add(int b, int c) {
        return b + c;
    }

    // 빼기 메서드
    public int minus(int d, int e) {
        return d - e;
    }
}
