package com.study01.question;

import java.util.Random;
import java.util.Scanner;

public class YujinQuestion {
    /*
     *
     * 숫자 맞추기 게임
     * 1 부터 20 사이의 난수를 1개 발생시켜 입력한 숫자와 일치하는 지 비교
     * 맞추면 맞췄습니다. 틀리면 틀렸습니다. 출력
     *
     * 단, 숫자 일치를 확인하는 메소드를 만들어서 작성
     *
     * */

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = random.nextInt(20) + 1;

        System.out.println("숫자 맞추기 게임 (1~20 사이의 숫자)");
        System.out.print("숫자를 입력하세요 : ");
        int number = scanner.nextInt();

        compareNumber(randomNumber, number);
    }

    // 두 숫자가 일치하는지 비교 메서드
    public static void compareNumber(int randNum, int num) {
        System.out.println((randNum == num) ? "맞췄습니다."
                : "틀렸습니다. 해당 숫자는 " + randNum + "입니다.");
    }

}
