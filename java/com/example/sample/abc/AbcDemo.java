package com.example.sample.abc;

import java.util.Scanner;

/**
 * packageName: com.example.sample
 * fileName   : AbcDemo
 * author     : Jangwonjong
 * date       : 2022-01-26
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-01-26     Jangwonjong       최초 생성
 */
public class AbcDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AbcAPP abcAPP = new AbcAPP();
        String res = abcAPP.getAbc();
        System.out.println(res);

    }




}
