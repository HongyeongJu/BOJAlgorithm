/*
Back1003 제목 : 피보나치 함수 날짜 18.5.1
분류: 동적 프로그래밍
난이도 :2

fibonacci(3)을 호출하면 다음과 같은 일이 일어난다.

fibonacci(3)은 fibonacci(2)와 fibonacci(1) (첫 번째 호출)을 호출한다.
fibonacci(2)는 fibonacci(1) (두 번째 호출)과 fibonacci(0)을 호출한다.
두 번째 호출한 fibonacci(1)은 1을 출력하고 1을 리턴한다.
fibonacci(0)은 0을 출력하고, 0을 리턴한다.
fibonacci(2)는 fibonacci(1)과 fibonacci(0)의 결과를 얻고, 1을 리턴한다.
첫 번째 호출한 fibonacci(1)은 1을 출력하고, 1을 리턴한다.
fibonacci(3)은 fibonacci(2)와 fibonacci(1)의 결과를 얻고, 2를 리턴한다.
1은 2번 출력되고, 0은 1번 출력된다. N이 주어졌을 때, fibonacci(N)을 호출했을 때, 0과 1이 각각 몇 번 출력되는지 구하는 프로그램을 작성하시오.

=> 0의 경우 1의 경우를 따로 생각하면 그 각각의 경우는 피보나치 수열이 된다.

 */

import java.util.Scanner;

public class Back1003 {
    static int[][] dp = new int[2][41];
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int t = scanner.nextInt();
        int num;

        for(int k = 0 ; k < t; k++){
            num = scanner.nextInt();

            for(int i = 0 ; i < 2; i++){
                for(int j = 0 ; j < dp[0].length; j++){
                    dp[i][j] = -1;      // 메모이제이션
                }
            }

            System.out.print(fib0(num) +" ");
            System.out.println(fib1(num));
        }

    }
    //피보나치 0부분
    static int fib0(int num){
        if(dp[0][num] != -1) return dp[0][num];
        else if(num == 0) return dp[0][num] = 1;
        else if(num == 1) return dp[0][num] = 0;
        else {
            dp[0][num] = fib0(num-2) + fib0(num-1);
        }
        return dp[0][num];
    }
    // 피보나치 1부분
    static int fib1(int num){
        if(dp[1][num] != -1) return dp[1][num];
        else if(num == 0) return dp[1][num]= 0;
        else if(num == 1) return dp[1][num] = 1;
        else{
            dp[1][num] = fib1(num-2) + fib1(num-1);
        }
        return dp[1][num];
    }
}
