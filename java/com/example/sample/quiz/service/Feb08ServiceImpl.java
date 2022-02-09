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

    }

    @Override
    public void bank(Scanner scanner) {

    }

    @Override
    public void gugudan(Scanner scanner) {

    }
}
