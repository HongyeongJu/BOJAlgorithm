import java.util.Scanner;

/*
Back10991 제목 : 별찍기 16 날짜 : 18.4.25
분류 : 별찍기
2
 *
* *
 */
public class Back10991 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for(int i = 1 ; i <= num ; i++){
            for(int j = 1; j <= num - i; j++ ){
                System.out.print(" ");
            }
            for(int j = 0 ;j < i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
