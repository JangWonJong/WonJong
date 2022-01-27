package com.example.sample.ghi;

import java.util.Scanner;

/**
 * packageName: com.example.sample.ghi
 * fileName   : GhiDemo
 * author     : Jangwonjong
 * date       : 2022-01-26
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-01-26     Jangwonjong       최초 생성
 */
public class GhiDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GhiApp ghiApp = new GhiApp();
        String res = ghiApp.getGhi();
        System.out.println(res);
    }
}
