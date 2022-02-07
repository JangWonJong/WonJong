package com.example.sample.controller;

import com.example.sample.service.Feb07Service;
import com.example.sample.service.Feb07ServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.sample.controller
 * fileName   : Feb07Controller
 * author     : Jangwonjong
 * date       : 2022-02-07
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-02-07     Jangwonjong       최초 생성
 */
public class Feb07Controller {
    /**
     * 1. 주사위 Dice
     * 2. 가위바위보 Rps
     * 3. 입력받은 두 수 사이에 있는 소수 구하기 getPrime
     * 4. 자바로 입력받은 연도가 윤년인지 평년인지 판단하기 LeapYear
     * 5. 임의로 입력받은 숫자 맞추기 numberGolf
     **/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Feb07Service service = new Feb07ServiceImpl();
        String res = "";
        while (true){

            System.out.println("[Menu] 0.Exit 1.주사위 2.가위바위보" +
                    " 3.입력받은 두 수 사이에 있는 소수 구하기" +
                    "4.자바로 입력받은 연도가 윤년인지 평년인지 판단하기" +
                    " 5.임의로 입력받은 숫자 맞추기 ");
            switch (scanner.next()){
                case "0" :
                    System.out.println("Exit"); return;
                case "1" :
                    service.dice(scanner);
                    break;
                case "2" :
                    service.rps(scanner);
                    break;
                case "3" :
                    service.getPrime(scanner);
                    break;
                case "4" :
                    service.leapYear(scanner);
                    break;
                case "5" :
                    service.numberGolf(scanner);
                    break;

                default: res = "Invalid Menu"; break;
            }
            System.out.println(res);
        }
    }
}
