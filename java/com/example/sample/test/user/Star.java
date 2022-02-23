package com.example.sample.test.user;

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
        System.out.println("직각삼각형 모양 찍기");
        for(int i=1;i<=7;i++){
            for (int j=1;j<=i; j++){

                System.out.print("*");
            }
            System.out.println();
        }

    }
    }

