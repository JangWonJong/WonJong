package com.example.sample.algorithm;

import java.util.Scanner;

/**
 * packageName: com.example.sample.controller
 * fileName   : DemoController2
 * author     : Jangwonjong
 * date       : 2022-01-27
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-01-27     Jangwonjong       최초 생성
 */
public class AlgoController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();
        while (true){
            System.out.println("[MENU] 0.exit\n"+
                    "[김아름]1. stack \t"+
                    "2. queue \t"+
                    "3. heap  \n"+
                    "[유재혁]4. hash  \t"+
                    "5. sort \n"+
                    "[장원종]6. brute force \t"+
                    "7. dfs \t"+
                    "8. bfs \n"+
                    "[강민]9. dp \t"+
                    "10. graph \n"+
                    "[최건일]11. bin search \t"+
                    "12. greedy \n"
                    );
            switch (scanner.next()){
                case "0": return;
                case "1":
                    System.out.println(stack.solution(null)); break;
                default:
                    System.out.println("WRONG MENU");
            }
        }
    }

}
