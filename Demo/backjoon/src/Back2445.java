/*
백준 2445 제목 : 별찍기 -8 날짜 :2018.04.12
분류 : 별찍기
난이도 2
예제를 보고 별찍는 규칙을 유추한 뒤에 별을 찍어 보세요.
5

*        * 1                      8     10-2 i
**      ** 2                      6
***    *** 3                      4
****  **** 4                      2
********** 5                      0
****  **** 5 - |i-5|              2     10-2|5- i|
***    ***                        4
**      **                        6
*        *                        8
즉 별찍는 출력 줄은 5 - | i -5 |
공백 줄은 |10 - 2i|로 작동한다.
 */

import java.util.Scanner;

public class Back2445 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for(int i = 1; i <= num * 2; i++){
            //별찍는 줄
            for(int j = 1; j<= num -abs(i-num) ;j++){
                System.out.print("*");
            }
            //공백찍는 줄
            for(int j = 1; j<= abs(num * 2- 2*i);j++){
                System.out.print(" ");
            }
            //별찍는 줄
            for(int j = 1; j<= num- abs(i-num);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static int abs(int a){
        return (a >=0)? a: -a;
    }
}
