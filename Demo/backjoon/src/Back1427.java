/*
백준 1427 제목 : 소트인사이드 날짜 18.04.12
난이도 : 2
분류 : 정렬
배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Back1427 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        long num = scanner.nextLong();
        int index = 0;
        int[] array =new int[11];
        while(num != 0){
            array[index++] = (int)(num % 10);
            num /= 10;
        }

        for(int i = 0; i < index- 1; i++){
            int max = i;
            for(int j = i; j <index ; j++){
                if(array[max] < array[j]) max = j;
            }

            int tmp = array[max];
            array[max] = array[i];
            array[i] = tmp;
        }

        for(int i = 0 ; i < index ; i++){
            System.out.print(array[i]);
        }
    }
}
