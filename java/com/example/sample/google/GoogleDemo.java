package com.example.sample.google;

import java.util.Scanner;

/**
 * packageName: com.example.sample.google
 * fileName   : GoogleDemo
 * author     : Jangwonjong
 * date       : 2022-01-25
 * desc       : 구글앱을 실행하는 컨트롤러
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-01-25     Jangwonjong       최초 생성
 */
public class GoogleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GoogleApp googleApp = new GoogleApp();
        System.out.println(GoogleApp.GOOGLE_APP);
        System.out.println("Google 검색 또는 URL 검색");
        String search = scanner.next();
        String res = googleApp.google(search);
        System.out.println(res);

    }

}
