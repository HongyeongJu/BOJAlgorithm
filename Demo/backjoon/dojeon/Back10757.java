/*
백준 알고리즘 10757번 제목 : 큰수 A +B 날짜 2018-04-10
분류 : 사칙연산
난이도 : 1

 */

import java.util.Scanner;

public class Back10757 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        String line = scanner.nextLine();
        String[] lines = line.split(" ");
        char[] a = lines[0].toCharArray();
        char[] b = lines[1].toCharArray();
        char[] sum;

        if(a.length > b.length){
            sum = doSum(a, b);
        }
        else{
            sum = doSum(b, a);
        }

        if(sum[0] != '0')System.out.print(sum[0]);

        for(int i = 1 ; i < sum.length; i++){
            System.out.print(sum[i]);
        }


    }

    static char[] doSum(char[] a, char[] b){
        // a가 길다는 것을 가정한다.
        char[] sum = new char[a.length + 1];
        for(int i = 0 ; i <sum.length;i++){
            sum[i] = '0';
        }
        for(int i = b.length - 1 ; i >= 0; i--){
            int aNumber = a[i] -'0';
            int bNumber = b[i] -'0';
            int sumNumber = sum[i + 1] -'0';
            //System.out.printf("a : %d b: %d , sum : %d", aNumber, bNumber, sumNumber);
            int total = aNumber + bNumber+sumNumber;
            if(total >9 ){
                sum[i +1] = (char)((total % 10) +'0');
                //System.out.println(total);
                sum[i] = '1';
            }
            else{
                sum[i +1] = (char)(total + '0');
                //System.out.println(total);
            }
        }
        return sum;
    }
}
