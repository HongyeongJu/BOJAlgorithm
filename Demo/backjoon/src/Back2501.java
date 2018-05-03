/*
Back2501 제목 :약수 구하기 날짜 18.5.3
어떤 자연수 p와 q가 있을 때, 만일 p를 q로 나누었을 때 나머지가 0이면 q는 p의 약수이다.

6을 예로 들면

6 ÷ 1 = 6 … 0
6 ÷ 2 = 3 … 0
6 ÷ 3 = 2 … 0
6 ÷ 4 = 1 … 2
6 ÷ 5 = 1 … 1
6 ÷ 6 = 1 … 0
그래서 6의 약수는 1, 2, 3, 6, 총 네 개이다.

두 개의 자연수 N과 K가 주어졌을 때, N의 약수들 중 K번째로 작은 수를 출력하는 프로그램을 작성하시오.

분류 : 수학
난이도 : 2
몇번째 약수인지 카운팅을 해주는 변수를 만들고 그 변수와 K값과 같으면 그때 약수를 출력하면 된다.
 */

import java.util.Scanner;

public class Back2501 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        boolean ok = false;
        int num = scanner.nextInt();
        int k = scanner.nextInt();
        int sub_n = 1;
        while(sub_n <= num){
            if(num % sub_n == 0){
                if(k == count){
                    ok = true;
                    System.out.println(sub_n);
                    break;
                }
                count++;
            }
            sub_n++;
        }
        if(!ok) System.out.println("0");
    }
}
