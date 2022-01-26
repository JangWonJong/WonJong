package com.example.sample.line;

import com.example.sample.calc.CalcApp;

import java.util.Scanner;

public class LineDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LineApp lineApp = new LineApp();
        System.out.println(LineApp.LINE_TITLE);
        System.out.println("첫번째 숫자 : ");
        int num1 = scanner.nextInt();
        System.out.println("연산자 + - * / : ");
        String opcode = scanner.next();
        System.out.println("두번째 숫자 : ");
        int num2 = scanner.nextInt();
        String result = lineApp.lin(num1, opcode, num2);
        System.out.println("연산결과 : "+ result);
    }

    }

