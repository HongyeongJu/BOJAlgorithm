/*
백준13458 제목 : 시험감독 날짜 18.4.18
분류 : 시뮬레이션?
난이도 :3
총 N개의 시험장이 있고, 각각의 시험장마다 응시자들이 있다. i번 시험장에 있는 응시자의 수는 Ai명이다.

감독관은 총감독관과 부감독관으로 두 종류가 있다. 총감독관은 한 방에서 감시할 수 있는 응시자의 수가 B명이고, 부감독관은 한 방에서 감시할 수 있는 응시자의 수가 C명이다.

각각의 시험장에 총감독관은 오직 1명만 있어야 하고, 부감독관은 여러 명 있어도 된다.

각 시험장마다 응시생들을 모두 감시해야 한다. 이 때, 필요한 감독관 수의 최소값을 구하는 프로그램을 작성하시오.
첫째 줄에 시험장의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다.

둘째 줄에는 각 시험장에 있는 응시자의 수 Ai (1 ≤ Ai ≤ 1,000,000)가 주어진다.

셋째 줄에는 B와 C가 주어진다. (1 ≤ B, C ≤ 1,000,000)

1
1
1 1
 */

import java.util.Scanner;

public class Back13458 {
    static int[] testsite;          //시험장 배열 (응시자의 수 넣음)
    public static void main(String[] args){
        long count = 0;              // 감독관의 수          //틀린 이유 (오버플로우)
        Scanner scanner =new Scanner(System.in);
        final int num = scanner.nextInt();  //시험장의 개수
        testsite = new int[num + 1];            // 배열 정의
        int b, c ;      // 시험관의 감독할 수 있는 사람 수
        for(int i = 1 ; i<= num;i++){
            testsite[i] = scanner.nextInt();
        }

        b = scanner.nextInt();
        c = scanner.nextInt();

        // 첫번째  (주 감독관이 몇명 필요한지 셈하기)
        for(int i = 1; i<= num; i++){
            if(testsite[i] > 0){            // 방에 아무도 없다면 count를 할 필요도 없으므로..
                testsite[i] -= b;
                count++;
            }
        }
        // 두번째 (보조 감독관이 몇명 필요한지 셈하기)
        for(int i =1; i <=num;i++){
            if(testsite[i] >0){            //  주 감독관만으로도 충분하다면 셈할 필요도 없으므로
                if(testsite[i] % c == 0) count += testsite[i] /c;           // c와 시험장에 있는 사람의 수가 정확하게 나누어 떨어진다면. (감독하는 사람이 정확하게 딱 맞는다면)
                else count += ((int)(testsite[i] /c)) +1;                   // 감독하는 사람의 수가 초과가 된다면
            }
        }

        System.out.println(count);
    }
}
