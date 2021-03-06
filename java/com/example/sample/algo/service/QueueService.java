package com.example.sample.algo.service;

/**
 * packageName: com.example.sample.algo.service
 * fileName   : QueueService
 * author     : Jangwonjong
 * date       : 2022-02-08
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-02-08     Jangwonjong       최초 생성
 */
public interface QueueService {
    int[] funcion(int[] progresses, int[] speeds);
    int print(int[] priorities, int location);
}
