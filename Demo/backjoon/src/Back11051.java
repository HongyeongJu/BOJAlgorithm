/*
Back 11051 제목 : 이항계수 2 날짜 : 18.4.30
분류 :  Dp 동적 계획법. (수학) 메모리 제이션 필요!!
1 < n <= 1000 0 <= K <= N이므로.
 */

import java.util.Scanner;

public class Back11051 {
    static int[][] dp = new int[1001][1001];
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length ;j++){
                dp[i][j] = -1;
            }
        }

        int result = binom(n, k);
        System.out.println(result);
    }

    private static int binom(int n, int k){
        if(k == 0 || n == k) return 1;
        else if(dp[n][k] >-1) return dp[n][k];
        else {
            dp[n][k] = (binom(n-1, k-1) + binom(n-1, k)) %10007;
            return dp[n][k];
        }
    }
}
