package com.example.sample.service;

import com.example.sample.domain.CalcDTO;

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


public class CalcService {
    public String calc(CalcDTO calc) {
        int reusult =0;
        switch (calc.getOpcode()) {
            case "+": reusult = calc.getNum1() + calc.getNum2();
                break;
            case "-": reusult = calc.getNum1() - calc.getNum2();
                break;
            case "*": reusult = calc.getNum1() * calc.getNum2();
                break;
            case "/": reusult = calc.getNum1() / calc.getNum2();
                break;
        }
        return String.format("%d %s %d = %d", calc.getNum1(), calc.getOpcode(), calc.getNum2());
    }
}




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



