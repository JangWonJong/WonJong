package com.example.sample.kakao;

import java.util.Scanner;
/**
 * 전화번호와 메시지를 받아서 전송하는 앱을 작성하시오
 * String telno, String message
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
