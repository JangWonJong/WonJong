package com.example.sample.oop.repository;

/**
 * packageName: com.example.sample.oop.repository
 * fileName   : Testb
 * author     : Jangwonjong
 * date       : 2022-02-09
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-02-09     Jangwonjong       최초 생성
 */
public class Testb extends Testa {
    int channel;

    Testb(String model, String color, int channel){
        this.model = model;
        this.color = color;
        this.channel = channel;
    }
    void turnOnDmb(){
        System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다");
    }
    void changeChannelDmb(){
        System.out.println("채널"+ channel + "번으로 바꿉니다");
    }
    void turnOffDmb(){
        System.out.println("DMB 수신을 종료합니다");
    }

    public static void main(String[] args) {
        Testb testb = new  Testb("자바폰","검정",10);
        System.out.println("모델: " +testb.model);
        System.out.println("색상: "+ testb.color);
        System.out.println("채널: "+testb.channel);
        testb.powerOn();
        testb.bell();
        testb.sendVoice("");
        testb.receiveVoice("");
        testb.hangUp();

        testb.turnOnDmb();
        testb.changeChannelDmb();
        testb.turnOffDmb();
    }
}
