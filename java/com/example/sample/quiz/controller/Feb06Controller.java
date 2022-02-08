package com.example.sample.quiz.controller;

import com.example.sample.quiz.service.QuizService;
import com.example.sample.quiz.service.QuizServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.sample.quiz.controller
 * fileName   : Feb06Controller
 * author     : Jangwonjong
 * date       : 2022-02-08
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-02-08     Jangwonjong       최초 생성
 */
public class Feb06Controller {
    public void execute(Scanner scanner) {
        String[] arr = {"장원종",        "김아름",       "유재혁",       "최건일",    "강민",
                "BFS",          "Stack",        "Hash",        "Bin",     "DP",
                "DFS",          "Queue",        "Sort",        "Greedy",  "Graph",
                "Brute Force",  "Heap"};
        QuizService service = new QuizServiceImpl();
        String res = "";
        while (true){
            System.out.println("[Menu] 0 .Exit 1.팀별 과제를 출력" +
                    " 2.팀장이 맡은 과제만 출력" +
                    " 3.큐를 담당한 사람을 출력" +
                    " 4.팀원별 과제 수를 출력");
            switch (scanner.next()){
                case "0" :
                    System.out.println("시스템을 종료합니다"); return;
                case "1":
                    service.quiz1(arr);
                    break;
                case "2":
                    service.quiz2(arr);
                    break;
                case "3":
                    service.quiz3(arr);
                    break;
                case "4":
                    service.quiz4(arr);
                    break;

                default: res = "Invalid Menu"; break;
            }
            System.out.println(res);
        }

    }
}
/*입력한 과목의 인덱스를 추출하세요.");
        //5, 10, 15 -> 0
        //6, 11, 16 -> 1
        //7, 12, 17 -> 2
        }*/
