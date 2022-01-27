package com.example.sample.google;

import java.util.Scanner;

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
public class GoogleDemo {
    public String execute(String search) {
       GoogleApp googleApp = new GoogleApp();
       return googleApp.getgoogle(search);


    }

}
