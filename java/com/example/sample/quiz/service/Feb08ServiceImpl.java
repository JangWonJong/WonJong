package com.example.sample.quiz.service;

import java.util.Random;
import java.util.Scanner;

/**
 * packageName: com.example.sample.quiz.service
 * fileName   : Feb08Service
 * author     : Jangwonjong
 * date       : 2022-02-08
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-02-08     Jangwonjong       최초 생성
 */
public class Feb08ServiceImpl implements Feb08Service{
    @Override
    public void lotto(Scanner scanner) {
        int[] comNum = new int[6];
        String s = "번호: ";
        while (true){
            System.out.println("### 로또 ###\n" +
                    "0.종료 1.무작위 로또번호 받기 2.로또게임");
            switch (scanner.next()){
                case "0" :
                    System.out.println("EXIT"); return;
                case "1":
                    for (int i = 0; i < 6; i++){
                        comNum[i] = (int)(Math.random()*45)+1;
                        for (int j = 0; j < i; j++){
                            if (comNum[i] == comNum[j]){
                                i--; break;
                            }
                        }
                    }
                    for (int i = 0; i < 6 ; i++){
                        s += comNum[i]+" ";
                    }
                    System.out.println(s); break;
                case "2":
                    for (int i = 0; i < 6; i++){
                        comNum[i] = (int)(Math.random()*45)+1;
                        for (int j = 0; j < i; j++){
                            if (comNum[i] == comNum[j]){
                                i--; break;
                            }
                        }
                    }
                    for (int i = 0; i < 6 ; i++){
                        s += comNum[i]+" ";
                    }
                    System.out.println("1~45 사이의 번호를 중복없이 6번 입력하세요");
                    int[] userNum = new int[6];
                    String u = "입력한 번호: ";
                    for (int m = 0; m < 6; m++){
                        userNum[m] = scanner.nextInt();
                        u += userNum[m] + " ";
                    }
                    int hit = 0;
                    for (int n = 0; n < 6; n++)
                        for (int p = 0; p < 6; p++)
                            if (comNum[n] == userNum[p]){
                                hit++; break;
                            }
                    String rank = "";
                    if (hit == 6){
                        rank = "축하합니다! 1등입니다!";
                    } else if (hit == 5){
                        rank = "축하합니다! 2등입니다!";
                    } else if (hit == 4){
                        rank = "축하합니다! 3등입니다!";
                    } else {
                        rank = "아쉽게도 꽝입니다.";
                    }
                    System.out.println(u+"\n"+s+"\n"+"맞춘 갯수: "+hit+"\n"+rank);
                    break;
                default:
                    System.out.println("WRONG"); break;
            }
        }

    }

    @Override
    /**숫자야구의 조건
     1 ~ 9 사이의 랜덤 숫자 3개 생성 (중복 X, 음수 X)
     1 ~ 9 사이의 사용자 입력 숫자 3개 생성 (중복 X, 음수 X)
     랜덤 숫자와 사용자 입력 숫자의 위치와 숫자가 모두 같은 경우 -> strike
     랜덤 숫자와 사용자 입력 숫자의 위치는 다르고 숫자가 같은 경우 -> ball
     하나의 랜덤 숫자당 기회 총 10번
     기회를 모두 소진하거나 정답을 입력 시 replay 여부 체크
     'Y' 또는 'y' 입력 시 랜덤 숫자 생성부터 다시 실행
     'N' 또는 'n' 이나 다른 문자 입력 시 게임 종료
     *
     */
    public void baseball(Scanner scanner) {
        System.out.println("### 야구게임 ###");
        int com[] = new int[3];
        int user[] = new int[3];
        int strike = 0; // 스트라이크 - 변수
        int ball = 0; // 볼 - 변수
        Random r = new Random();// 중복방지를 위한 컴퓨터 번호 설정
                                // nextInt(10) --> 0 ~ 9 까지의 숫자 생성
                                // 컴퓨터의 1번 숫자가 0이면 랜덤값을 생성
            while (com[0] == 0) {
                com[0] = r.nextInt(10);
            }
            // 컴퓨터의 1번 숫자와 2번 숫자가 같거나
            // 2번 숫자가 0이라면 랜덤값 생성
            while (com[0] == com[1] || com[1] == 0) {
                com[1] = r.nextInt(10);
            }
            // 컴퓨터의 2번 숫자와 3번 숫자가 같거나
            // 3번 숫자가 0이라면 랜덤값 생성
            while (com[1] == com[2] || com[2] == 0) {
                com[2] = r.nextInt(10);
            }
            // 유저가 정답을 입력하는 변수 s
            int playcount = 1;
            // 스트라이크가 3개 나와야 종료
            while (strike < 3) {
                // 3번 반복하여 정답을 입력 받는다.
                for (int i = 0; i < user.length; i++) {
                    System.out.print((i + 1) + "번째 수: ");
                    user[i] = scanner.nextInt();
                    // 입력받는 숫자가 10 이상이거나 0이면 다시 입력을 받는다.
                    while (user[i] >= 10 || user[i] <= 0) {
                        System.out.println("1~9 사이의 숫자를 입력하세요.");
                        System.out.print((i + 1) + "번째 수: ");
                        user[i] = scanner.nextInt();
                    }
                }
                // 입력받은 값 비교하기
                // Ball or Strike

                if (com[0] == user[0]) {
                    strike++;
                } else if (com[0] == user[1]) {
                    ball++;
                } else if (com[0] == user[2]) {
                    ball++;
                }

                if (com[1] == user[1]) {
                    strike++;
                } else if (com[1] == user[0]) {
                    ball++;
                } else if (com[1] == user[2]) {
                    ball++;
                }

                if (com[2] == user[2]) {
                    strike++;
                } else if (com[2] == user[1]) {
                    ball++;
                } else if (com[2] == user[0]) {
                    ball++;
                }

                if (strike == 0 && ball == 0) {
                    System.out.println("\n아웃!\n");
                } else if (strike == 3) {
                    System.out.println("\n스트라이크!\n" + "시도 횟수는: \n" + playcount);
                    System.exit(0);
                } else {
                    System.out.println("\n" + strike + "스트라이크" + "\t" + ball + "볼\n");
                    strike = 0;
                    ball = 0;
                }
                playcount++;
            }
    }




    @Override
    public void booking(Scanner scanner) {
        int seat[] = new int[22];
        int reserved;
        String s = "";
        while (true){
            System.out.println("Q3. 좌석예약\n 자석 예약 시스템 입니다.\n 원하시는 메뉴를 입력해주세요\n 0.종료 1.예약 2.예약확인");
            switch (scanner.next()){
                case "0":
                    System.out.println("예약을 종료하겠습니다.");return;
                case "1":
                    System.out.println("예약자의 이름을 입력해주세요");
                    String name = scanner.next();
                    System.out.println("현재 좌석 상태");
                    for(int i = 0; i<seat.length; i++){
                        s += i+1+"\t";
                    }
                    System.out.println(s);

                    for (int i : seat)
                        System.out.print(i+"\t");
                    System.out.println("\n좌석선택");
                    reserved = scanner.nextInt();

                    System.out.println(name+"님 "+reserved+" 번 자리에 예약되었습니다.");
                    break;
                case "2":
                    System.out.println("예약확인");

                    break;
                default:
                    System.out.println("메뉴를 다시 선택해주세요");
            }
        }
    }

    @Override
    public void bank(Scanner scanner) {
        int jango = 0;
        int money =0;

        while (true){
            System.out.printf("은행 잔고는 : %d 원 입니다.",jango);
            System.out.print("선택 (0.종료 1. 입금  2.출금) : ");
            switch (scanner.nextInt()){
                case 0:
                    System.out.println("===소메뉴 종료===");
                    return;
                case 1:
                    System.out.println("입금액을 입력하세요 : ");
                    money = scanner.nextInt();
                    jango +=money;
                    System.out.printf("%d 원을 입금하였습니다. 잔고는 %d 원 입니다.",money,jango);
                    break;
                case 2:
                    money = scanner.nextInt();
                    jango -=money;
                    System.out.printf("%d 원을 출금하였습니다. 잔고는 %d 원 입니다.",money,jango);
                    break;
                default:
                    break;
            }
            System.out.println();
        }
    }

    @Override
    /** author : 유재혁
     *  date : 2022-02-08
     *  desc : 세 개의 for문을 사용합니다. 첫 번째 for문은 구구단표의 틀을 만들어 줄 '단'의 형식을 만들어줍니다.
     *         두 번째 for문은 뒤에 곱하는 값을 나타냅니다. 1부터 9까지 증감하도록 만들어줍니다. 1을 가지고 내려가, 곱하는 수가 됩니다.
     *         세 번째 for문은 int k = i 를 통해서, k는 2로 시작합니다. 곱해지는 수가 됩니다.
     *         3개의 loop을 사용한 이유는 loop이 해당 범위에 도달할 때까지 계속 loop한다는 특징을 이용해, 구구단표를 만들기 위함입니다.
     *
     *         구구단표의 특성상 2단부터 5단까지는 위에 아래는 나머지 단을 나타내기 위해서, 마지막 for문에서 i=2를 이용해
     *         k에 2를 주고, k<i+4 = (k<6)으로 고정하여, 5단까지만 먼저 출력하도록 만들었습니다.
     *         for문은 초기화값으로 실행하여, 조건식을 확인하고, { }의 값을 넣고 증감식을 받은 뒤, 다시 조건식을 확인합니다.
     *         k*j이므로, k의 값이 1 증가했습니다. 2x1 다음 3x1이 되었습니다. 이후, 4x1, 5x1이 될 것이고, k<6이므로,
     *         두 번째 loop으로 돌아갑니다. j가 증감되었고, 곱하는 수는 2가 됩니다. 다시 세 번째 반복문이 실행되는 것이므로,
     *         k=i -> k= 2가 됩니다. j=2이므로 2x2,.. 5x2까지 진행한 후, 다시 올라가 곱하는 수를 계속 증감합니다.
     *         세 번째 반복문이 6이 되어, 조건식을 만족하지 못하고, j가 10이 되어 조건식을 만족하지 못하게 되면, 첫 번째 반복문으로 돌아갑니다.
     *         첫 번째 반복문의 증감식인 i+=4 'i는 4를 더한 값과 같다'라고 증감해주고, 다시 i=6인 상태부터 루프를 시작합니다.
     *         두 번째, 세 번째 반복문을 위 동일한 형식으로 진행시킨 뒤, 다시 첫 번째 반복문으로 돌아오게 된다면 i의 조건인 i<10을 넘지 못하게
     *         되므로 세 반복문은 모두 종료하고, 구구단표를 완성합니다. (두 개의 루프를 두 개 만듬을 통해서도 구구단표를 만들 수 있으나,
     *         세 개의 반복문이 더 알고리즘이 간략하므로 사용했습니다.)
     *
     */
    public void gugudan(Scanner scanner) {
        for(int i=2; i<10; i+=4){
            for(int j=1; j<10; j++){
                for(int k=i; k<i+4; k++){
                    System.out.print(k + "X" + j + "="+(k*j)+"\t");
                }
                System.out.print("\n");
            }
            System.out.println("\n");
        }
    }
}
