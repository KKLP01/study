package com.study01.answer.doyeonQuestionAnswer.eunah;

import java.util.Random;
import java.util.Scanner;

public class EunahAnswer {
    public static void main(String[] args) {

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
         */

        Random random = new Random();
        int num = random.nextInt(21) - 10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("-10부터 10까지 정수 하나를 입력하세요. : ");
        int inputNum = scanner.nextInt();

        EunahAnswer eunahAnswer = new EunahAnswer();
        eunahAnswer.finalResult(num, inputNum);

    }

    public int AddSub(int num, int inputNum) {

        int result = num + inputNum;
        int result2 = num - inputNum;

        System.out.println(num + " + " + inputNum + " = " + result);
        System.out.println(num + " - " + inputNum + " = " + result2);

        return result;  // 딱히 돌려줄 것이 없는데.....ㅎㅎ
    }

    public void finalResult(int num, int inputNum) {

        if (inputNum == 0) {
            System.out.println("프로그램 종료");
        } else {
            String checkNum = EunahAnswer_2.CheckNum(num);
            System.out.println(checkNum);
            EunahAnswer eunahAnswer = new EunahAnswer();
            eunahAnswer.AddSub(num, inputNum);
            EunahAnswer_2.MultiDiv(num, inputNum);
            System.out.println("프로그램 종료");

        }
    }

}

