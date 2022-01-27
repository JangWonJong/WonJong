package com.example.sample.calc;

import java.util.Scanner;
/**
 * packageName: com.example.sample.calc
 * fileName   : CalcDemo.java
 * author     : Jangwonjong
 * date       : 2022-01-26
 * desc       : 계산기 앱을 실행하는 컨트롤러
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-01-26     Jangwonjong       최초 생성
 */


public class CalcDemo {
    public String execute(int num1, String opcode, int num2) {
        CalcApp calcApp = new CalcApp();
        return calcApp.getCalc(num1, opcode, num2);

    }
}
