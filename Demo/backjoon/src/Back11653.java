/*
Back11653 제목 : 소인수분해 날짜 : 18.4.23
분류 : 소인수 분해
난이도 :2

=>
정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.

=> 처음에 생각했을 떄 정수 N 이하의 소수를 다 구해야 되나 라고 생각했는데.
그럴 필요가 없다. 그냥 N 이하의 숫자를 for문을 통해 돌면서 나눌수 있으면 나누고 못나눈다면 i++ 하는 형식으로 하면 된다.
(왜냐하면 N을 i로 나눌 수 없다라는 건 1. i가 소수가 아니거나 (이미 다른 소수로 많이 나눠져있는 상태 ex) 4   2. 소수인데 인수가 아닌경우이다. )

 */

import java.util.Scanner;

public class Back11653 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        int num = scanner.nextInt();
        int i = 2;
        while(i <= num){
            if(num % i == 0){       // 나누어 떨어진다면
                num /= i;
                System.out.println(i);
            }else{
                i++;            // 나누어 떨어지지 않는다면 i++을 통해 숫자를 늘린다.
            }
        }
    }
}
