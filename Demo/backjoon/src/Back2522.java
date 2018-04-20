import java.util.Scanner;

/*
백준2522 제목 :별찍기 12 날짜 18.4.19
난이도 : 1
  예제를 보고 별찍는 규칙을 유추한 뒤에 별을 찍어 보세요.
  3
  *
 **
***
 **
  *
  공백줄 함수 y = |x-3|
  출력줄 함수 y = 3 - |x -3|
 */
public class Back2522 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        int num = scanner.nextInt();

        for(int i =1; i < 2*num;i++){
            // 공백줄
            for(int j =1; j<= abs(i-num) ; j++){
                System.out.print(" ");
            }
            //별 출력줄
            for(int j = 1; j <= num - abs(i-num); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static int abs(int a){
        return (a >= 0) ?a : -a;
    }
}
