package com.example.sample.quiz;

/**
 * packageName: com.example.sample.controller
 * fileName   : ArrayExam
 * author     : Jangwonjong
 * date       : 2022-02-04
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-02-04     Jangwonjong       최초 생성
 */
public class ArrayExam {
    public static void main(String[] args) {
        String[] arr = {"권혜민",  "조현국",       "김진영",     "김한슬",      "서성민",
                        "정렬",   "해시",         "힙",         "완전탐색",     "DP",
                        "스택",   "깊이우선탐색 ", "그래프",      "탐욕법",       "이중탐색",
                        "큐",    "너비우선탐색"};
        System.out.println("Q1. 팀별 과제를 출력하세요 ");
        String s = "";
        for(int i=0; i< arr.length; i++){
            s += arr[i]+"\t";
        }
        System.out.println(s);
        System.out.println("Q2. 팀장이 맡은 과제만 출력하세요. 예) 김진영, 힙, 그래프 ");
        s = "";
        s = arr[2]+","+arr[7]+","+arr[12];
        System.out.println(s);
        System.out.println("Q3. 큐를 담당한 사람을 출력하세요. 예) 큐를 담당한 사람: 권혜민 ");;
        s = "";
        s = arr[15]+"를 담당한 사람 : "+arr[0];
        System.out.println(s);
    }

}
