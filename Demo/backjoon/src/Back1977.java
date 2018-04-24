import java.util.Scanner;

/*
Back1977 제목 : 완전제곱수 날짜 18.4.24
분류 : 수학
난이도 :2
M과 N이 주어질 때 M이상 N이하의 자연수 중 완전제곱수인 것을 모두 골라 그 합을 구하고 그 중 최소값을 찾는 프로그램을 작성하시오. 예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 완전제곱수는 64,  81,  100 이렇게 총 3개가 있으므로 그 합은 245가 되고 이 중 최소값은 64가 된다.

M 과N을 입력받으면  그 M과 N의 제곱근을 구해서 제곱근의 제곱들 사이의 있는 완전 제곱수를 출력하면 된다.

 */
public class Back1977 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        long sum = 0;

        int nSqrt = (int)Math.ceil(Math.sqrt(n));
        int mSqrt = (int)Math.floor(Math.sqrt(m));

        for(int i = nSqrt; i <= mSqrt; i++){
            sum += i * i;
            //System.out.println(i * i);
        }


        if(n == m || sum == 0){
            int nSqrt2 = (int)Math.sqrt(n);
            if(nSqrt2 * nSqrt2 == n){
                System.out.println(n);
                System.out.println(n);
            }else {
                System.out.println(-1);
            }
        }else{
            System.out.println(sum);
            System.out.println(nSqrt * nSqrt);
        }
    }
}
