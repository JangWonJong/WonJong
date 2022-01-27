package com.example.sample.bmi;

import java.util.Scanner;

/**
 * packageName: com.example.sample.bmi
 * fileName   : BmiDemo
 * author     : Jangwonjong
 * date       : 2022-01-25
 * desc       : BMI앱을 실행하기 위한 컨트롤러
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-01-25     Jangwonjong       최초 생성
 */
public class BmiDemo {
    public String execute(String name, int height, int weight) {
        BmiApp bmiApp = new BmiApp();
        return bmiApp.getBmi(name,height,weight);

    }

}
