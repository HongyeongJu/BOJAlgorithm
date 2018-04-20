/*
백준 1932번 제목 : 숫자 삼각형 날짜 18.04.11
분류 : 다이나믹 프로그래밍
난이도 :3
내용
        7
      3   8
    8   1   0
  2   7   4   4
4   5   2   6   5
위 그림은 크기가 5인 숫자 삼각형의 한 모습이다.

맨 위층 7부터 시작해서 아래에 있는 수 중 하나를 선택하여 아래층으로 내려올 때, 이제까지 선택된 수의 합이 최대가 되는 경로를 구하는 프로그램을 작성하라. 아래층에 있는 수는 현재 층에서 선택된 수의 대각선 왼쪽 또는 대각선 오른쪽에 있는 것 중에서만 선택할 수 있다.

삼각형의 크기는 1 이상 500 이하이다. 삼각형을 이루고 있는 각 숫자는 모두 정수이며, 범위는 0 이상 9999 이하이다.

 => 위에서 부터 아래로 각 자리끼리 더한다. 그리고 큰 값을 그 자리에 대입하는 방식을 취하고 맨 마지막에는 제일 큰 수를 구하면 된다.
 */

import java.util.Scanner;

public class Back1932 {
    static int[][] array;
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int num = scanner.nextInt();

        array = new int[num][num];
        int[][] sum = new int[num][num];
        //입력
        for(int i = 0; i < num; i++){
            for(int j = 0; j <= i; j++ ){
                array[i][j] = scanner.nextInt();
                sum[i][j] = array[i][j];
            }
        }

        for(int i = 0 ; i < num - 1; i++){
            for(int j =0; j<= i; j++){
                sum[i+1][j] = max(sum[i+1][j], array[i+1][j] + sum[i][j]);
                sum[i+1][j+1] = max(sum[i+1][j+1],  array[i+1][j+1] + sum[i][j]);
            }
        }
        int max = sum[num-1][0];

        for(int i = 0; i < num; i++){
            if(max < sum[num-1][i]) max = sum[num-1][i];
        }

        System.out.println(max);
    }

    public static int max(int a, int b){
        return a > b ? a : b;
    }
}
