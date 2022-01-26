package com.example.sample.member;

import java.util.Scanner;

/**
 * packageName: com.example.sample.member
 * fileName   : MemberDemo
 * author     : Jangwonjong
 * date       : 2022-01-26
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-01-26     Jangwonjong       최초 생성
 */
public class MemberDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemberApp memberApp = new MemberApp();
        String res = memberApp.getmember();
        System.out.println(res);
    }
}
