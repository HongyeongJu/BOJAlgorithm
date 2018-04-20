import java.util.Scanner;

/*
백준 2576 제목 :홀수 날짜 :18.4.18
분류 : 수학? , 정렬?
난이도 :1
7개의 자연수가 주어질 때, 이들 중 홀수인 자연수들을 모두 골라 그 합을 구하고, 고른 홀수들 중 최소값을 찾는 프로그램을 작성하시오.

예를 들어, 7개의 자연수 12, 77, 38, 41, 53, 92, 85가 주어지면 이들 중 홀수는 77, 41, 53, 85이므로 그 합은

77 + 41 + 53 + 85 = 256

이 되고,

41 < 53 < 77 < 85

이므로 홀수들 중 최소값은 41이 된다.
 */
public class Back2576 {
    public static void main(String[] args){
        int min = 0;                // 홀수들은 자연수 이므로 0일 때 아무 것도 없는 것을 의미
        Scanner scanner =new Scanner(System.in);
        int sum = 0;
        int num;
        for(int i = 0 ; i < 7; i++){
            num = scanner.nextInt();
            if(num % 2 == 1){           // 홀수라면
                if(min == 0) min = num;
                if(min > num) min = num;
                sum += num;
            }
        }

        if(min == 0){
            System.out.println(-1);
            return;
        }

        System.out.println(sum);
        System.out.println(min);
    }
}
