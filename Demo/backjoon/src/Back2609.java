/*
백준 2609 제목 : 최대공약수와 최소공배수 날짜 18.04.13
난이도 : 2
분류 : 유클리드 호제법
두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class Back2609 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(hosebub(a, b));
        System.out.println(a * b / hosebub(a,b));
    }

    static int hosebub(int a, int b){
        int high = max(a, b);
        int low = min(a, b);
        int tmp;
        do{
            tmp = high % low;
            high = low;
            low = tmp;
        }while(tmp != 0);

        return high;
    }

    static int max(int a, int b){
        return a > b? a : b;
    }
    static int min(int a, int b){
        return a < b ? a : b;
    }
}
