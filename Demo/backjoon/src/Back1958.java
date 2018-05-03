/*
Back1958 제목:LCS3 날짜 :18.5.3
분류 : 동적 프로그래밍 LCS
난이도: 5
문자열과 놀기를 세상에서 제일 좋아하는 영식이는 오늘도 문자열 2개의 LCS(Longest Common Subsequence)를 구하고 있었다. 어느 날 영식이는 조교들이 문자열 3개의 LCS를 구하는 것을 보았다. 영식이도 도전해 보았지만 실패하고 말았다.

이제 우리가 할 일은 다음과 같다. 영식이를 도와서 문자열 3개의 LCS를 구하는 프로그램을 작성하라.

첫 줄에는 첫 번째 문자열이, 둘째 줄에는 두 번째 문자열이, 셋째 줄에는 세 번째 문자열이 주어진다. (각 문자열의 길이는 100보다 작거나 같다)

첫 줄에 첫 번째 문자열과 두 번째 문자열과 세 번째 문자열의 LCS의 길이를 출력한다.

LCS문제에서 2차원 배열을 생각했었는데 여기선 3차원 배열로 생각하면 된다.
 */

import java.util.Scanner;

public class Back1958 {
    static int[][][] l;
    static String str1;
    static String str2;
    static String str3;
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        str1 = scanner.nextLine();
        str2 = scanner.nextLine();
        str3 = scanner.nextLine();

        System.out.println(lcs(str1.length(), str2.length(), str3.length()));
    }

    static int lcs(int num1, int num2, int num3){
        l = new int[num1+1][num2+1][num3+1];
        for(int i = 0 ; i < l.length ; i++){
            for(int j = 0; j <l[0].length ;j++){
                l[i][j][0] = 0;             //i j 평면에 있는 k가 0인건 다 0으로 처리 (세번째 문자열의 길이가 0이면 공통문자열은 0이다)
            }
        }
        for(int j = 0; j <l[0].length; j++){
            for(int k = 0; k <l[0][0].length; k++){
                l[0][j][k] = 0;             // j k 평면에 있는 i가 0인건 다 0처리 (첫번쨰 문자열의 길이가 0이면 공통문자열은 0이다)
            }
        }
        for(int i =0 ; i <l.length ;i++){
            for(int k = 0 ; k <l[0][0].length;k++){
                l[i][0][k] = 0;             // i k평면에 있는 j가 0인건 다 0 처리( 두번째 문자열의 길이가 0이면 공통문자열은 0이다)
            }
        }

        for(int i = 1 ; i <l.length ;i++){
            for(int j = 1; j <l[0].length ; j++){
                for(int k = 1; k <l[0][0].length ;k++){
                    if(str1.charAt(i-1) == str2.charAt(j -1) && str1.charAt(i-1) == str3.charAt(k-1)){      //즉 3개의 문자열이 같다면
                        l[i][j][k] = l[i-1][j-1][k-1] +1;
                    }else {
                        l[i][j][k] = max(l[i-1][j][k], l[i][j-1][k], l[i][j][k-1]);
                    }
                }
            }
        }

        return l[num1][num2][num3];
    }

    static private int max(int a, int b){
        return a > b ? a : b;
    }
    static private int max(int a, int b, int c){
        return max(max(a,b), c);
    }
}
