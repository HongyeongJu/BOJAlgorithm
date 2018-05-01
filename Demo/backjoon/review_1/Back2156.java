/*
Back2156 제목 : 포도주 시식 날짜 18.4.30
분류 : 다이나믹 프로그래밍
난이도: 4
효주는 포도주 시식회에 갔다. 그 곳에 갔더니, 테이블 위에 다양한 포도주가 들어있는 포도주 잔이 일렬로 놓여 있었다. 효주는 포도주 시식을 하려고 하는데, 여기에는 다음과 같은 두 가지 규칙이 있다.

포도주 잔을 선택하면 그 잔에 들어있는 포도주는 모두 마셔야 하고, 마신 후에는 원래 위치에 다시 놓아야 한다.
연속으로 놓여 있는 3잔을 모두 마실 수는 없다.
효주는 될 수 있는 대로 많은 양의 포도주를 맛보기 위해서 어떤 포도주 잔을 선택해야 할지 고민하고 있다. 1부터 n까지의 번호가 붙어 있는 n개의 포도주 잔이 순서대로 테이블 위에 놓여 있고, 각 포도주 잔에 들어있는 포도주의 양이 주어졌을 때, 효주를 도와 가장 많은 양의 포도주를 마실 수 있도록 하는 프로그램을 작성하시오.

예를 들어 6개의 포도주 잔이 있고, 각각의 잔에 순서대로 6, 10, 13, 9, 8, 1 만큼의 포도주가 들어 있을 때, 첫 번째, 두 번째, 네 번째, 다섯 번째 포도주 잔을 선택하면 총 포도주 양이 33으로 최대로 마실 수 있다.

1. 현재 마시지 않는 건 n-1값 dp 값을이 최대값이라는 것 (n-1값도 마셨는지 안마셧는지 모른다.)
2. 현재는 마셨는데 이전것은 안마셨던건 n-2 의 dp를 이용. (왜냐면 n-2를 마셨는지 안마셨는지 모르기때문)
3. 현재 마시고 n-1값 마시고 n-2값은 안마시고 n-3값을 dp 이용 (n-3값은 마셨는지 안마셧는지 잘 모른다.)
 */

import java.util.Scanner;

public class Back2156 {
    static int[] dp = new int[10001];
    static int[] m = new int[10001];
    public static void main(String[] args){
        for(int i = 1 ; i < dp.length;i++){
            dp[i] = -1;             // 메모리 제이션을 위한 초기화.
        }
        Scanner scanner =new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i = 1; i <= num ;i++){
            m[i] = scanner.nextInt();           // 1부터 시작한다
        }
        System.out.println(podo(num));
    }

    private static int max(int a, int b){
        return (a > b) ? a : b;
    }

    private static int max(int a, int b, int c){
        return max(max(a,b), c);
    }

    private static int podo(int num){
        if(dp[num] != -1) return dp[num];
        if(num == 1) return dp[1] = m[1];
        else if(num ==2) return dp[2] = m[1] + m[2];
        else{
            dp[num] = max(podo(num-1) , podo(num-2)+ m[num] , podo(num-3) + m[num-1] + m[num]);

        }
        return dp[num];
    }
}
