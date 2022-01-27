package com.example.sample.login;

import java.util.Scanner;
/**
 * packageName: com.example.sample.calc
 * fileName   : Test
 * author     : Jangwonjong
 * date       : 2022-01-26
 * desc       : 로그인앱을 실행하는 컨트롤러
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-01-26     Jangwonjong       최초 생성
 */

public class LoginDemo {
    public String execute(String id, String pw, String name) {
        LoginApp loginApp = new LoginApp();
        return loginApp.getlogin(id, pw, name);






    }
}
