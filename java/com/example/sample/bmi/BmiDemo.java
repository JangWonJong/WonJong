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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BmiApp bmiApp = new BmiApp();
        System.out.println(BmiApp.BMI_APP);
        System.out.println("이름 : ");
        String name = scanner.next();
        System.out.println("키 : ");
        int height = scanner.nextInt();
        System.out.println("몸무게 : ");
        int weight = scanner.nextInt();
        String res = bmiApp.bmi(name,height,weight);
        System.out.println(res);
    }

}
