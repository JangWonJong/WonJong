package com.example.sample.google;

/**
 * packageName: com.example.sample.google
 * fileName   : GoogleApp
 * author     : Jangwonjong
 * date       : 2022-01-25
 * desc       : [클래스변수] GoogleApp
 *              [인스턴스변수] search
 *              [로컬변수]  res
 *              [파라미터] search
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-01-25     Jangwonjong       최초 생성
 */
public class GoogleApp {
    public static String GOOGLE_APP = "Google";
    private String search;

    public String getgoogle(String search){
        this.search = search;
        String res = String.format("검색결과는 %s 입니다",this.search);
        return res;
    }


    }



