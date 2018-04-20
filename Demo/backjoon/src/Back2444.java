/*
백준 2444 제목 : 별찍기 -7 날짜 2018.04.11
분류 : 별찍기
난이도 :3
내용
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 */

import java.util.Scanner;

// 절댓값을 사용하자!
public class Back2444 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for(int i =0 ; i <num;i++){
            //공백 출력
            for(int j =0; j < num -i -1 ;j++) {
                System.out.print(" ");
            }
            // 별찍기
            for(int j = 0; j < 2 * i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i =1 ; i < num; i++){
            //공백 출력
            for(int j = 0; j < i ; j++){
                System.out.print(" ");
            }
            //별찍기
            for(int j = 0; j < 2 * (num - i) -1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
