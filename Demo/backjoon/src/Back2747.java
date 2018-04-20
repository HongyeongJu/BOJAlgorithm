/*
백준 2747 제목 : 피보나치 수 날짜 18.4.16
분류 : 수학 피보나치, 동적 프로그래밍
피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.

이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n>=2)가 된다.

n=17일때 까지 피보나치 수를 써보면 다음과 같다.

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597

n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.

다이나믹 프로그래밍 형식으로 피보나치 수를 구한다. = >실패  숫자 45부터 시간초과가 걸린다. 너무 많아서...
결국 순환이 아니라 . 반복으로 구한다.
 */

import java.util.Scanner;

public class Back2747 {


    static long [] dp = new long[91];
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int num = scanner.nextInt();

        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= num; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[num]);

    }

}
