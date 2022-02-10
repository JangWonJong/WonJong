package com.example.sample.test;

import java.util.Random;
import java.util.Scanner;

/**
 * packageName: com.example.sample.test
 * fileName   : Star
 * author     : Jangwonjong
 * date       : 2022-02-10
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-02-10     Jangwonjong       최초 생성
 */
public class Star {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rand = random.nextInt(10);

        System.out.println("직각 삼각형 별찍기");
        for (int i =1; i<rand; i++){
            for(int j =1; j<=i; j++){
                System.out.print("*");
                }
                System.out.println();
            }

        System.out.println("정삼각형 별찍기");

        }
        //배열 만들기
    }