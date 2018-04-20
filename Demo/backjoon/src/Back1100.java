/*
백준1100 제목 :  하얀 칸 날짜 : 18.4.17
분류 : 2차원 배열 정렬?
난이도 : 2
 */

import java.util.Scanner;

public class Back1100 {
    public static void main(String[] args){
        char[][] pan = new char[9][9];          // 1부터 셈하기 위해서.
        int count = 0;
        Scanner scanner =new Scanner(System.in);
        for(int i = 0 ; i < 8; i++){
            String str = scanner.nextLine();
            pan[i] =str.toCharArray();
        }

        for(int n = 0; n <4; n++){
            //짝수
            for(int i = 0; i < 4; i++){
                if(pan[2*n][2*i] == 'F')count++;
            }
            //홀수 판
            for(int i = 0; i < 4; i++){
                if(pan[2*n+1][2*i+1]=='F')count++;
            }
        }

        System.out.println(count);
    }
}
