package com.study01.question.yeinQuestion;

import java.util.Random;

public class YeinQuestion {
    public static void main(String[] args) {

        /*
         * 문제. 로또 당첨 확인하기
         *
         * 1. -20 에서 20 사이의 난수를 2개 발생시켜서 두 수 중 최솟값을 구한 뒤 난수가 음수라면 절댓값으로 변경한다.
         * 2. 유저로부터 0부터 20 사이의 숫자 한개를 입력받는다.
         * 3. 입력받은 수와 난수의 최솟값이 일치하면 "당첨되었습니다!", 일치하지 않으면 "당첨되지 않았습니다." 를 출력한다.
         *
         * 제약사항.
         *
         * 1. 다른 패키지에 클래스를 생성해 임포트 시킨 뒤 메인 메서드에 출력하시오.
         * 2. 유저에게 숫자를 입력받을 때 "0부터 20까지의 숫자 중 원하는 숫자를 입력해주세요 : " 라는 메시지를 먼저 출력해준다.
         * */

        // 난수 2개 발생
        Random random = new Random();
        int randomNum1 = (int)(random.nextInt(40)-20);
        int randomNum2 = (int)(random.nextInt(40)-20);

        // 두 난수 중 최솟값 도출
        int min = Math.min(randomNum1, randomNum2);

        // 로또 돌리기
        YeinQuestion02 testMethod = new YeinQuestion02();
        String result = testMethod.testTwoNumber(min);
        System.out.println(result);

    }
}
