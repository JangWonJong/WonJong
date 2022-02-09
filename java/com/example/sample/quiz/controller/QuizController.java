package com.example.sample.quiz.controller;

import com.example.sample.quiz.service.*;

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
        Feb06Service feb06Service = new Feb06ServiceImpl();
        Feb07Service feb07Service = new Feb07ServiceImpl();
        Feb08Service feb08Service = new Feb08ServiceImpl();

        while (true){
            System.out.println("[서브메뉴]\n 0)Exit 1)2월6일 2)2월7일 3)2월8일 ");
            switch (scanner.next()){
                case "0":
                    System.out.println("### Exit ###");return;
                case "1":
                    String[] arr = {"권혜민",  "조현국",       "김진영",     "김한슬",      "서성민",
                            "정렬",   "해시",         "힙",         "완전탐색",     "DP",
                            "스택",   "깊이우선탐색 ", "그래프",      "탐욕법",       "이중탐색",
                            "큐",    "너비우선탐색"};
                    System.out.println("[소메뉴]\n 0.Exit \n1.팀별 과제 \n2.팀장이 맡은 과제 \n3.큐를 담당한 사람\n 4.팀원별 과제 수");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("Exit");return;
                        case "1":
                            System.out.println("### 1.팀별 과제 ###");
                            feb06Service.quiz1(arr);break;
                        case "2":
                            break;
                    }
                case "2":
                    System.out.println("[소메뉴]\n 0.Exit \n1.주사위 \n2.가위바위보 \n3.소수 구하기\n 4.윤년/평년\n 5.임의숫자 맞추기");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("### 종료 ###");return;
                        case "1":
                            System.out.println("### 1.주사위 ###");
                            feb07Service.dice(scanner);
                            break;
                        case "2":
                            System.out.println("### 2.가위바위보 ###");
                            feb07Service.rps(scanner);
                            break;
                    }
                    break;
            }

        }
    }

}




