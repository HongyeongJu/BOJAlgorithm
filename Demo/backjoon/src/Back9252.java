/*
Back 9252 제목 :LCS2 날짜 18.5.3
분류 : LCS 다이나믹 프로그래밍
난이도 :4~5
LCS(Longest Common Subsequence, 최장 공통 부분 수열)문제는 두 수열이 주어졌을 때, 모두의 부분 수열이 되는 수열 중 가장 긴 것을 찾는 문제이다.

예를 들어, ACAYKP와 CAPCAK의 LCS는 ACAK가 된다.

먼저 LCS를 구현한다. 단 dp값은 class로 정의한다 (int[][]와 c[][](방향)
 */

import java.util.Scanner;

public class Back9252 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        Dp dp = new Dp(str1, str2);

        System.out.println(dp.lcs2());
        System.out.println(dp.backtracking());

        //dp.printL();
        //dp.printC();
    }


    private static class Dp{
        int[][] dp;
        char[][] c;
        String str1;
        String str2;
        final int num1;
        final int num2;
        String lcsentence ="";

        Dp(String str1, String str2){
            num1 = str1.length();
            num2 = str2.length();
            this.str1 = str1;
            this.str2 = str2;
            dp = new int[num1 + 1][num2 + 1];
            c = new char[num1+1][num2+1];


            for(int i = 0 ; i < dp.length ;i++){
                dp[i][0] = 0;
                c[i][0] ='-';
            }
            for(int j = 0 ; j < dp[0].length; j++){
                dp[0][j] = 0;
                c[0][j] = '-';
            }
        }

        // lcs를 구현하는 함수
        public int lcs2(){
            for(int i = 1; i <= num1; i++){
                for(int j = 1; j<=num2;j++){
                    if(str1.charAt(i -1) == str2.charAt(j -1)){         // 문자열에는 -1값으로 해줘야됨 왜냐면 문자 대응되는 인덱스값이 1더 적기 때문
                        dp[i][j] = dp[i-1][j-1] + 1;
                        c[i][j] = 'Q';              //Q는 대각선이동을 뜻함
                    }
                    else{
                        if(isLeftMax(dp[i-1][j], dp[i][j-1])){
                            dp[i][j] = dp[i-1][j];
                            c[i][j] = 'W';              // W는 위쪽 이동을 뜻함
                        }
                        else {
                            dp[i][j] = dp[i][j-1];
                            c[i][j] = 'A';              // A는 왼쪽 이동을 뜻함
                        }
                    }
                }
            }
            return dp[num1][num2];
        }

        public String backtracking(){
            int i = num1;           // 배열의 끝값
            int j = num2;
            while(c[i][j] != '-'){
                if(c[i][j] == 'Q'){
                    lcsentence = str1.charAt(i-1) + lcsentence;
                    i--;
                    j--;
                }
                else if(c[i][j] =='A'){
                    j--;
                }
                else if(c[i][j] =='W'){
                    i--;
                }
            }
            return lcsentence;
        }

        private void printL(){
            for(int i = 0 ; i < dp.length;i++){
                for(int j = 0 ; j <dp[0].length; j++){
                    System.out.printf("%d ", dp[i][j]);
                }
                System.out.println();
            }
        }

        private void printC(){
            for(int i = 0; i < dp.length;i++){
                for(int j = 0 ; j < dp[0].length; j++){
                    System.out.printf("%c ", c[i][j]);
                }
                System.out.println();
            }
        }

        private boolean isLeftMax(int a, int b){
            return a > b ? true : false;
        }
    }


}
