/*
백준 1934 제목 : 최소공배수 날짜 18.04.13
분류 : 유클리드 호제법
난이도 : 2

// 유클리드 호제법을 이용한다.
유클리드 호제법 : 두 수중 큰수를 작은 수로 나눈다음
나누어 떨어지면 그 작은수가 최대공약수!!
*/

import java.util.Scanner;

public class Back1934 {

    public static void main(String[] args){

        Scanner scanner =new Scanner(System.in);

        int t = scanner.nextInt();
        for(int i = 0 ; i < t; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a * b / hosebub(a, b));              // 두 수의 곱을 최대 공약수로 나누면 최소공배수가 나온다.
        }
    }
// 호제법으로 최대 공약수를 구한다.
    private static int hosebub(int a, int b){
        int high = max(a, b);
        int low = min(a, b);
        int tmp;
        do{
            tmp = high % low;
            high = low;
            low = tmp;
        }while(tmp !=0);

        return high;
    }

    static int min(int a, int b) {
        return a >b ? b : a;
    }

    static int max(int a, int b){
        return a > b ? a : b;
    }
}
