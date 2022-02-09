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
        Scanner scanner = new Scanner(System.in);
        int com1 = (int) (Math.random() * 9) + 1;
        int com2 = (int) (Math.random() * 9) + 1;
        while (com1 == com2) {
            com2 = (int) (Math.random() * 9) + 1;
        }
        int com3 = (int) (Math.random() * 9) + 1;
        while (com1 == com3 || com2 == com3) {
            com3 = (int) (Math.random() * 9) + 1;
        }
//System.out.println(com1 + " " + com2 + " " + com3);


        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        int strike = 0;
        int ball = 0;
        int out = 0;

        while (strike != 3) {
            System.out.println("user> 숫자 세 개를 입력하세요.");

            strike = 0;      //돌려줄 때마다 매번 초기화 필요
            ball = 0;
            out = 0;

            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            num3 = scanner.nextInt();
            if (com1 == num1) {
                strike += 1;
            } else if (com1 == num2 || com1 == num3) {
                ball += 1;
            } else {
                out += 1;
            }
            if (com2 == num2) {
                strike += 1;
            } else if (com2 == num1 || com2 == num3) {
                ball += 1;
            } else {
                out += 1;
            }
            if (com3 == num3) {
                strike += 1;
            } else if (com3 == num1 || com3 == num2) {
                ball += 1;
            } else {
                out += 1;
            }

            System.out.println("Strike : " + strike + ", Ball : " + ball + ", Out : " + out);

        }
    }
}
