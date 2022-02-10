package com.example.sample.member.domain;

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
public class GoogleDTO {
    public static String GOOGLE_APP = "Google";

    private final static GoogleDTO googleDTO = new GoogleDTO();
    private GoogleDTO(){}
    public static GoogleDTO getInstance(){return googleDTO;}

    private String search;

    public String getSearch(){
        return search;
    }
    public void setSearch(String search){
        this.search = search;
    }

    }



