/*
Back4948 제목 : 베테르랑 공준 날짜 :18.04.16
분류 : 에라토스테네스의 체
난이도 : 3


베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.

이 명제는 조제프 베르트랑이 1845년에 추측했고, 파프누티 체비쇼프가 1850년에 증명했다.

예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. (11, 13, 17, 19) 또, 14보다 크고, 28보다 작거나 같은 소수는 3개가 있다. (17,19, 23)

n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오.

각 테스트 케이스를 받을 때마다 출력하므로. 먼저 에라토스테네스의 체로. 2n 까지 소수를 걸러내고
그 다음에 각 테스트 케이스를 받으면서 소수의 개수를 셈하고 출력하면 된다.

 */

import java.util.Scanner;

public class Back4948 {

    static boolean[] nums = new boolean[246913];
    public static void main(String[] args){
        for(int i = 2; i < nums.length; i++){
            nums[i] = true;
        }
        sosu();

        Scanner scanner =new Scanner(System.in);

        while(true){
            int n = scanner.nextInt();
            int count =  0;
            if(n ==0) break;
            for(int i = n + 1; i <= 2*n;i++){
                if(nums[i]) count++;
            }
            System.out.println(count);
        }

    }

    static void sosu(){
        int max = ((int)Math.sqrt(nums.length)+1);
        for(int i = 2; i <= max; i++){
            if(nums[i]){
                int j = 2;
                while(i * j < nums.length){
                    nums[i*j] =false;
                    j++;
                }
            }
        }
    }
}
