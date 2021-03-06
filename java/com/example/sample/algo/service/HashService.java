package com.example.sample.algo.service;

/**
 * packageName: com.example.sample.algo.service
 * fileName   : HashService
 * author     : Jangwonjong
 * date       : 2022-02-08
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-02-08     Jangwonjong       최초 생성
 */
public interface HashService {
    String failedPlayer(String[] participant, String[] completion);
    boolean phoneBook(String[] phone_book);
    int spy(String[][] clothes);
    int[] bestAlbum(String[] genres, int[] plays);

}

