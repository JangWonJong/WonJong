package com.example.sample.test.naver;

import java.util.Scanner;
import java.lang.Math;

/**
 * packageName: com.example.sample.naver
 * fileName   : Test
 * author     : Jangwonjong
 * date       : 2022-02-08
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-02-08     Jangwonjong       최초 생성
 */
/**윤년은 4년마다 돌아오는데 100년으로 나누어 떨어지면 평년
       * but 400년으로 나누어 떨어지면 윤년
        * ex) 2020, 2024, 2028 => 윤년
        *     2100, 2200, 2300 => 평년
        *     2000, 2400, 2800 => 윤년
        *     조건이 참일 경우 윤년 아닐경우 평년 */

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("자바로 입력받은 연도가 윤년인지 평년인지 판단하기\n"+"연도를 입력하시오");
        int a = scanner.nextInt();
        if(a%4==0) {
            if (a%100 == 0) {
                if(a%400==0){
                    System.out.println("윤년");
            }else {
                System.out.println("평년");}
            }else {
                System.out.println("윤년");}
        }else {
            System.out.println("평년");}



    }
}
