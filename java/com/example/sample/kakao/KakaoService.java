package com.example.sample.kakao;

import java.util.Scanner;
/**
 * packageName: com.example.sample.kakao
 * fileName   : KakaoDemo.java
 * author     : Jangwonjong
 * date       : 2022-01-24
 * desc       : 카카오앱을 실행하는 컨트롤러
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-01-24     Jangwonjong       최초 생성
 */

public class KakaoService {
    public String getKakao(KakaoDTO kakao){
    return String.format("TElNO : %s, MESSAGE : %S",kakao.getTelno(),kakao.getMessage());

    }
}
