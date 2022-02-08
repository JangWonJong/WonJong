package com.example.sample.test;

import java.util.Scanner;
import java.util.Random;

/**
 * packageName: com.example.sample.test
 * fileName   : Baseb
 * author     : Jangwonjong
 * date       : 2022-02-08
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-02-08     Jangwonjong       최초 생성
 */
public class Baseb {
    /**
     * 1. 세 자리의 랜덤 숫자를 정한다.( 범위는 1 ~ 9 )
     * 2. 숫자를 맞추고
     * 동시에 위치를 맞추면 Strike
     * 3. 숫자를 맞췄지만, 위치가 다르면 Ball
     * 4. 번호와 위치 다 맞지 않을 시에는 out
     * 5. 세자리의 숫자를 맞추게 되면 게임 끝
     */
    public static void main(String[] args) {
        int com[] = new int[3]; // 컴퓨터가 제공하는 숫자
        int user[] = new int[3]; // 사용자가 입력할 숫자
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int count = 0; // 게임 횟수
        // 랜덤 숫자 생성
        while(com[0]==0) {
            com[0] = random.nextInt(10);
        }
        while(com[0]==com[1] || com[1]==0) {
            com[1] = random.nextInt(10);
        }
        while(com[1]==com[2] || com[2]==0) {
            com[2] = random.nextInt(10);
        }
        while(true) {
            int strike = 0;
            int ball = 0;
            for(int i=0; i<user.length; i++) {
                System.out.print((i+1)+"번째 수: ");
                user[i] = sc.nextInt();
                if(user[i] > 9 || user[i] <= 0) {
                    System.out.println("숫자 범위는 1~9 입니다.");
                }
            }
            for(int i=0; i<com.length; i++) {
                for(int j=0; j<user.length; j++) {
                    if(com[i] == user[j] && i==j) { // 숫자와 위치가 일치
                        strike++;
                    } else if(com[i] ==user[j] && i!=j) { // 위치는 다르나 숫자는 일치
                        ball++;
                    }
                }
            }
            System.out.println(strike+" 스트라이크 "+ball+" 볼 ");
            count++;
            if(strike == 3) {
                System.out.println("게임 끝\n" + count + "번째 시도 성공");
                break;


            }

}
    }
}
