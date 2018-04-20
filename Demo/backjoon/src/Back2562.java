import java.util.Scanner;

/*
백준 2562 제목 : 최대값 날짜 :18.4.17
9개의 서로 다른 자연수가 주어질 때, 이들 중 최대값을 찾고 그 최대값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.

예를 들어, 서로 다른 9개의 자연수

3, 29, 38, 12, 57, 74, 40, 85, 61

이 주어지면, 이들 중 최대값은 85이고, 이 값은 8번째 수이다.

난이도 :1
분류 : 분류,
 */
public class Back2562 {

    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int[] array =new int[10];
        for(int i = 0 ; i < 9 ; i++){
            array[i] = scanner.nextInt();
        }
        int max = 0;
        for(int i = 1 ; i < 9; i++){
            if(array[max] < array[i]) max = i;
        }

        System.out.println(array[max]);
        System.out.println(max + 1);
    }
}
