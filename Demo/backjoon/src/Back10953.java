import java.util.Scanner;

/*
백준 10953번 제목 : A+B -6 날짜 : 2018-04-10
난이도 : 1
두 수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */
public class Back10953 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0 ; i < t; i++){
            String line = scanner.nextLine();
            String[] lines = line.split(",");
            int a = Integer.valueOf(lines[0]);
            int b =Integer.valueOf(lines[1]);
            System.out.println(a +b);
        }
    }
}
