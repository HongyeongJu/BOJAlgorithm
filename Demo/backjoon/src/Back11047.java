// 수도코드

/*
먼저. 동전 문제는 각 배열의 값은 배수관계에 있어야 된다.


int counter(int k, int[] a){
    for(n -> 1) {
        if(k % n ==0) count += k / n
       }
    return count;
}

 */

import java.util.Scanner;

public class Back11047 {

    public static void main(String[] args){
        int k;

        Scanner scanner =new Scanner(System.in);
        final int n = scanner.nextInt();
        k = scanner.nextInt();
        int[] array = new int[n];
        for(int i = 0 ; i < n; i++){
            array[i] = scanner.nextInt();
        }

        System.out.println(counter(k, array));
    }

    public static int counter(int k , int[] a){
        int count = 0;
        int mok = 0;
        for(int i = a.length- 1; i >=0 ; i--){
            if(k - a[i] >=0) {
                mok = k /a[i];
                count += mok;
                k = k - mok * a[i];
            }
        }

        return count;
    }


}
