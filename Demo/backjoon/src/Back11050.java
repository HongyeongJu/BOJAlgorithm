/*
Back 11050 제목 : 이항계수 1 날짜 : 18.4.30
분류 :  Dp 동적 계획법. (수학) 메모리 제이션 필요 없는 것 같음.
1 < n <= 10 0 <= K <= N이므로.
 */

import java.util.Scanner;

public class Back11050 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int result = binom(n, k);
        System.out.println(result);
    }

    private static int binom(int n, int k){
        if(k == 0 || n == k) return 1;
        else return binom(n-1, k-1) + binom(n-1, k);
    }
}
