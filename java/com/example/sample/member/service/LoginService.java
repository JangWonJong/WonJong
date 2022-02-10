package com.example.sample.member.service;

import com.example.sample.member.domain.UserDTO;

/**
 * packageName: com.example.sample.calc
 * fileName   : Test
 * author     : Jangwonjong
 * date       : 2022-01-26
 * desc       : 로그인앱을 실행하는 컨트롤러
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-01-26     Jangwonjong       최초 생성
 */

public class LoginService {
    public String login(UserDTO login) {
    return String.format((login.getPw().equals(UserDTO.PASSWORD)) ?
            String.format(" %s 님의 비번 %s 가 맞습니다. 로그인 성공 ", login.getName(),login.getPw())
            : String.format(" %s 의 ID 는 맞고, 비번 %s 가 틀립니다. 로그인 실패 ", login.getName(),login.getPw()));










    }
}
