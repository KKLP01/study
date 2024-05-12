package com.study01.question;

import java.util.Random;
import java.util.Scanner;

public class EunahQuestion {
    public static void main(String[] args) {

        /*
         * [오늘의 운세를 알려드립니다.]
         *
         * 0에서 5까지의 난수를 발생하고, 사용자의 생년월일 8자리를 입력받아
         * 입력받은 생년월일을 난수로 나눠 나머지 값을 구한다.
         *
         * 나머지 값이
         * 0 일 때 "오늘은 행운의 날입니다! 모든 일이 잘 풀릴 것입니다.",
         * 1 일 떄 "오늘은 좋은 일이 생길 것입니다. 기대해도 좋아요.",
         * 2 일 때 "주의해야 할 일이 있을 수 있어요. 조심하세요.",
         * 모두 아닐 때 "오늘은 조금 어려운 날이 될 수도 있어요. 힘내세요." 를 출력한다.
         *
         * 조건과 상관없이 프로그램이 종료될 때 "프로그램 종료" 출력한다.
         *
         * 1. 메인 메소드에서는 생년월일 입력 받는 코드와 운세 메소드를 실행하는 코드만 작성한다.
         * 2. 난수를 발생하고, 입력받은 생년월일과 난수의 나머지 값을 구하고
         *    나머지값을 받아 해당 값에 맞는 운세를 출력하는 운세 메소드를 생성한다.
         */



        // Scanner 객체 생성
        Scanner scr = new Scanner(System.in);

        // 사용자에게 8자리 생년월일을 입력받음
        System.out.println("오늘의 운세를 알려드릴게요. 본인의 8자리 생년월일을 입력해주세요. (예: 19900101): ");
        int birth = scr.nextInt();

        // 운세 결정 및 출력
        fortune(birth);

    }

    // 운세 결정 및 출력 메소드
    public static void fortune(int birth) {
        // 0~5 까지의 난수 생성
        Random rand = new Random();
        int randNum = rand.nextInt(6);

        // 입력받은 생년월일을 난수로 나눈 나머지를 변수에 저장
        int remainder = birth % randNum;

        // 운세 결정 (삼항연산자 중첩사용)
        String fortune = (remainder == 0) ? "오늘은 행운의 날입니다! 모든 일이 잘 풀릴 것입니다."
                : (remainder == 1) ? "오늘은 좋은 일이 생길 것입니다. 기대해도 좋아요."
                : (remainder == 2) ? "주의해야 할 일이 있을 수 있어요. 조심하세요."
                : "오늘은 조금 어려운 날이 될 수도 있어요. 힘내세요.";

        // 운세 출력
        System.out.println("오늘의 운세: " + fortune);

    }

}
