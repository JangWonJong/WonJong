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
public class BmiDTO {
    public static String BMI_TITLE = "BMI";
    private String name;
    private int height;
    private int weight;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }





}

