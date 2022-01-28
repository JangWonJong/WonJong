package com.example.sample.service;

import com.example.sample.domain.GradeDTO;

import java.util.Scanner;

/**
 * packageName: com.example.sample.grade
 * fileName   : GradeDemo
 * author     : Jangwonjong
 * date       : 2022-01-26
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-01-26     Jangwonjong       최초 생성
 */
public class GradeService {
    public String getGrade(GradeDTO grade){
        System.out.println(" GradeService에 들어옴");
        System.out.println(grade.toString());
        int total = grade.getKor() + grade.getEng() + grade.getMath();
        int avg = total / 3;
        String res = (avg>=60) ? "합격" : "불합격";
        for(int i=1; i<3; i++){
            System.out.println(i+"번학생 : 이름, 국어, 영어, 수학");
            grade.getName();
            grade.getKor();
            grade.getEng();
            grade.getMath();
        }
        return String.format("########## %s ########\n" +
                " *  * 이름: %s\n" +
                " *  * > 국어: %d점\n" +
                " *  * > 영어: %d점\n" +
                " *  * > 수학: %d점\n" +
                " *  * 총점: %d점\n" +
                " *  * 평균(정수): %d점\n" +
                " *  * 합격여부: %s\n" +
                " *  * #######################",GradeDTO.GRADE_TITLE,grade.getName(),grade.getKor(),
                grade.getEng(),grade.getMath(),total,avg,res);

    }
}
