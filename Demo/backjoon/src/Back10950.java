import java.util.Scanner;

/*
백준 10950번 제목 :A+B -3
분류 : 사칙연산
두 수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
난이도 : 0.1

 */
public class Back10950 {
    public static void main(String[] args){
        int t;

        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        for(int i = 0 ; i < t; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a+b);
        }
    }
}
