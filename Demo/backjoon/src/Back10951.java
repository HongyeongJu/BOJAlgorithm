/*
백준 10951번 제목 : A+B -4
분류 : 출력?
난이도 :1
두 수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class Back10951 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){           //이게 핵심이였네.. 여러 테스트 케이스를 받아야되니까 텍스트가 있을때까지 계속 받아야되는것.,
            String line = scanner.nextLine();
            String[] lines = line.split(" ");
            int a = Integer.valueOf(lines[0]);
            int b = Integer.valueOf(lines[1]);

            System.out.println(a+b);
        }

    }
}
