package com.example.sample.calc;
/**
 * packageName: com.example.sample.calc
 * fileName   : CalcApp.java
 * author     : Jangwonjong
 * date       : 2022-01-24
 * desc       : 숫자 2개와 연산자 결과를 리턴하는 앱
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-01-24     Jangwonjong       최초 생성
 */

public class CalcApp{
    static String CALC_TITLE = "계산기";
    int num1;
    String opcode;
    int num2;

    public String calc(int num1, String opcode, int num2){
        this.num1 = num1;
        this.opcode = opcode;
        this.num2 = num2;
        int res = num1 + num2;
        return String.format("%d %s %d = %d", this.num1, this.opcode, this.num2, res);
    }
}

