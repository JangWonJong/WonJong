package com.example.sample.hello;

import java.util.Scanner;
/**
 * packageName: com.example.sample.hello
 * fileName   : HelloDemo.java
 * author     : Jangwonjong
 * date       : 2022-01-24
 * desc       : 헬로우앱을 실행하는 컨트롤러
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-01-24     Jangwonjong       최초 생성
 */
public class HelloDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HelloApp helloApp = new HelloApp();
        System.out.println(HelloApp.HELLO_TITLE);
        System.out.println("name");
        System.out.println("age");
        String name = scanner.next();
        int age = scanner.nextInt();
        String res = helloApp.hello(name, age);
        System.out.println(res);
    }
}
