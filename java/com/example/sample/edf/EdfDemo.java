package com.example.sample.edf;

import java.util.Scanner;

/**
 * packageName: com.example.sample.edf
 * fileName   : EdfDemo
 * author     : Jangwonjong
 * date       : 2022-01-26
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-01-26     Jangwonjong       최초 생성
 */
public class EdfDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EdfApp edfApp = new EdfApp();
        String res = edfApp.getEdf();
        System.out.println(res);
    }
}
