package com.example.sample.quiz.service;

import java.util.Random;

/**
 * packageName: com.example.sample.quiz.service
 * fileName   : Feb09ServiceImpl
 * author     : Jangwonjong
 * date       : 2022-02-10
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-02-10     Jangwonjong       최초 생성
 */
public class Feb10ServiceImpl implements Feb10Service {
    /**
     * authour : 장원종
     * desc :
     * ~~부분이 이해가 안되서 중단됨 (예시)
     * 참조한 블로그 링크
     */

    @Override
    public void bubbleSort() {

    }

    @Override
    public void insertionSort() {

    }

    @Override
    public void selectionSort() {

    }

    @Override
    public void quickSort() {

    }

    @Override
    public void mergeSort() {

    }

    @Override
    public void magicSquare() {

    }

    @Override
    public void zigzag() {

    }

    @Override
    /**랜덤한 수를 입력받아 그 수만큼 줄을 출력하고 직각 삼각형을 만들기
     * 첫번째 줄은 별이 1개 찍히고 종료
     * 두번쨰 줄은 별이 2개 찍히고 종료
     * n번쨰 줄은 별이 n개 찍히고 종료 =>for문 사용
     */
    public void rectangleStarPrint() {
        Random random = new Random();
        int rand = random.nextInt(10);

        System.out.println("직각 삼각형 별찍기");
        for (int i = 1; i < rand; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    @Override
    /**랜덤한 수를 입력받아 그 수만큼 줄을 출력하고 정삼각형(피라미드모양)을 만들기
     * 첫번째 줄은 별이 1개 찍히고 종료
     * 두번쨰 줄은 별이 2개 찍히고 종료
     * n번쨰 줄은 별이 n개 찍히고 종료 =>for문 사용
     * 공백부분도 따로 for문 실행해야함
     */
    public void triangleStarPrint() {
        Random random = new Random();
        int rand = random.nextInt(10);
        System.out.println("정삼각형 별찍기");

        for (int i = 1; i <= rand; i++) {
            // 공백 j for문
            for (int j = rand; j > i; j--) {
                System.out.print(" ");
            }
            // 별 j for문
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // 공백 j for문
            for (int j = rand; j > i; j--) {
                System.out.print(" ");
            }

            System.out.println("");


        }
    }
}
