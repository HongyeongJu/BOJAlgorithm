/*
백준 10844 제목 : 쉬운 계단 수 날짜 18.04.11
분류 : 다이나믹 프로그래밍
난이도 : 3
45656이란 수를 보자.

이 수는 인접한 모든 자리수의 차이가 1이 난다. 이런 수를 계단 수라고 한다.

세준이는 수의 길이가 N인 계단 수가 몇 개 있는지 궁금해졌다.

N이 주어질 때, 길이가 N인 계단 수가 총 몇 개 있는지 구하는 프로그램을 작성하시오. (0으로 시작하는 수는 없다.)

점화식 f(n) = 2 * (f(n-1) -1)
 */

import java.util.Scanner;
import java.math.BigInteger;

public class Back10844 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int num = scanner.nextInt();
        BigInteger[] array = new BigInteger[num + 1];
        array[1] = new BigInteger("9");
        array[2] = new BigInteger("17");
        for(int i = 3 ; i < num + 1 ;i++){
            BigInteger tmp = array[i-1].subtract(BigInteger.valueOf(1));
            array[i] = tmp.multiply(BigInteger.valueOf(2));
        }

        System.out.println(array[num].mod(BigInteger.valueOf(1000000000)));
    }
}
