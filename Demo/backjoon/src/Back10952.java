import java.util.Scanner;

/*
백준 10952번 제목 :  A+B -5 날짜 2018-04-10
난이도 : 1
두 수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

 */
public class Back10952 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        while(scanner.hasNext()){
            String line =scanner.nextLine();
            String[] lines = line.split(" ");
            int a = Integer.valueOf(lines[0]);
            int b = Integer.valueOf(lines[1]);

            if(a == 0 && b == 0) break;
            System.out.println(a+b);
        }
    }
}
