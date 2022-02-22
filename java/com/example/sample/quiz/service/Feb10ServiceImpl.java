package com.example.sample.quiz.service;

import java.util.Random;
import java.util.Scanner;

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
    /**
     * author       : 김아름
     * desc         : 버블정렬
     * int 타입의 arr 변수 선언, arr 는 10개의 인덱스 값을 가지고 있음
     * Math 클래스로 1~100의 정수를 구하고 arr[]변수에 넣어 랜덤으로 10개의 숫자를 구함
     *                              Math 클래스는 int로 형변환 했기 때문에 1~100까지 숫자를 구하기 위해 +1
     *
     * int j 선언 -> 정렬 회전수
     * int k 선언 -> 앞의 수와 비교하기 위한 값
     *
     * 앞의 수가 뒤의 수보다 크다면 자리를 바꿔준다
     * temp -> 바꾸기 위한 변수
     * */
    public void bubbleSort(Scanner scanner) {
        int[] arr = new int[10];
        System.out.println("정렬전: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
            System.out.println("[" + arr[i] + "]");
        }

        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr.length - j - 1; k++) {
                if (arr[k] > arr[k + 1]) {
                    int temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                }
            }
        }
        System.out.println("정렬후: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.println("[" + arr[j] + "]");
        }
    }

    @Override
    public void insertionSort(Scanner scanner) {
        int[] arr = new int[10];

        System.out.println("정렬전: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
            System.out.println("[" + arr[i] + "]");
        }

        for (int j = 1; j < arr.length - 1; j++) {
            int insert = j;
            int temp = arr[j];
            while ((insert > 0) && (arr[insert - 1] > temp)) {
                arr[insert] = arr[insert - 1];
                insert--;
            }
            arr[insert] = temp;
        }
        System.out.println("정렬후: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.println("[" + arr[j] + "]");
        }
    }

    @Override
    public void selectionSort(Scanner scanner) {
        int[] arr = new int[10];

        System.out.println("정렬전: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
            System.out.println("[" + arr[i] + "]");
        }

        for (int j = 0; j < arr.length - 1; j++) {
            for (int k = j+1; k <arr.length; k++){
                if (arr[j]>arr[k]){
                    int temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                }

            }
        }

        System.out.println("정렬후: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.println("[" + arr[j] + "]");

        }
    }

    @Override
    public void quickSort(Scanner scanner) {
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
        System.out.println("### quickSort ###");
        /**
         *  author     : 강 민
         *  desc       : QuickSort
         * 참고한 블로그 :
         */
        int num;
        int[] arr = new int[10];
        String res="";
        String ss="";
        for(int i=0 ;i<arr.length ;i++){
            num = (int)(Math.random()*100+1);
            arr[i] = num;
            ss += arr[i]+", ";
        }
        System.out.println("random 숫자 10개 입력 값 : "+ss);

        quickSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++) {
            res += arr[i]+",";
        }
        System.out.print("quickSort 후의 결과출력 값 :"+res);
        System.out.println();
        System.out.println();
    }

    public static void quickSort(int[] arr, int start, int end) { // 퀵소트라는 메소드의 ( 인트배열, 출발점 , 도착점을 파라미터로)
        int part = partition(arr, start, end); // 파트라는 변수를 배열, 출발점, 도착점을 가지는 파티션으로 지정한다.
        if (start < part - 1) quickSort(arr, start, part - 1); // 파트에서 1을 뺀 값보다 시작점이 작은 경우, (배열, 출발점,
        //도착점(파티션 - 1) 을 파라미터로 가진다.
        if (end > part) quickSort(arr, part, end); // 도착점이 파트보다 클 경우, (배열, 파트, 도착점을 파라미터로 가진다.
    }

    public static int partition(int[] arr, int start, int end) { // 파티션이라는 메서드에 인트 배열, 출발점, 도착점을 파라미터로 가지는
        //위에서 생성한 파티션이라는 변수
        int pivot=arr[(start+end)/2]; // 피벗 생성 ( 출발점+ 도착점 ) 을 2로 나눈 배열
        while(start<=end) { // 도착점이 출발점보다 크거나 같음을 반복할때
            while(arr[start]<pivot) start++; // 피벗이 출발점보다 낮을 때 출발점은에 +1씩 증가
            while(arr[end]>pivot) end--; // 도착점이 피벗보다 클 때 도착점은 -1씩 감소
            if(start<=end) { // 도착점이 출발점보다 크거나 같을 때
                swap(arr,start,end); // 배열 값, 출발점, 도착점을 서로 바꿔준다 ( swap이란 두 변수의 값을 서로 바꾼다)
                start++; // 출발점은 +1씩 증가
                end--; // 도착점은 -1 씩 감소
            }
        }
        return start;  // 출발점을 메소드의 결과로 반환
    }

    public static void swap(int[] arr, int start, int end) { // 스왑이라는 메서드에 인트 배열, 출발점, 도착점 이라는 파라미터를 가진다.
        int tmp=arr[start]; // 출발점을 tmp라는 변수의 임시 저장? ( 이 부분은 tmp가 임시 저장 이라는 뜻을 가지고 있는데 정확하게는
        //잘 모르겠음
        arr[start]=arr[end]; // 출발점과 도착점의 배열 값을 지정
        arr[end]=tmp; // 도착점은 임시로 지정
        return; //반환
    }

    @Override
    public void mergeSort(Scanner scanner) {
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
        System.out.println("### mergeSort ###");
        /**
         *  author     : 강 민
         *  desc       : MergeSort
         * 참고한 블로그 :
         */
        int num;
        String ss="";
        int[] arr = new int[10];
        for(int i=0 ;i<10 ;i++){
            num = (int)(Math.random()*100+1);
            arr[i] = num;
            ss +=arr[i]+", ";
        }
        System.out.println("random 숫자 10개 입력 값 : "+ss);

        // Merge정렬 실행
        sort(arr, 0, arr.length);
        String res="";
        for(int i=0;i<arr.length;i++) {
            res += arr[i]+",";
        }
        System.out.print("mergeSort 후의 결과출력 값 :"+res);
        System.out.println();
        System.out.println();
    }
    private static void sort(int[] arr, int low, int high) {
        if (high - low < 2) {
            return;
        }
        int mid = (low + high) / 2;
        sort(arr, 0, mid);
        sort(arr, mid, high);
        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low];
        int t = 0, l = low, h = mid;

        while (l < mid && h < high) {
            if (arr[l] < arr[h]) {
                temp[t++] = arr[l++];
            } else {
                temp[t++] = arr[h++];
            }
        }

        while (l < mid) {
            temp[t++] = arr[l++];
        }

        while (h < high) {
            temp[t++] = arr[h++];
        }

        for (int i = low; i < high; i++) {
            arr[i] = temp[i - low];
        }
    }

    @Override
    public void magicSquare(Scanner scanner) {
        /**
         * 홀수 마방진 구하기
         * 1. 시작은 첫 행, 한 가운데 열에 1을 둔다.
         * 2. 행을 감소, 열을 증가하면서 순차적으로 수를 넣어간다.
         * 3. 행은 감소하므로 첫 행보다 작아지는 경우에는 마지막 행으로 넘어간다.
         * 4. 열은 증가하므로 마지막 열보다 커지는 경우에는 첫 열로 넘어간다.
         * 5. 넣은 수가 n의 배수이면 행만 증가한다. 열은 변화가 없다.
         * 참고) https://cbts.tistory.com/65/
         *
         * */
        int num;
        while (true) {
            num = (int)(Math.random() * 9) + 1;
            if (num % 2 == 1 && num != 1) {
                break;
            }
        }
        /**
         * 첫 while문은 무한 루프로, num값이 홀수를 나오게 만든다. num은 랜덤값이되, 1과 10사이의 수만 나온다.
         * if문은 활용해 num %2 == 1, 2로 나누었을 경우, 나머지는 1이 되는 수여야 하며, num!=1 1은 아니여야만,
         * &&(논리곱, 양 곱하는 값이, 둘 다 true)여야만 조건을 만족합니다. 따라서, if가 실행되고, 3,5,7,9의 값이여야만
         * 코드가 진행됩니다.
         */

        int array[][] = new int[num][num];
        int row, col;
        row = 0;
        col = num / 2; // 마방진은 1행 가운데 열에서부터 시작
        /** num = 5라고 가정합니다.
         *  마방진은 1행 가운데 열부터 시작해야하므로, 열의 가운데부터 시작하기 위해
         *  5/2 = 2 이므로, 0,1,2,3,4로 열의 가운데 오게 됩니다.
         */

        for (int i = 1; i <= num * num; i++) {
            array[row][col] = i;
            if (i % num == 0) {
                row++;
                if (row == num) {
                    row = 0;
                }
            } else {
                row--;
                col++;
                if (row == -1) {
                    row = num - 1;
                }
                if (col == num) {
                    col = 0;
                    /**
                     *  i는 해당 칸의 들어가는 수를 의미합니다. 마방진의 칸에서 넘어가지 않도록 5 * 5가 넘지 않도록 합니다.
                     *  5. 넣은 수가 n의 배수이면 행만 증가한다. 열은 변화가 없다. -> if문을 이용해 row의 값만 증가하도록 합니다.
                     *  else 이후로는 2. 행을 감소, 열을 증가하면서 순차적으로 수를 넣어간다.
                     *  3. 행은 감소하므로 첫 행보다 작아지는 경우에는 마지막 행으로 넘어간다.
                     *  4. 열은 증가하므로 마지막 열보다 커지는 경우에는 첫 열로 넘어간다.
                     */
                }
            }
        }
        for (row = 0; row < num; row++) {
            for (col = 0; col < num; col++) {
                System.out.printf("%3d", array[row][col]);
            }
            System.out.println();
        }
    }

    /**
     * author     : 최건일
     * desc       : Zigzag 지그재그
     * 1. 문제 : 랜덤한 정수를(n) 생성하여 행,열 n*n의 숫자배열을 지그재그로 생성
     *  ex) 랜덤한 정수 ranNum = 5
     *      출력 :  1  2  3  4  5
     *            10  9  8  7  6
     *            11 12 13 14 15
     *            20 19 18 17 16
     *            21 22 23 24 25
     *
     * 2. 랜덤한정수 ranNum을 생성하여 2차원배열 int[][] arr의 length로 설정
     * 2-1. 행(int i)이 홀수일 경우 (i%2==0) 오름차순 출력
     * 2-1-1. arr[i][j] = count++ 출력
     * 2-2. 행(int i)이 짝수의 경우(else) 내림차순 출력
     * 2-2-1. arr[i][ranNum-1-j] === count++ 출력
     * 3. count%ranNum==0 줄바꿈(\n)
     */
    @Override
    public void zigzag(Scanner scanner) {
        int ranNum = (int)(Math.random()*10+1);
        System.out.println("### 지그재그 ###\n" +
                "1 ~ 10 사이의 무작위 정수 "+ "["+ranNum+"]" +" 지그재그를 출력합니다.");

        int[][] arr =new int[ranNum][ranNum];
        int count = 1;
        for(int i = 0; i < ranNum; i++){
            for(int j = 0; j < ranNum; j++){
                if (i % 2 == 0){
                    arr[i][j] = count;
                } else {
                    arr[i][ranNum-1-j] = count;
                }
                count++;
            }
        }
        for(int i = 0; i < ranNum; i++){
            for(int j = 0; j < ranNum; j++){
                System.out.print(arr[i][j] + "\t");
                if (count%ranNum==0){
                    System.out.println();
                }
                count++;
            }
        }
    }

    @Override
    /**랜덤한 수를 입력받아 그 수만큼 줄을 출력하고 직각 삼각형을 만들기
     * 첫번째 줄은 별이 1개 찍히고 종료
     * 두번쨰 줄은 별이 2개 찍히고 종료
     * n번쨰 줄은 별이 n개 찍히고 종료 =>for문 사용
     */
    public void rectangleStarPrint(Scanner scanner) {
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
        public void triangleStarPrint (Scanner scanner) {
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