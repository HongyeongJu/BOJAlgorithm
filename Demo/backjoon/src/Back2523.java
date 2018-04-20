/*
백준2523 제목 : 별찍기 13 날짜  18.4.19
 예제를 보고 별찍는 규칙을 유추한 뒤에 별을 찍어 보세요.

*
**
***
**
*

 */

import java.util.Scanner;

public class Back2523 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        int num = scanner.nextInt();

        for(int i = 1 ; i < 2 *num ; i++){
            // 별찍는 부분
            for(int j =1 ;j <= num - abs(i-num) ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static int abs(int a){
        return (a >= 0) ? a : -a;
    }
}
