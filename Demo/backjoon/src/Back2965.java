/*
Back2965 제목 : 캥거루 세마리 날짜 :18.4.25
캥거루 세 마리가 사막에서 놀고 있다. 사막에는 수직선이 하나 있고, 캥거루는 서로 다른 한 좌표 위에 있다.

한 번 움직일 때, 바깥쪽의 두 캥거루 중 한 마리가 다른 두 캥거루 사이의 정수 좌표로 점프한다. 한 좌표 위에 있는 캥거루가 두 마리 이상일 수는 없다.

캥거루는 최대 몇 번 움직일 수 있을까?

캥거루가 최대 몇 번 움직일 수 있는지 출력한다.
 */

import java.util.Scanner;

public class Back2965 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        int[] n = new int[3];
        for(int i = 0 ; i < n.length; i++){
            n[i] = scanner.nextInt();
        }

        if(n[1] - n[0] > n[2] - n[1]){
            System.out.println(n[1] - n[0] -1);
        }else{
            System.out.println(n[2]-n[1] -1);
        }
    }
}
