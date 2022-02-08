package com.example.sample.controller;

import com.example.sample.service.PhoneService;
import com.example.sample.service.PhoneServiceImpl;

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
public class PhoneController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneService service = new PhoneServiceImpl();

        while (true){
            System.out.println("0.Exit [Menu]\n 집전화\n " +
                    "휴대폰\n" +
                    "아이폰\n" +
                    "갤럭시노트");
            switch (scanner.next()){
                case "0" :
                    System.out.println("종료");return;
                case "1" :
                    service.usePhone(scanner);
                    break;
                case "2" :
                    service.useCelPhone(scanner);
                    break;
                case "3" :
                    service.useIPhone(scanner);
                    break;
                case "4" :
                    service.useGalPhone(scanner);
                    break;
                default:
                    System.out.println("Invalid Menu");break;
            }
        }
    }
}
