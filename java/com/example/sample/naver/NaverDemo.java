package com.example.sample.naver;

import com.example.sample.google.GoogleApp;

import java.util.Scanner;

/**
 * packageName: com.example.sample
 * fileName   : NaverDemo
 * author     : Jangwonjong
 * date       : 2022-01-25
 * desc       : Naver 앱을 실행하는 컨트롤러
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-01-25     Jangwonjong       최초 생성
 */
public class NaverDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NaverApp naverApp = new NaverApp();
        System.out.println(NaverApp.NAVER_APP);
        System.out.println("ID : ");
        String id = scanner.next();
        System.out.println("PW : ");
        String pw = scanner.next();
        System.out.println("로그인");
        String res = naverApp.naver(id,pw);
        System.out.println(res);
    }
}
