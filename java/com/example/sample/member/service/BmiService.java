package com.example.sample.member.service;

import com.example.sample.member.domain.BmiDTO;

/**
 * packageName: com.example.sample.bmi
 * fileName   : BmiDemo
 * author     : Jangwonjong
 * date       : 2022-01-25
 * desc       : BMI앱을 실행하기 위한 컨트롤러
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-01-25     Jangwonjong       최초 생성
 */
public class BmiService {
    public String bmi(BmiDTO bmi) {
    return String.format("%s 는 정상",bmi.getName());
    }

}