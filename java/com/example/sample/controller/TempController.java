package com.example.sample.controller;

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
public class TempController {
    public static void main(String[] args) {
        String[] arr = {"장원종", "김아름", "유재혁", "최건일", "강민",
                "BFS", "Stack", "Hash", "Bin", "DP",
                "DFS", "Queue", "Sort", "Greedy", "Graph",
                "Brute Force", "Heap", "", "", ""};

        System.out.println("Q1. 팀별 과제를 출력하세요 ");
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            if (i % 5 == 0) {
                s += "\n";
            } else if (i >= 17) {
                break;
            }
            s += i + " : " + arr[i] + "\t";
        }
        System.out.println(s);
        s = "";
        System.out.println("Q1. 팀장이 맡은 과제만 출력하세요 ");
        String l = "강민";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(l)) {
                for (int j = 0; j < 4; j++) {
                    s += arr[i + j * 5] + ",";
                }
                if (i == 17) {
                    break;
                }
            }
        }
        System.out.println(s);
        s = "";
        String j = "Queue";
        System.out.println("Q3. 큐를 담당한 사람을 출력하세요.");
        /*s = arr[11] + "를 담당한 사람 : " + arr[1];*/
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(j)) {
                s += arr[i - 10];
            }
        }
        System.out.println(s);
        s = "";
        System.out.println("Q3. 입력한 과목의 인덱스를 추출하세요.");
        //5, 10, 15 -> 0
        //6, 11, 16 -> 1
        //7, 12, 17 -> 2
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Stack")) {

                //System.out.println("Queue의 인덱스 : "+ i);
                System.out.println(arr[i] + "의 담당자는 " + arr[i - 5]);
            }
            if (arr[i].equals("Queue")) {
                //System.out.println("Queue의 인덱스 : "+ i);
                System.out.println(arr[i] + "의 담당자는 " + arr[i - 10]);
            }
            if (arr[i].equals("Heap")) {
                //System.out.println("Queue의 인덱스 : "+ i);
                System.out.println(arr[i] + "의 담당자는 " + arr[i - 15]);
            }
            System.out.println(s);

        }



        System.out.println("Q4. 팀원별 과제 수를 출력하세요.");
        int count = 0;
        String countManager = "";
        /*countManager += arr[0]+"(3개),";
        countManager += arr[1]+"(3개),";
        countManager += arr[2]+"(2개),";
        countManager += arr[3]+"(2개),";
        countManager += arr[4]+"(2개),";*/
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int[] intArr = new int[5];
        for (int i=0; i< arr.length; i++){
            if(arr[i].equals(arr[5])){
                count0++;
            }
            if(arr[i].equals(arr[6])){
                count1++;
            }
            if(arr[i].equals(arr[7])){
                count2++;
            }
            if(arr[i].equals(arr[8])){
                count3++;
            }
            if(arr[i].equals(arr[9])){
                count4++;
            }
        }
        System.out.println(arr[0]+"의 카운트는 "+count0);
        System.out.println(arr[1]+"의 카운트는 "+count1);
        System.out.println(arr[2]+"의 카운트는 "+count2);
        System.out.println(arr[3]+"의 카운트는 "+count3);
        System.out.println(arr[4]+"의 카운트는 "+count4);

    }
}
