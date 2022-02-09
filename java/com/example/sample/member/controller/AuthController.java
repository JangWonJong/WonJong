package com.example.sample.member.controller;

import com.example.sample.member.domain.*;
import com.example.sample.member.service.MemberService;
import com.example.sample.member.service.MemberServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.sample.controller
 * fileName   : DemoController
 * author     : Jangwonjong
 * date       : 2022-01-27
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-01-27     Jangwonjong       최초 생성
 */
public class AuthController {
    public void execute(Scanner scanner) {
        BmiDTO bmi = new BmiDTO();
        CalcDTO calc = new CalcDTO();
        GoogleDTO google = new GoogleDTO();
        GradeDTO grade = new GradeDTO();
        LoginDTO login = new LoginDTO();
        KakaoDTO kakao = new KakaoDTO();
        MemberService service = new MemberServiceImpl();

        while(true){
            System.out.println("메뉴 선택");
            String menu =  "0.Exit 1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN 6.KAKAO";
            System.out.println(menu);
            String select = scanner.next();
            String res = "";
            switch (select){
                case "0":
                    System.out.println("Exit"); return;
                case "1":
                    System.out.println(BmiDTO.BMI_TITLE+"\n이름, 키, 몸무게 입력");
                    bmi.setName(scanner.next());
                    bmi.setTall(scanner.nextInt());
                    bmi.setWeight(scanner.nextInt());
                    res = service.bmi(bmi);
                    break;
                case "2":
                    System.out.println(CalcDTO.CALC_TITLE+"\n숫자1, 연산자, 숫자2 입력");
                    calc.setNum1(scanner.nextInt());
                    calc.setOpcode(scanner.next());
                    calc.setNum2(scanner.nextInt());
                    res = service.calc(calc);
                    break;
                case "3":
                    System.out.println(GoogleDTO.GOOGLE_APP+"\nGoogle 검색 또는 URL 검색");
                    google.setSearch(scanner.next());
                    res = service.google(google);
                    break;
                case "4":
                    System.out.println(GradeDTO.GRADE_TITLE+"\n 이름, 국어, 영어, 수학 입력");
                    grade.setName(scanner.next());
                    grade.setKor(scanner.nextInt());
                    grade.setEng(scanner.nextInt());
                    grade.setMath(scanner.nextInt());
                    res = service.grade(grade);
                    break;
                case "5":
                    System.out.println(LoginDTO.LOGIN_TITLE+"\n이름 아이디 비밀번호를 입력하세요");
                    login.setName(scanner.next());
                    login.setId(scanner.next());
                    login.setPw(scanner.next());
                    res = service.login(login);
                    break;
                case "6":
                    System.out.println(KakaoDTO.KAOKAO_TITLE+"\n 전화번호 메시지");
                    kakao.setTelno(scanner.next());
                    kakao.setMessage(scanner.next());
                    res = service.kakao(kakao);
                    break;
                default : res = "Invalid MENU"  ; break;
            }
            System.out.println(res);

        }

    }
}