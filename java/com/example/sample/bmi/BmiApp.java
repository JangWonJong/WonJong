package com.example.sample.bmi;

/**
 * packageName: com.example.sample.bmi
 * fileName   : BmiApp
 * author     : Jangwonjong
 * date       : 2022-01-25
 * desc       :
 * 클래스변수
 * 인스턴스변수, 파라미터
 * 로컬변수
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-01-25     Jangwonjong       최초 생성
 */
public class BmiApp {
    public static String BMI_APP = "BMI";
    private String name;
    private int height;
    private int weight;

    public String bmi(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
        String res = String.format("%s 는 정상",name);

        return res;



    }


}

