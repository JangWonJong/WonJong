package com.example.sample.hello;

import java.util.Scanner;

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
