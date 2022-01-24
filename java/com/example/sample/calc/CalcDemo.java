package com.example.sample.calc;

import java.util.Scanner;
/**
 * 숫자 2개와 연산자 1개를 받아서 계산하는 계산기앱을 작성하시오
 * int, String
 * */


public class CalcDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcApp calcApp = new CalcApp();
        System.out.println(CalcApp.CALC_TITLE);
        System.out.println("첫번째 숫자 : ");
        int num1 = scanner.nextInt();
        System.out.println("연산자 : ");
        String opcode = scanner.next();
        System.out.println("두번째 숫자 : ");
        int num2 = scanner.nextInt();
        String res = calcApp.calc(num1, opcode, num2);
        System.out.println("연산결과 : "+ res);
    }
}
