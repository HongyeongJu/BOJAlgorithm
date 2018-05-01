/*
bacj10872  제목 : 팩토리얼 날짜 :18.5.1
분류 : 구현
난이도 :1
팩토리얼 구현 단 12!까지만 있으므로 long형으로도 충분
 */

import java.util.Scanner;

public class Back10872 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println(fac(num));
    }

    public static long fac(int num){
        if(num <= 1) return 1;
        return num * fac(num-1);
    }
}
