package com.example.sample.quiz.controller;

import com.example.sample.quiz.service.QuizService;
import com.example.sample.quiz.service.QuizServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.sample.controller
 * fileName   : TempController
 * author     : Jangwonjong
 * date       : 2022-02-04
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-02-04     Jangwonjong       최초 생성
 */
public class QuizController {
    public void execute(Scanner scanner){
        Feb06Controller feb06Controller = new Feb06Controller();
        Feb07Controller feb07Controller = new Feb07Controller();
        Feb08Controller feb08Controller = new Feb08Controller();
        while (true){
            System.out.println("0.Exit 1)2월6일 2)2월7일 3)2월8일 ");
            switch (scanner.next()){
                case "0":
                    System.out.println("### Exit ###");return;
                case "1":
                    feb06Controller.execute(scanner);
                    break;
                case "2":
                    feb07Controller.execute(scanner);
                    break;
                case "3":
                    feb08Controller.execute(scanner);
                    ;break;
                default:
                    System.out.println("Invalid ");
            }
        }
    }

}




