package com.example.sample.login;

import java.util.Scanner;
/**
 * 아이디, 비번, 이름을 받아서 로그인하는 앱을 작성하시오
 * String String String
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
