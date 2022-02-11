package com.example.sample.test.user;

import java.util.Scanner;

/**
 * packageName: com.example.sample.test.user
 * fileName   : Gugudan
 * author     : Jangwonjong
 * date       : 2022-02-11
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-02-11     Jangwonjong       최초 생성
 */
public class Gugudan {

    //2단 출력
    //[2단]\n 2*1 2*2 2*3 ...2*9
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int a = 2;
        String res ="";
        //    System.out.println("2단");

        for(int i=2; i<=9; i++) {
            for(int j =1; j<=i; j++){
               // if(){}
                res = j+ "단" + j+"*"+ i +"="+ j*i;
                System.out.println(res);
            }
            //for (int j=1; j<i; j++){
        }

    }

        }







