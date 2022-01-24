package com.example.sample.hello;

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

