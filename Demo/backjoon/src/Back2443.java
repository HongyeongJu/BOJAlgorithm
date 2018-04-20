/*
백준 2443 제목 : 별찍기 -6 날짜 18.4.11
분류 : 별찍기
난이도 : 2
내용 : 첫째 줄에는 별 2*N-1개, 둘째 줄에는 별 2*N-3개, ..., N번째 줄에는 별 1개를 찍는 문제

별은 가운데를 기준으로 대칭이어야 한다.
 */

import java.util.Scanner;

public class Back2443 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int num = scanner.nextInt();

        for(int i = 0 ; i < num; i++){
            //공백 출력 부
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            // 별찍기 부
            for(int j = 0; j < 2 * (num-i) -1 ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
