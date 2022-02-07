package com.example.sample.service;

import java.util.Scanner;

/**
 * packageName: com.example.sample.service
 * fileName   : Feb07Service
 * author     : Jangwonjong
 * date       : 2022-02-07
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-02-07     Jangwonjong       최초 생성
 */
public class Feb07ServiceImpl implements Feb07Service{

    @Override
    public void dice(Scanner scanner) {
        System.out.println("주사위 문제");
        String res = " ";
        int num = (int)(Math.random() * 6 +1);
        if(num==1){
            res = "1번이 나왔습니다.";
        }else if(num==2){
            res = "2번이 나왔습니다.";
        }else if(num==3){
            res = "3번이 나왔습니다.";
        }else if(num==4){
            res = "4번이 나왔습니다.";
        }else if(num==5){
            res = "5번이 나왔습니다.";
        }if(num==6){
            res = "6번이 나왔습니다.";
        }
        System.out.println(res);

    }

    @Override
    public void rps(Scanner scanner) {
        System.out.println("가위바위보 문제");

    }

    @Override
    public void getPrime(Scanner scanner) {
        System.out.println("입력받은 두 수 사이에 있는 소수 구하기");

    }

    @Override
    /**윤년은 4년마다 돌아오는데 100년으로 나누어 떨어지면 평년
     * but 400년으로 나누어 떨어지면 윤년
     * ex) 2020, 2024, 2028 => 윤년
     *     2100, 2200, 2300 => 평년
     *     2000, 2400, 2800 => 윤년
     *     조건이 참일 경우 윤년 아닐경우 평년
     *
     */
    public void leapYear(Scanner scanner) {
        System.out.println("자바로 입력받은 연도가 윤년인지 평년인지 판단하기");
        System.out.println("연도를 입력하시오");
        int a = scanner.nextInt();
        /*if(a%4==0){
            System.out.println(a+"년은 윤년입니다");
        }else if(a%400==0){
            System.out.println(a+"년은 윤년입니다");
        }else if(a%100!=0){
            System.out.println(a+"년은 평년입니다");
        }*/
        /*int input = 0;
        int a = 0;
        switch (input){
            case a%4==0 :
                System.out.println("윤년");
                break;
            case a%100!=0 :
                System.out.println("평년");
                break;
            case a%400==0 :
                System.out.println("윤년");
                break;
        }*/
        if(a%4==0 && a%100!=0 || a%400==0){
            System.out.println(a +"는 윤년입니다");
        }else{
            System.out.println(a +"는 평년입니다");
         }


    }

    @Override
    public void numberGolf(Scanner scanner) {
        System.out.println("5. 임의로 입력받은 숫자 맞추기\n"+"1~100 숫자 입력");
        int count = 0;
        int num = (int)(Math.random() * 100)+1;
        int num_enter = 0;
        Scanner cho = new Scanner(System.in);

        while (num != num_enter){
            num_enter = cho.nextInt();
            if(num_enter >= 101){
                System.out.println("숫자를 1부터 100까지 입력해주세요.");}
            else if(num > num_enter){
                System.out.println("UP");
                count++;
            }else if(num < num_enter){
                System.out.println("DOWN");
                count++;
            }
        }
        System.out.println("정답입니다\t" + count +"회 만에 맞췄어요.");
    }
}

