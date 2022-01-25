package com.example.sample.login;

import java.util.Scanner;
/**
 * packageName: com.example.sample.calc
 * fileName   : Test
 * author     : Jangwonjong
 * date       : 2022-01-24
 * desc       : 로그인앱을 실행하는 컨트롤러
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-01-24     Jangwonjong       최초 생성
 */

public class LoginDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginApp loginApp = new LoginApp();
        System.out.println(LoginApp.LOGIN_TITLE);
        System.out.println("ID");
        System.out.println("PW");
        System.out.println("NAME");
        String id = scanner.next();
        String pw = scanner.next();
        String name = scanner.next();
        String res = loginApp.login(id, pw, name);
        System.out.println(res);





    }
}
