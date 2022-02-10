package com.example.sample.oop.controller;

import com.example.sample.oop.domain.CelPhone;
import com.example.sample.oop.domain.GalPhone;
import com.example.sample.oop.domain.IPhone;
import com.example.sample.oop.domain.Phone;
import com.example.sample.oop.service.PhoneService;
import com.example.sample.oop.service.PhoneServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.sample.controller
 * fileName   : PhoneController
 * author     : Jangwonjong
 * date       : 2022-02-08
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-02-08     Jangwonjong       최초 생성
 */
public class OopController {
    public void execute(Scanner scanner) {
        while (true){
            System.out.println("[Menu]\n 0.Exit \n" +
                    "1.은닉화(Encapsulation)\n" +
                    "2.상속(Inheritance)\n" +
                    "3.추상화(Abstraction)\n" +
                    "4.다형성(Polymorphism) ");
            switch (scanner.next()){
                case "0" :
                    System.out.println("종료");return;
                case "1" :
                    System.out.println("POJO가 은닉화다");
                    break;
                case "2" :
                    System.out.println("extends 가 상속이다");
                    Phone phone = new Phone("금성전화기","금성전자");
                    CelPhone celPhone = new CelPhone("핸드폰","블랙베리","이동");
                    IPhone iPhone = new IPhone("애플","이동");
                    GalPhone galPhone = new GalPhone("삼성","갤럭시노트","");
                    PhoneService phoneService = new PhoneServiceImpl();
                    System.out.println("[소메뉴]0.Exit 1.집전화 2.휴대폰 3.아이폰 4.갤럭시폰");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("exit");return;
                        case "1":
                            System.out.println("### 집전화 ###");
                            phone.setCall("여보세요, ***입니다");
                            phoneService.usePhone(phone);
                            break;
                        case "2":
                            System.out.println("### 휴대전화 ###");
                            celPhone.setCall("여보세요, ***입니다");
                            phoneService.useCelPhone(celPhone);
                            break;
                        case "3":
                            System.out.println("### 아이폰 ###");
                            iPhone.setSearch("뉴스");
                            phoneService.useIPhone(iPhone);
                            break;
                        case "4":
                            System.out.println("### 갤럭시폰 ###");
                            galPhone.setPay("삼성 페이");
                            phoneService.useGalPhone(galPhone);

                            break;
                        default:
                            System.out.println("Invalid Menu");

                    }
                    break;
            }
        }
    }
}
