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
        Queue queue = new Queue();
        Heap heap = new Heap();
        Hash hash = new Hash();
        Sort sort = new Sort();
        BruteForce bruteForce = new BruteForce();
        Dfs dfs = new Dfs();
        Bfs bfs = new Bfs();
        Dp dp = new Dp();
        Graph graph = new Graph();
        BinSearch binSearch = new BinSearch();
        Greedy greedy = new Greedy();
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
                case "2" :
                    System.out.println(queue.solution(0,0,null)); break;
                case "3" :
                    System.out.println(heap.solution(null,0)); break;
                case "4" :
                    System.out.println(hash.solution(null,null)); break;
                case "5" :
                    System.out.println(sort.solution(null,null)); break;
                case "6" :
                    System.out.println(bruteForce.solution(null)); break;
                case "7" :
                    System.out.println(dfs.solution(null,0)); break;
                case "8" :
                    System.out.println(bfs.solution(0,null)); break;
                case "9" :
                    System.out.println(dp.solution(0,0)); break;
                case "10" :
                    System.out.println(graph.solution(0,null)); break;
                case "11" :
                    System.out.println(binSearch.solution(0,null)); break;
                case "12" :
                    System.out.println(greedy.solution(0,null,null)); break;
                default:
                    System.out.println("WRONG MENU");
            }
        }
    }

}
