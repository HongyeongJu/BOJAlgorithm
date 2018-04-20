/*
백준 11726번 제목 : 2 * n 타일링
분류 :다이나믹 프로그래밍
2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.

아래 그림은 2×5 크기의 직사각형을 채운 한 가지 방법의 예이다.

그림을 그려가면서 구해보면
N   개수
1    1
2    2
3    3
4    5
5    8
6    13
7    21
8    34
9    55  이렇게 점화식이 나온다 즉 f(n) = f(n-2)+f(n-1)이다.
 */

import java.util.Scanner;

public class Back11726 {

    static long[] dp;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        dp = new long[num + 1];

        for(int i = 0 ; i < dp.length ;i++){
            dp[i] = -1;
        }

        System.out.println(function(num));
    }

    static long function(int n){
        if(n ==1) return dp[1] = 1;
        if(n ==2) return dp[2] = 2;
        if(dp[n] != -1) return dp[n];       //값이 있는경우

        return dp[n] = (function(n -2) +function(n-1)) % 10007;
    }
}
