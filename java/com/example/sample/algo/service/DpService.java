package com.example.sample.algo.service;

/**
 * packageName: com.example.sample.algo.service
 * fileName   : DpService
 * author     : Jangwonjong
 * date       : 2022-02-08
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-02-08     Jangwonjong       최초 생성
 */
public interface DpService {
    int showN(int N, int number);                // N 으로 표현
    int intTri(int[][] triangle);                // 정수 삼각형
    int goSchool(int m, int n, int[][] puddles); // 등교길
    int thief(int[] money);                     // 도둑질
}
