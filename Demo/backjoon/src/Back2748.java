/*
Back2748 제목 : 피보나치수 2 날짜 18.04.16
분류 : 피보나치 수
난이도 : 2
피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.

이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n>=2)가 된다.

n=17일때 까지 피보나치 수를 써보면 다음과 같다.

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597

n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.

피보나치 수 1처럼 순환이 아니라 반복을 통해서 구한다.
 */

import java.util.Scanner;

public class Back2748 {

    public static void main(String[] args){
        long[] dp = new long[91];

        dp[0] = 0;
        dp[1] = 1;
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for(int i = 2 ; i <=num;i++ ){
            dp[i] = dp[i-1] + dp[i-2];
        }

        System.out.println(dp[num]);
    }
}
