package com.example.sample.kakao;

import java.util.Scanner;
/**
 * packageName: com.example.sample.kakao
 * fileName   : KakaoDemo.java
 * author     : Jangwonjong
 * date       : 2022-01-24
 * desc       : 카카오앱을 실행하는 컨트롤러
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-01-24     Jangwonjong       최초 생성
 */

public class KakaoDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KakaoApp kakaoApp = new KakaoApp();
        System.out.println(KakaoApp.KAOKAO_TITLE);
        System.out.println("telno");
        String telno = scanner.next();
        System.out.println("message");
        String message = scanner.next();
        String res = kakaoApp.kakao(telno, message);
        System.out.println(res);


    }
}
