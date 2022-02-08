package com.example.sample.test.user;

import java.util.Scanner;

/**
 * packageName: com.example.sample.user
 * fileName   : UserDemo
 * author     : Jangwonjong
 * date       : 2022-01-26
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-01-26     Jangwonjong       최초 생성
 */
public class UserDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserApp userApp = new UserApp();
        String res = userApp.getUser();
        System.out.println();
    }
}
