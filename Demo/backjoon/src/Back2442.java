import java.util.Scanner;

/*
백준 2442 제목 : 별찍기 날짜 2018-04-11
난이도 2
분류 : 별찍기
내용
첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2*N-1개를 찍는 문제

별은 가운데를 기준으로 대칭이어야 한다.
 */
public class Back2442 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for(int i =0 ; i <num;i++){
            //공백 출력
            for(int j =0; j < num -i -1 ;j++) {
                System.out.print(" ");
            }
            // 별찍기
            for(int j = 0; j < 2 * i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
