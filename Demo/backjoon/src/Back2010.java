/*
백준 2010 제목 : 플러그 날짜 18.4.18
분류 : 수학
내용 :
선영이의 집에는 콘센트를 꽂을 수 있는 플러그가 하나밖에 없다. 선영이는 많은 컴퓨터를 가지고 있는데, 컴퓨터의 전원 문제는 어떻게 해결하는 것일까?

하나의 플러그가 있고, N개의 멀티탭이 있다. 각 멀티탭은 몇 개의 플러그로 이루어져 있다고 한다. 최대 몇 대의 컴퓨터를 전원에 연결할 수 있을까?

첫째 줄에 멀티탭의 개수 N이 주어진다. (1<=N<=500,000) 이어서 둘째 줄부터 N개의 줄에 걸쳐 각 멀티탭이 몇 개의 플러그를 꽂을 수 있도록 되어 있는지를 나타내는 자연수가 주어진다. 이 자연수는 1,000을 넘지 않는다.

count는 최악의 경우 500000000 이 될 수 있으므로 (오버플로우) int가 아닌 long으로 설정한다.

최대로 꽂을 수 있는 컴퓨터의 개수를 구해야되므로! 멀티탭에 연결하는 멀티탭은 1개만있어야된다. 즉 n-1번 까지의 수를 -1을 해주고 count에 더하고 n번은 그대로 count에 더하면된다.

멀티탭에서 꽂을 수 있는 수는 자연수이므로 0이하를 생각하지 않는다.
 */

import java.util.Scanner;

public class Back2010 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        final int n = scanner.nextInt();
        int[] multitap = new int[n + 1];
        int count = 0;                      // 총 컴퓨터를 꽂을 수 있는 개수
        for(int i = 1; i <= n ;i++){
            multitap[i] =scanner.nextInt();
        }

        for(int i= 1; i < n; i++){
            count += multitap[i] -1;
        }

        count += multitap[n];       // 마지막은 멀티탭을 꽂을 필요가 없으므로.

        System.out.println(count);
    }
}
