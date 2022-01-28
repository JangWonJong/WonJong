package com.example.sample.controller;

import com.example.sample.bmi.BmiDTO;
import com.example.sample.bmi.BmiService;
import com.example.sample.calc.CalcApp;
import com.example.sample.calc.CalcDemo;
import com.example.sample.google.GoogleApp;
import com.example.sample.google.GoogleDemo;
import com.example.sample.login.LoginApp;
import com.example.sample.login.LoginDemo;

import java.util.Scanner;

/**
 * packageName: com.example.sample.controller
 * fileName   : DemoController
 * author     : Jangwonjong
 * date       : 2022-01-27
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-01-27     Jangwonjong       최초 생성
 */
public class DemoController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BmiDTO bmi = new BmiDTO();
        BmiService bmiService = new BmiService();
        CalcDemo calcDemo = new CalcDemo();
        GoogleDemo googleDemo = new GoogleDemo();
        LoginDemo loginDemo = new LoginDemo();
        while(true){
            System.out.println("메뉴 선택");
            String menu =  "0.Exit 1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN";
            System.out.println(menu);
            String select = scanner.next();
            String res = "";
            switch (select){
                case "0":
                    System.out.println("Exit"); return;
                case "1":
                    System.out.println(BmiDTO.BMI_TITLE+"\n이름, 키, 몸무게 입력");
                    bmi.setName(scanner.next());
                    bmi.setHeight(scanner.nextInt());
                    bmi.setWeight(scanner.nextInt());
                    res = bmiService.getBmi(bmi);
                    break;
                case "2":
                    System.out.println(CalcApp.CALC_TITLE+"\n숫자1, 연산자, 숫자2 입력");
                    res = calcDemo.execute(scanner.nextInt(), scanner.next(), scanner.nextInt());
                    break;
                case "3":
                    System.out.println(GoogleApp.GOOGLE_APP+"\nGoogle 검색 또는 URL 검색");
                    res = googleDemo.execute(scanner.next());
                break;
                case "4": res = "GRADE" ;

                break;
                case "5":
                    System.out.println(LoginApp.LOGIN_TITLE+"\n이름 아이디 비밀번호를 입력하세요");
                    res = loginDemo.execute(scanner.next(), scanner.next(), scanner.next());
                break;
                default : res = "Invalid MENU"  ; break;
            }
            System.out.println(res);

        }

    }
}
