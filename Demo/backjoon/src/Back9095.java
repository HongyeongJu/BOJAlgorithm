/*
백준 9095번 제목: 1,2,3 더하기
분류 : Dynamic Programming (동적 프로그래밍)
정수 4를 1, 2, 3의 조합으로 나타내는 방법은 총 7가지가 있다.

1+1+1+1
1+1+2
1+2+1
2+1+1
2+2
1+3
3+1
정수 n이 주어졌을 때, n을 1,2,3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.

N  개수
1   1
2   2
3   4
4   7
5   13
6   24
7   44 이런식이므로 즉 점화식은 F(n) = f(n-3) + f(n-2) + f(n-1)이다.
 */

import java.util.Scanner;

public class Back9095 {

    static long[] dp = new long[12];
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0 ; i < t; i++){
            int num = scanner.nextInt();
            for(int j = 0 ; j < dp.length;j++){
                dp[j] = -1;
            }
            System.out.println(function(num));
        }

    }

    static long function(int n){
        if(n == 1) return dp[1] = 1;
        if(n == 2) return dp[2] = 2;
        if(n == 3) return dp[3] = 4;
        if(dp[n] != -1) return dp[n];           //계산한 값이 있으므로.
        dp[n] = function(n-3) + function(n-2) + function(n-1);
        return dp[n];
    }
}
