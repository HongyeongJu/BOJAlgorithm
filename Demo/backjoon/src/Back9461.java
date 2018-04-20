/*
백준9461 제목 : 파도반 수열 날짜 :18.04.18
분류 : 다이나믹 프로그래밍
난이도 :2
오른쪽 그림과 같이 삼각형이 나선 모양으로 놓여져 있다. 첫 삼각형은 정삼각형으로 변의 길이는 1이다. 그 다음에는 다음과 같은 과정으로 정삼각형을 계속 추가한다. 나선에서 가장 긴 변의 길이를 k라 했을 때, 그 변에 길이가 k인 정삼각형을 추가한다.

파도반 수열 P(N)은 나선에 있는 정삼각형의 변의 길이이다. P(1)부터 P(10)까지 첫 10개 숫자는 1, 1, 1, 2, 2, 3, 4, 5, 7, 9이다.

N이 주어졌을 때, P(N)을 구하는 프로그램을 작성하시오.

점화식 : f(n) = f(n-3) + f(n-2)
f(1) :1
f(2) : 1
f(3) : 1

 */

import java.util.Scanner;

public class Back9461 {
    static long[] dp =new long[101];
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num;
        for(int i = 0; i < dp.length; i++){
            dp[i] = -1;             //-1로 초기화
        }

        int t = scanner.nextInt();
        for(int i = 0 ; i < t; i++){
            num = scanner.nextInt();
            System.out.println(padoban(num));
        }
    }

    public static long padoban(int num){
        if(num == 1) return dp[1] = 1;
        if(num == 2) return dp[2] = 1;
        if(num == 3) return dp[3] = 1;
        if(dp[num] != -1) return dp[num];       // 메모리 제이션

        return dp[num] = padoban(num-3) + padoban(num-2);
    }
}
