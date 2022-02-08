package com.example.sample.algo.controller;

import com.example.sample.algo.algorithm.*;
import com.example.sample.algo.service.*;

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
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackService stackService = new StackServiceImpl();
        QueueService queueService = new QueueServiceImpl();
        HeapService heapService = new HeapServiceImpl();
        HashService hashService = new HashServiceImpl();
        SortService sortService = new SortServiceImpl();
        BruteForceService bruteForceService = new BruteForceServiceImpl();
        DfsService dfsService = new DfsServiceImpl();
        BfsService bfsService = new BfsServiceImpl();
        DpService dpService = new DpServiceImpl();
        GraphService graphService = new GraphServiceImpl();
        BinSearchService binSearchService = new BinSearchServiceImpl();
        GreedyService greedyService = new GreedyServiceImpl();
        while (true){
            System.out.println("담당 0.종료 1.강민 2.최건일 3.유재혁 4.김아름 5.장원종");
            switch (scanner.next()){
                case "0":
                    System.out.println("Exit");return;
                case "1":
                    System.out.println("0.Exit 1.Dp 2.Graph 3.BinSearch 4.Greedy 5.Hash" +
                            " 6.Sort 7.Stack 8.Queue 9.Heap 10.BruteForce 11.Bfs 12.Dfs");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("Exit");return;
                        case "1":
                            System.out.println();
                        case "2":
                            System.out.println();
                        case "3":
                            System.out.println();
                        case "4":
                            System.out.println();
                        case "5":
                            System.out.println();
                        case "6":
                            System.out.println();
                        case "7":
                            System.out.println();
                        case "8":
                            System.out.println();
                        case "9":
                            System.out.println();
                        case "10":
                            System.out.println();
                        case "11":
                            System.out.println();
                        case "12":
                            System.out.println();

                    }
            }
        }
    }

}
