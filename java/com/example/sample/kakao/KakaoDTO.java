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

public class KakaoDTO {
    public static String KAOKAO_TITLE = "KAKAO";
    private String telno;
    private String message;

    public String getTelno(){
        return telno;
    }
    public void setTelno(String telno){
        this.telno = telno;
    }
    public String getMessage(){
        return message;
    }
    public void setMessage(String message){
        this.message = message;
    }


}
