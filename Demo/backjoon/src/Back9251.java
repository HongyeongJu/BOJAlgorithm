import java.util.Scanner;

/*
Back9251 제목 :LCS문제 날짜 18.5.2
분류 : 다이나믹 프로그래밍
난이도 : 4
LCS(Longest Common Subsequence, 최장 공통 부분 수열)문제는 두 수열이 주어졌을 때, 모두의 부분 수열이 되는 수열 중 가장 긴 것을 찾는 문제이다.

예를 들어, ACAYKP와 CAPCAK의 LCS는 ACAK가 된다.
 */
public class Back9251 {
    static String str1;
    static String str2;
    static int[][] dp;          // i값은 str1의 문자열 인덱스 j값은 str2의 문자열 인덱스  (dp는 i길이와 j길이의 최장 공통 문자열)
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        str1 = scanner.nextLine();
        str2 = scanner.nextLine();



        System.out.println(lcs(str1.length(), str2.length()));


    }
    // bottom -up 방식을 사용해서 푼다.
    private static int lcs(int num1, int num2){
        dp = new int[num1 + 1][num2 + 1];               // i는 str1의 길이 j는 str2의 길이
        for(int i = 0 ; i <=num1;i++){
            dp[i][0] = 0;           // str2의 길이가 0이면 공통 문자열이 없다.(길이는 0이다.)
        }
        for(int j = 0; j <=num2; j++){
            dp[0][j] = 0;           // str1의 길이가 0이면 공통 문자열이 없다. (길이는 0이다)
        }

        for(int i = 1 ; i <= num1; i++){
            for(int j = 1 ; j <= num2 ; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[num1][num2];
    }

    private static int max(int a, int b){
        return a > b ?  a : b;
    }
}
