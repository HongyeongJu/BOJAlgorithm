import java.util.Scanner;
// 18.04.09
// 난이도 2
// 일단 이 차원 배열을 입력 받아야겠다.
// 이차원 배열을 입력받고 함수를 만들어서 그것을 출력하도록한다.(최대값)
public class Back2455 {

    public static void main(String[] args){
        int[][] array = new int[4][2];

        Scanner scanner = new Scanner(System.in);

        for(int i = 0 ; i < 4 ; i++){
            array[i][0] = scanner.nextInt();
            array[i][1] = scanner.nextInt();
        }

        System.out.println(maxInTrain(array));
    }

    static int maxInTrain(int[][] a ){
        int number = 0;
        int max = number;

        for(int i = 0; i < 4; i++){
            number -= a[i][0];
            number += a[i][1];

            if(max < number) max = number;
        }
        return max;
    }
}
