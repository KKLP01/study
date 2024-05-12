package com.study01.answer.doyeonQuestionAnswer.yein;

import java.util.Random;
import java.util.Scanner;

public class YeinAnswer {

    /*
     * -10에서 10까지의 난수를 발생하고, -10에서 10까지의 하나의 정수를 스캐너로 입력받아
     * 난수와 입력받은 정수를 출력하여 확인 후 매개변수로 받아 사칙연산을 계산하고 출력하는 메소드를 코딩하세요
     * (단, 0은 입력 제외. 조건과 상관없이 프로그램이 종료될 때 "프로그램 종료" 출력
     * 난수확인처리와 곱셈-나눗셈 메소드는 동일한 클래스에 작성할 것)
     *
     * 1. 같은 패키지-다른 클래스에 생성(non-static 메소드 하나. 리턴타입은 String)
     * 난수가 양수이며 짝수면 "양수-짝수"출력, 홀수면 "양수-홀수"출력
     *       음수이며 짝수면 "음수-짝수"출력, 홀수면 "음수-홀수"출력
     *
     * 2.
     * 덧셈, 뺄셈은 동일한 클래스에 메소드를 생성하고, (non-static 메소드 하나. 리턴타입은 int)
     * 곱셈, 나눗셈은 같은 패키지-다른 클래스에 메소드를 생성하세요 (static 메소드 하나. 리턴타입은 void)
     *
     * */

    public static void main(String[] args) {

        // 난수 발생
        Random random = new Random();
        int randomNumber = (random.nextInt(21)-10);

        // 난수 양수&홀짝 확인
        RandomNumTest randomNumTest = new RandomNumTest();
        String result = randomNumTest.randomNumberTest(randomNumber);
        System.out.println(result);

        System.out.println("----------------------------------------------");

        // 입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.println("-10부터 10까지의 정수 중 하나를 입력해 주세요.(단, 0 제외) : ");
        int userNumber = sc.nextInt();

        // 난수와 입력 수의 사칙 연산 결과
        System.out.println("입력하신 수는 " + userNumber + "이며,");
        int addResult = randomNumTest.add(randomNumber, userNumber);
        System.out.println("난수와 입력하신 수의 덧셈 결과 : " + addResult);
        int minusResult = randomNumTest.minus(randomNumber, userNumber);
        System.out.println("난수와 입력하신 수의 뺄셈 결과 : " + minusResult);
        multiAndDivide(randomNumber, userNumber);
        System.out.println("입니다.");

        System.out.println("프로그램 종료");
    }

    public static void multiAndDivide(int a, int b) {
        int multiResult = a * b;
        int divideResult = a / b;

        System.out.println("난수와 입력하신 수의 곱셈 결과 : " + multiResult);
        System.out.println("난수와 입력하신 수의 나눗셈 결과 : " + divideResult);
    }
}
