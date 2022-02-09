package com.example.sample.oop.repository;

import java.util.Scanner;

/**
 * packageName: com.example.sample.oop.repository
 * fileName   : Test
 * author     : Jangwonjong
 * date       : 2022-02-09
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-02-09     Jangwonjong       최초 생성
 */
public class Testa {
    Scanner scanner = new Scanner(System.in);
    String model;
    String color;

    void powerOn(){
        System.out.println("전원을 켭니다");}
    void powerOff(){        System.out.println("전원을 끕니다");    }
    void bell(){        System.out.println("벨이 울립니다");    }
    void sendVoice(String message){        System.out.println("자기: "+message);    }
    void receiveVoice(String message){        System.out.println("상대방: "+message);    }
    void hangUp(){        System.out.println("전화를 끊습니다");    }
}





