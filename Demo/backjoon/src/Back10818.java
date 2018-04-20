/*
Back10818 제목 : 최소, 최대 날짜 :18.4.19
분류 : 최대값, 최소값 구하기 (배열)
난이도 : 1
N개의 정수가 주어진다. 이 때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

5
20 10 35 30 7

배열을 이용해서 푸는 게 아닌 단순히 값을 입력받고 최대 최소인지 확인해서 변수값을 저장하면된다.
모든 정수는-1000000<=x<=1000000 이므로 처음 최대값과 최소값의 초기값을 -1000000 , 1000000으로 각각 넣으면 처음부터 최대 최소인지 판별할 수가 있다.
 */

import java.util.Scanner;

public class Back10818 {

    public static void main(String[] args){
        int max = -1000000;
        int min = 1000000;

        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        int val;
        for(int i = 0 ; i < n; i++){
            val = scanner.nextInt();
            if(val < min) min = val;
            if(val > max) max = val;
        }

        System.out.printf("%d %d", min, max);
    }
}
