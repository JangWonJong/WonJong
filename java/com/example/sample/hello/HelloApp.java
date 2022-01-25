package com.example.sample.hello;
/**
 * packageName: com.example.sample.hello
 * fileName   : HelloApp.java
 * author     : Jangwonjong
 * date       : 2022-01-24
 * desc       : 이름과 나이를 입력 받아서 인사말을 리턴하는 앱
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-01-24     Jangwonjong       최초 생성
 */
public class HelloApp {
    static String HELLO_TITLE = "헬로우앱";
    String name;
    int age;

    public String hello(String name, int age){
        this.name = name;
        this.age = age;
        return String.format("안녕 내 이름은 %s 이고 %s 살이야.", this.name, this.age);
    }
}

