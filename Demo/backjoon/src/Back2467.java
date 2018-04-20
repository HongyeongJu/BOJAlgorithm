/*
Back2467 제목 : 2차원 배열의 합 날짜 18.4.17
난이도 : 2
분류 : 다이나믹 프로그래밍?

 */

import java.util.Scanner;

public class Back2467 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[][] array;

        final int row = scanner.nextInt();
        final int column = scanner.nextInt();

        array = new int[row][column];

        for(int i = 0 ; i < row; i++){
            for(int j = 0 ; j < column ; j++){
                array[i][j] = scanner.nextInt();
            }
        }

        int t = scanner.nextInt();
        int a, b;
        int x, y;

        for(int i = 0 ; i < t; i++){
            int sum = 0;
            a = scanner.nextInt() -1;
            b = scanner.nextInt()-1;
            x = scanner.nextInt()-1;
            y = scanner.nextInt()-1;
            for(int j = a; j <= x; j++){
                for(int k = b; k <= y; k++){
                    sum += array[j][k];
                }
            }

            System.out.println(sum);
        }


    }
}
