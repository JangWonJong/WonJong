package com.example.sample.quiz.service;

/**
 * packageName: com.example.sample.service
 * fileName   : QuizService
 * author     : Jangwonjong
 * date       : 2022-02-07
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-02-07     Jangwonjong       최초 생성
 */
public class Feb06ServiceImpl implements Feb06Service {


    @Override
    public void quiz1(String[] arr) {
        System.out.println("Q1.팀별 과제를 출력하세요");
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            if (i%5==0) { s += "\n";
                s += i + " : " + arr[i] + "\t";
            }
            s += i + ":" + arr[i] +"\t";
            if(i==21){
                break;
            }
        }
        System.out.println(s);
    }

    @Override
    public void quiz2(String[] arr) {
        System.out.println("Q2.팀장이 맡은 과제만 출력하세요");
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("강민")) {
                for (int j = 0; j < 3; j++) {
                    s += arr[i + j * 5] + ","; }
                if (i == 17) {break; }
            }
        }
        System.out.println(s);
    }

    @Override
    public void quiz3(String[] arr) {
        System.out.println("3.큐를 담당한 사람을 출력하세요");
        String s = "";
        String j = "Queue";

        /*s = arr[11] + "를 담당한 사람 : " + arr[1];*/
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(j)) {
                s = arr[i] + "의 담당자는 " + arr[i%5] ;  }
        }
        System.out.println(s);
    }

    @Override
    public void quiz4(String[] arr) {
        String s = "";
        System.out.println("4.팀원별 과제 수를 출력하세요." +
                " 예)장원종(3개), 김아름(3개), 유재혁(2개), 최건일(2개), 강민(2개)");
        int[] intArr = new int[5];
        int[] resArr = new int[5];
        for (int i = 5; i< arr.length; i++){
            int a = i%5;
           for(int j=0; j < 5; j++){
              if(a==j){
                  intArr[j]++;
              }
               resArr = intArr;
           }

        }
        for(int i=0; i<5; i++){
            System.out.println(arr[i]+"("+resArr[i]+"),");

        }
        /*System.out.println(arr[0]+"의 카운트는 "+count0);
        System.out.println(arr[1]+"의 카운트는 "+count1);
        System.out.println(arr[2]+"의 카운트는 "+count2);
        System.out.println(arr[3]+"의 카운트는 "+count3);
        System.out.println(arr[4]+"의 카운트는 "+count4);*/

    }
}
