/*
백준 11727 제목 : 2*n -2 타일링 날짜 18.4.11
난이도 : 4
내용
2×n 직사각형을 2×1과 2×2 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.

아래 그림은 2×17 직사각형을 채운 한가지 예이다.

n-1을 사용하는 경우 n-2를 사용하는 경우를 각각 생각해봐야된다.

 */

import java.util.Scanner;

public class Back11727 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int num = scanner.nextInt();
        int[] dp = new int[1001];
        dp[1] = 1;
        dp[2] = 3;

        for(int i = 3 ; i < num + 1; i++){
            dp[i] = (dp[i-1] + dp[i-2] + dp[i-2])%10007;
        }
        System.out.println(dp[num] % 10007);
    }
}
