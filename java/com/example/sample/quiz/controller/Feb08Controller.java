package com.example.sample.quiz.controller;

import com.example.sample.quiz.service.Feb08Service;
import com.example.sample.quiz.service.Feb08ServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.sample.quiz.controller
 * fileName   : Feb08Controller
 * author     : Jangwonjong
 * date       : 2022-02-08
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-02-08     Jangwonjong       최초 생성
 */
public class Feb08Controller {

    public void execute(Scanner scanner){
        Feb08Service service = new Feb08ServiceImpl();
        String res ="";
        while (true){
            System.out.println("[Menu] 0.Exit 1.로또" +
                    " 2.야구 3.좌석예약 4.은행 입출금 5.구구단");
            switch (scanner.next()){
                case "0":
                    System.out.println("Exit");return;
                case "1":
                    service.lotto(scanner);
                    break;
                case "2":
                    service.baseball(scanner);
                    break;
                case "3":
                    service.booking(scanner);
                    break;
                case "4":
                    service.bank(scanner);
                    break;
                case "5":
                    service.booking(scanner);
                    break;
                default:res ="Invalid Menu";break;
            }
            System.out.println(res);
        }


    }


}
