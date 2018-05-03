/*
Back1149 제목 :RGB거리 날짜 18.5.1
분류 : 다이나믹 프로그래밍
난이도 : 3
RGB거리에 사는 사람들은 집을 빨강, 초록, 파랑중에 하나로 칠하려고 한다. 또한, 그들은 모든 이웃은 같은 색으로 칠할 수 없다는 규칙도 정했다. 집 i의 이웃은 집 i-1과 집 i+1이다. 처음 집과 마지막 집은 이웃이 아니다.

각 집을 빨강으로 칠할 때 드는 비용, 초록으로 칠할 때 드는 비용, 파랑으로 드는 비용이 주어질 때, 모든 집을 칠할 때 드는 비용의 최솟값을 구하는 프로그램을 작성하시오.

dp[n][3]을 만든다. 이 dp 배열은 열 R G B를 뜻하고 각각 i번째 집에서 각각 R G B를 선택했을 때 최소 비용을 뜻한다.
때문에 마지막에 dp[num][3]중 가장 작은 값을 출력해주면된다.
 */

import java.util.Scanner;

public class Back1149 {
    static int[][] dp = new int[1001][3];
    static int[][] m = new int[1001][3];

    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        for(int i = 0 ; i <dp.length ; i++){
            for(int j = 0 ; j < dp[0].length; j++){
                dp[i][j] = -1;// 메모리제이션
            }
        }
        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 0 ; j < 3; j++){
                m[i][j] = scanner.nextInt();
            }
        }
        int[] tmps = rgb(n);
        System.out.println(min(tmps[0],tmps[1],tmps[2]));
    }

    private static int[] rgb(int num){
        if(dp[num][0] != -1) return dp[num];
        //base case
        if(num == 1){
            dp[num][0] = m[num][0];
            dp[num][1] = m[num][1];
            dp[num][2] = m[num][2];
        }
        else {
            int[] tmps = rgb(num-1);            // dp[n-1]값
            dp[num][0] = min(tmps[1] , tmps[2]) + m[num][0];            // 이전까지의 G B의 값의 최소값과 현재 R값의 덧셈
            dp[num][1] = min(tmps[0], tmps[2]) + m[num][1];             // 이전까지의 R G의 값의 최소값과 현재 G값의 덧셈
            dp[num][2] = min(tmps[0], tmps[1]) + m[num][2];             // 이전까지의 R B의 값의 최소값과 현재 B값의 덧셈
        }
        return dp[num];
    }

    private static int min(int a, int b){
        return a > b ? b :a;
    }

    private static int min(int a, int b , int c){
        return min(min(a,b),c);
    }
}
