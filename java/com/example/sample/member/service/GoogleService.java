package com.example.sample.member.service;

import com.example.sample.member.domain.GoogleDTO;

/**
 * packageName: com.example.sample.google
 * fileName   : GoogleDemo
 * author     : Jangwonjong
 * date       : 2022-01-25
 * desc       : 구글앱을 실행하는 컨트롤러
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-01-25     Jangwonjong       최초 생성
 */
public class GoogleService {
    public String google(GoogleDTO google) {
    return String.format("검색결과는 %s 입니다",google.getSearch());



    }

}
