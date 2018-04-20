/*
백준 2446 제목 별찍기 -9 날짜 18.04.12
분류 : 별찍기 (수학)
난이도 : 2
5

*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********
*
*와 시바.. 수학을 써야되는구나... x좌표 y 좌표를 이용해서 함수를 구한다!!
* 별식 : 2|i-Num| + 1
* 공백식 : N-1 - |i-Num|
 */

import java.util.Scanner;

public class Back2446 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for(int i = 1; i < 2*num;i++){

            //공백식
            for(int j = 1; j <= num - 1- abs(i-num) ;j++){
                System.out.print(" ");
            }
            //별찍는 식
            for(int j = 1; j <= 2 * abs(i - num) + 1;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    private static int abs(int a){
        return a >= 0? a: -a;
    }
}
