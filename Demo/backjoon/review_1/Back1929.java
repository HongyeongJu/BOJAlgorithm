/*
백준 1929 제목:소수 구하기 날짜 18.04.16
난이도 : 3
분류 : 수학
M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

에라토스테네스의 체를 이용해서 푼다 .( 배수를 곱해서..)
 */

import java.util.Scanner;

public class Back1929 {

    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        boolean[] nums = new boolean[1000001];

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        for(int i = 2 ; i <= n;i++){
            nums[i] = true;
        }
        int max = ((int)Math.sqrt(n))+1;            // 에라토스테네스의 체의 공식. n제곱근 만큼만 경우의 수를 생각하면된다.
        for(int i = 2; i <= max;i++){
            if(nums[i]){
                int j = 2;
                while(i*j <= n){
                    nums[i*j] = false;
                    j++;
                }
            }
        }
        for(int i = m; i <= n;i++){
            if(nums[i]) System.out.println(i);
        }
    }

}
