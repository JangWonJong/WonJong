package com.example.sample.kakao;
/**
 * 전화번호와 메시지를 받아서 전송하는 어플을 만드시오
 * String telno, String message
 */

public class KakaoApp {
    static String KAOKAO_TITLE = "카카오앱";
    String telno;
    String message;

    public String kakao(String telno, String message){
    this.telno = telno;
    this.message = message;
    return String.format("TElNO : %s, MESSAGE : %S", this.telno, this.message);
    }
}
