/*
Back2588 제목 : 곱셈 날짜 18.4.20
분류 : 수학?
난이도 :1
2번째 수의 각각 1의 자리 10의 자리 100의 자리를 추출하여  1번째 숫자에 곱하고 그 결과값을 출력하고 원래 수와 2번째 수를 곱해서 출력한다.
 */

import java.util.Scanner;

public class Back2588 {

    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        int first =scanner.nextInt();
        int last = scanner.nextInt();
        int lt = last;

        int[] tmp = new int[3];
        int[] result = new int[4];

        for(int i = 0 ; i < tmp.length; i++){
            tmp[i] = last % 10;
            last /= 10;
            result[i] = tmp[i] * first;
        }
        result[3] = lt * first;

        for(int i = 0 ; i < result.length; i++){
            System.out.println(result[i]);
        }

    }

}
