package com.example.sample.service;

import java.util.Scanner;

/**
 * packageName: com.example.sample.service
 * fileName   : PhoneServiceImpl
 * author     : Jangwonjong
 * date       : 2022-02-08
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-02-08     Jangwonjong       최초 생성
 */
public class PhoneServiceImpl implements PhoneService {
    @Override
    public void usePhone(Scanner scanner) {
        System.out.println("집전화 사용");

    }

    @Override
    public void useCelPhone(Scanner scanner) {
        System.out.println("휴대폰 사용");

    }

    @Override
    public void useIPhone(Scanner scanner) {
        System.out.println("아이폰 사용");

    }

    @Override
    public void useGalPhone(Scanner scanner) {
        System.out.println("갤럭시노트 사용");

    }
}
