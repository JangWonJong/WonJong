package com.example.sample.kakao;
/**
 * packageName: com.example.sample.kakao
 * fileName   : KakaoApp.java
 * author     : Jangwonjong
 * date       : 2022-01-24
 * desc       : 전화번호와 메시지를 받아서 전송하는 앱
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-01-24     Jangwonjong       최초 생성
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
