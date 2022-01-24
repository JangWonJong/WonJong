package com.example.sample.login;
/**
 * 아이디, 비번, 이름을 받아서 로그인하는 앱을 작성하시오
 * String String String
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
