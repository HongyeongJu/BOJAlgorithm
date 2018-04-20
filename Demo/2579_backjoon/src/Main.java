import java.util.Scanner;

public class Main {

    static int[] stare = new int[305];
    static int[] dp = new int[305];
    static int m = 0;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        for(int i = 1; i <= m; i++){
            stare[i] = scanner.nextInt();
        }

        for(int i = 1; i <= 3 && i <= m; i++){
            if(i!=3) dp[i] = dp[i-1] +stare[i];
            else dp[i] = max(stare[i-1] +stare[i], dp[i-2]+stare[i]);
        }

        for(int i = 4; i <= m ;i++){
            dp[i] = max(dp[i-3]+stare[i-1]+stare[i], dp[i-2] +stare[i]);
        }

        System.out.println(dp[m]);
    }
    static int max(int x, int y){
        return x > y? x : y;
    }
}
