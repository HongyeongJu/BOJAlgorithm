import java.util.Scanner;

/*
백준 2193번 이름 : 이친수
분류 : 동적프로그래밍(dynamic programming)
0과 1로만 이루어진 수를 이진수라 한다. 이러한 이진수 중 특별한 성질을 갖는 것들이 있는데, 이들을 이친수(pinary number)라 한다. 이친수는 다음의 성질을 만족한다.

이친수는 0으로 시작하지 않는다.
이친수에서는 1이 두 번 연속으로 나타나지 않는다. 즉, 11을 부분 문자열로 갖지 않는다.
예를 들면 1, 10, 100, 101, 1000, 1001 등이 이친수가 된다. 하지만 0010101이나 101101은 각각 1, 2번 규칙에 위배되므로 이친수가 아니다.

N(1≤N≤90)이 주어졌을 때, N자리 이친수의 개수를 구하는 프로그램을 작성하시오.
난이도 : 4 (다시 볼 필요가...)

함수 구성 pinary(N, digitNumber) => 첫번쨰 자리가 digitNumber인 N개의 자리 숫자 개수 출력
 */
public class Back2193 {
    static long[] dp;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n =  scanner.nextInt();

        dp = new long[n + 1];
        for(int i = 0; i < dp.length; i++){
            dp[i] = -1;
        }
        System.out.println(pinary(n));
    }

    static long pinary(int n){
        if(n == 1) return 1;
        if(n == 2) return 1;
        if(dp[n] != -1) return dp[n];       //이미 계산함

        dp[n] = pinary(n-1) + pinary(n-2);

        return dp[n];

    }

}
