package com.example.sample.service;

import com.example.sample.domain.*;

/**
 * packageName: com.example.sample.service
 * fileName   : StudentService
 * author     : Jangwonjong
 * date       : 2022-02-07
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-02-07     Jangwonjong       최초 생성
 */
public interface StudentService {
    String bmi(BmiDTO bmi);
    String calc(CalcDTO calc);
    String google(GoogleDTO google);
    String grade(GradeDTO grade);
    String login(LoginDTO login);
    String kakao(KakaoDTO kakao);
}
