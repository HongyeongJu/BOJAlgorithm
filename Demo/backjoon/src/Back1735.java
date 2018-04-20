/*
Back1735 제목 : 분수 합 날짜 18.04.13
분류 : 유클리드 호제법
난이도 : 2?

분수 A/B는 분자가 A, 분모가 B인 분수를 의미한다. A와 B는 모두 자연수라고 하자.

두 분수의 합 또한 분수로 표현할 수 있다. 두 분수가 주어졌을 때, 그 합을 기약분수의 형태로 구하는 프로그램을 작성하시오. 기약분수란 더 이상 약분되지 않는 분수를 의미한다.
유클리드 호제법을 사용해서 문제를 해결한다.
 */

import java.util.Scanner;

public class Back1735 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int aNumerator = scanner.nextInt();
        int aDominator = scanner.nextInt();
        int bNumerator = scanner.nextInt();
        int bDominator = scanner.nextInt();

        int sumNumerator = aNumerator * bDominator + aDominator * bNumerator;
        int sumDominator = aDominator * bDominator;

        int gcd = hosebub(sumNumerator, sumDominator);

        System.out.printf("%d %d", sumNumerator / gcd , sumDominator / gcd);
    }

    static int hosebub(int a, int b){
        int high = max(a, b);
        int low = min(a,b);
        int tmp;
        do{
            tmp =high % low;
            high =low;
            low = tmp;
        }while(tmp != 0);

        return high;        //최대공약수 출력
    }

    static int max(int a, int b){
        return a > b ? a : b;
    }
    static int min(int a, int b){
        return a < b ? a : b;
    }
}
