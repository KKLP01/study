package com.study01.answer.yeinQuestionAnswer.eunah;

import java.util.Scanner;
import com.study01.answer.yeinQuestionAnswer.eunahAnswer_2.EunahLotto;

public class EunahAnswer {
    public static void main(String[] args) {

        /*
         * 문제) 로또 당첨 확인하기
         * 1. -20 에서 20 사이의 난수를 2개 발생시켜서 두 수 중 최솟값을 구한다.
         * 2. 유저로부터 1부터 20 사이의 숫자 한개를 입력받는다.
         * 3. 입력받은 수와 난수의 최솟값이 일치하면 "당첨되었습니다!", 일치하지 않으면 "당첨되지 않았습니다." 를 출력한다.
         *
         * 제약사항)
         * 1. 다른 패키지에 클래스를 생성해 임포트 시킨 뒤 메인 메서드에 출력하시오.
         * 2. 유저에게 숫자를 입력받을 때 "1부터 20까지의 숫자 중 원하는 숫자를 입력해주세요 : " 라는 메시지를 먼저 출력해준다.
         */

        Scanner scr = new Scanner(System.in);
        System.out.println("1부터 20까지의 숫자 중 원하는 숫자를 입력해주세요 : ");
        int inputNum = scr.nextInt();

        EunahLotto eunahLotto = new EunahLotto();
        eunahLotto.lotto(inputNum);

    }

}

