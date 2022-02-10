package com.example.sample.member.domain;

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
public class BmiDTO extends Object {
    public static String BMI_TITLE = "BMI 구하기";

    private final static BmiDTO bmiDTO = new BmiDTO();
    private BmiDTO(){}
    public static BmiDTO getInstance(){return bmiDTO;}


    private String name;
    private double tall;
    private double weight;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTall() {
        return tall;
    }

    public void setTall(double tall) {
        this.tall = tall;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

