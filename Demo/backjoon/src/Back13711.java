/*
Back13711 제목 :LCS4 날짜 :18.5.3
분류 : LCS 동적 프로그래밍
난이도 : 4
LCS(Longest Common Subsequence, 최장 공통 부분 수열)문제는 두 수열이 주어졌을 때, 모두의 부분 수열이 되는 수열 중 가장 긴 것을 찾는 문제이다.

예를 들어, [1, 2, 3]과 [1, 3, 2]의 LCS는 [1, 2] 또는 [1, 3] 이다.

1부터 N까지 정수가 모두 한 번씩 등장하는 두 수열 A와 B가 주어졌을 때, 두 수열의 LCS 크기를 구하는 프로그램을 작성하시오.

예전에 LCS문제를 풀때 처럼 풀면 될듯하다. 다만 이건 정수값이니 정수배열을 만들고 정수배열에 값을 넣은뒤 그 값을 비교하는 형식으로 하면 될듯하다.

 */


import java.util.Scanner;

public class Back13711 {
    static int[] array1 = new int[100001];
    static int[] array2 = new int[100001];
    static int[][] l;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int t = scanner.nextInt();

        for(int i = 0 ; i <= t; i++){
            array1[i] = scanner.nextInt();
        }
        for(int j = 0 ; j <= t; j++){
            array2[j] = scanner.nextInt();
        }

        System.out.println(lcs(t));
    }

    public static int lcs(int t){
        l = new int[t+ 1][t + 1];
        for(int i = 0; i<=t; i++){
            l[i][0]= 0;
        }
        for(int j = 0 ; j <=t;j++){
            l[0][j] = 0;
        }

        for(int i = 1; i <=t; i++){
            for(int j = 1; j <=t ;j++){
                if(array1[i-1] == array2[j-1]){
                    l[i][j] = l[i-1][j-1] + 1;
                }
                else{
                    l[i][j] = max(l[i-1][j], l[i][j-1]);
                }
            }
        }
        return l[t][t];
    }

    private static int max(int a, int b){
        return a > b? a : b;
    }
}
