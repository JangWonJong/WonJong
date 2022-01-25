package com.example.sample.naver;

/**
 * packageName: com.example.sample
 * fileName   : NaverApp
 * author     : Jangwonjong
 * date       : 2022-01-25
 * desc       :
 * 클래스 변수 : Naver_LOGO네이버로고
 * 인스턴스변수, 파라미터 : id아이디, pw비밀번호, 로그인
 * 로컬변수 : res 아이디 %s 로그인 성공
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-01-25     Jangwonjong       최초 생성
 */
public class NaverApp {
    public static String NAVER_APP = "NAVER";
    private String id;
    private String pw;
    private String login;

    public String naver(String id, String pw){
        this.id = id;
        this.pw = pw;

        String res = String.format("");
        return res;
    }



}
