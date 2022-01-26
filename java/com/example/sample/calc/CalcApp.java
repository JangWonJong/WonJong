package com.example.sample.calc;
/**
 * packageName: com.example.sample.calc
 * fileName   : CalcApp.java
 * author     : Jangwonjong
 * date       : 2022-01-26
 * desc       : 숫자 2개와 연산자 결과를 리턴하는 앱
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-01-26     Jangwonjong       최초 생성
 * 2022-01-26     Jangwonjong       if 절 추가, 4칙연산 가능하도록 개선함
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
        int res = 0;
        /*
        if(opcode.equals("+")){
            res = num1 + num2;
        }else
        if(opcode.equals("-")){
            res = num1 - num2;
        }else
        if(opcode.equals("*")){
            res = num1 * num2;
        }else
        if(opcode.equals("/")){
            res = num1 / num2;
        }*/

        switch(opcode){
            case "+": res = num1 + num2; break;
            case "-": res = num1 - num2; break;
            case "*": res = num1 * num2; break;
            case "/": res = num1 / num2; break;
        }

        String result = String.format("%d %s %d = %d", this.num1, this.opcode, this.num2, res);

        return result;
    }
}

