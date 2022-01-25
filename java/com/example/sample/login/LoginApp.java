package com.example.sample.login;
/**
 * packageName: com.example.sample.calc
 * fileName   : Test
 * author     : Jangwonjong
 * date       : 2022-01-24
 * desc       : 아이디, 비번, 이름을 받아서 로그인하는 앱
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-01-24     Jangwonjong       최초 생성
 */

public class LoginApp {
    static String LOGIN_TITLE = "로그인";
    String id;
    String pw;
    String name;

    public String login(String id, String pw, String name){
    this.id = id;
    this.pw = pw;
    this.name = name;
    return String.format(" ID : %s, PW : %s, Name : %s", this.id, this.pw, this.name);
    }

}
