/*
Back10164 제목 : 격자상의 경로 날짜 18.4.30
분류 : 다이나믹 프로그래밍

경로의 점화식은 f(i, j) = f(i-1, j) + f(i, j-1) 이 경로의 경우의 수 구하는 점화식

1. 중간점의 좌표를 구하는 모듈
2. 원하는경로를 이동하는 경우의 수를 구하는 모듈

 */

import java.util.Scanner;

public class Back10164 {

    static int[][] m = new int[16][16];
    static int[][] l = new int[16][16];
    public static void main(String[] args) {
        int[] mids = new int[2];        //0행 1 열
        int row;
        int colum;
        int num;
        int count = 1;
        Scanner scanner =new Scanner(System.in);
        row = scanner.nextInt();
        colum = scanner.nextInt();
        num = scanner.nextInt();

        for(int i = 0 ; i < row; i++){
            for(int j = 0; j < colum ; j++){
                m[i][j] = count++;
            }
        }

        isMid(num,row, colum, mids);

        int c1 = solveCase(0,0, mids[0], mids[1]);
        int c2 = solveCase(mids[0], mids[1], row-1, colum -1);

        System.out.println(c1 *c2);

    }

    // 중간점의 좌표를 구하는 모듈
    static void isMid(int num, int row, int colum, int[] mids){
        for(int i = 0 ; i < row; i++){
            for(int j = 0 ; j < colum ;j++){
                if(num == m[i][j]) {        // 원하는 중간 경로의 수와 번호가 같은 경우
                    mids[0] = i;            // 배열을 통해서 좌표를 저장한다.
                    mids[1] = j;
                }
            }
        }
    }

    // 경로의 경우의 수 구하는 모듈
    static int solveCase(int startR, int startC, int endR, int endC){
        for(int i = startR ; i <= endR ; i++){
            for(int j = startC ; j <= endC ;j++){
                if(i == startR) l[i][j] = 1;    // 맨 윗줄 인 경우 1
                else if(j == startC) l[i][j] = 1;       // 왼쪽 세로줄 인경우 1
                else{
                    l[i][j] = l[i-1][j] + l[i][j-1];
                }
            }
        }
        return l[endR][endC];
    }
}
