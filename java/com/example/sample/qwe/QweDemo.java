package com.example.sample.qwe;

import java.util.Scanner;

/**
 * packageName: com.example.sample.qwe
 * fileName   : QweDemo
 * author     : Jangwonjong
 * date       : 2022-01-26
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-01-26     Jangwonjong       최초 생성
 */
public class QweDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QweApp qweApp = new QweApp();
        String res = qweApp.getQwe();
        System.out.println(res);
    }
}
