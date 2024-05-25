package main.java.com.KKLP.Answer.doyeon;

import java.util.Scanner;

public class DoyeonAnswer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[10][10];


        System.out.println("===============오목게임===============");
        //10x10 오목판
        for(int i=1; i<=arr.length; i++){
            System.out.print("   "+i);
        }
        System.out.println();
        for(int i=0; i<arr.length; i++){
            System.out.print(i+1);
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]='.';
                System.out.print("   "+arr[i][j]);
            }
            System.out.println();
        }

        //행, 열, 차례, 승자변수 선언 및 초기화
        int x;
        int y;
        int turn=0;
        String winner="";

        while(true){

            if(turn%2==0){          //홀수턴=플레이어1
                for(;;) {
                    System.out.println("----------Player1 차례입니다----------");
                    System.out.print("바둑 놓을 행 번호 : ");
                    x = sc.nextInt();
                    System.out.print("바둑 놓을 열 번호 : ");
                    y = sc.nextInt();

                    if (arr[x-1][y-1] != 'x' && arr[x-1][y-1] != 'o') {
                        arr[x-1][y-1] = 'x';            //빈칸이면 바둑돌두기
                        turn += 1;          //차례증가

                        //바둑판 출력
                        for(int i=1; i<=arr.length; i++){
                            System.out.print("   "+i);
                        }
                        System.out.println();
                        for(int i=0; i<arr.length; i++){
                            System.out.print(i+1);
                            for(int j=0; j<arr[i].length; j++){
                                System.out.print("   "+arr[i][j]);
                            }
                            System.out.println();
                        }
                        break;          //무한for문 나가기
                    } else {
                        System.out.println("이선좌 입니다");          //빈칸아니면 출력 후 무한for문반복
                    }
                }
            }else if(turn%2==1){    //짝수턴=플레이어2
                for(;;) {
                    System.out.println("----------Player2 차례입니다----------");
                    System.out.print("바둑 놓을 행 번호 : ");
                    x = sc.nextInt();
                    System.out.print("바둑 놓을 열 번호 : ");
                    y = sc.nextInt();

                    if (arr[x-1][y-1] != 'x' && arr[x-1][y-1] != 'o') {
                        arr[x-1][y-1] = 'o';            //빈칸이면 바둑돌두기
                        turn += 1;          //차례증가

                        //바둑판 출력
                        for(int i=1; i<=arr.length; i++){
                            System.out.print("   "+i);
                        }
                        System.out.println();
                        for(int i=0; i<arr.length; i++){
                            System.out.print(i+1);
                            for(int j=0; j<arr[i].length; j++){
                                System.out.print("   "+arr[i][j]);
                            }
                            System.out.println();
                        }
                        break;          //무한for문 나가기
                    } else {
                        System.out.println("이선좌 입니다");          //빈칸아니면 출력 후 무한for문반복
                    }
                }
            }

            //가로확인
            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr[i].length-4; j++){
                    if(arr[i][j]=='x'&&arr[i][j+1]=='x'&&arr[i][j+2]=='x'&&arr[i][j+3]=='x'&&arr[i][j+4]=='x'){
                        winner="P1";
                    }
                    if(arr[i][j]=='o'&&arr[i][j+1]=='o'&&arr[i][j+2]=='o'&&arr[i][j+3]=='o'&&arr[i][j+4]=='o'){
                        winner="P2";
                    }
                }
            }

            //세로확인
            for(int i=0; i<arr.length-4; i++){
                for(int j=0; j<arr[i].length; j++){
                    if(arr[i][j]=='x'&&arr[i+1][j]=='x'&&arr[i+2][j]=='x'&&arr[i+3][j]=='x'&&arr[i+4][j]=='x'){
                        winner="P1";
                    }
                    if(arr[i][j]=='o'&&arr[i+1][j]=='o'&&arr[i+2][j]=='o'&&arr[i+3][j]=='o'&&arr[i+4][j]=='o'){
                        winner="P2";
                    }
                }
            }

            //위아래 대각선
            for(int i=0; i<arr.length-4; i++){
                for(int j=0; j<arr[i].length-4; j++){
                    if(arr[i][j]=='x'&&arr[i+1][j+1]=='x'&&arr[i+2][j+2]=='x'&&arr[i+3][j+3]=='x'&&arr[i+4][j+4]=='x'){
                        winner="P1";
                    }
                    if(arr[i][j]=='o'&&arr[i+1][j+1]=='o'&&arr[i+2][j+2]=='o'&&arr[i+3][j+3]=='o'&&arr[i+4][j+4]=='o'){
                        winner="P2";
                    }
                }
            }

            //아래위 대각선
            for(int i=0; i<arr.length-4; i++){
                for(int j=4; j<arr[i].length; j++){
                    if(arr[i][j]=='x'&&arr[i+1][j-1]=='x'&&arr[i+2][j-2]=='x'&&arr[i+3][j-3]=='x'&&arr[i+4][j-4]=='x'){
                        winner="P1";
                    }
                    if(arr[i][j]=='o'&&arr[i+1][j-1]=='o'&&arr[i+2][j-2]=='o'&&arr[i+3][j-3]=='o'&&arr[i+4][j-4]=='o'){
                        winner="P2";
                    }
                }
            }

            //승자확인
            if(winner.equals("P1")){
                System.out.println("Player1 승리");
                System.out.println("게임 종료");
                break;
            }else if(winner.equals("P2")){
                System.out.println("Player2 승리");
                System.out.println("게임 종료");
                break;
            }else{
                System.out.println("무승부");
                System.out.println("게임 종료");
                break;
            }

        }

    }

}
