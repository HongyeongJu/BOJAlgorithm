import java.util.Scanner;

public class Main {
    static int[] nums = new int[1000001];

    public static void main(String[] args){
        int n;
        nums[0] = 0;
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();

        System.out.println(recounter(n));
    }

    private static int min(int a, int b){
        return (a > b)? b : a;
    }

    private static int recounter(int x){
        for(int i = 2; i <= x; i++){
            nums[i] = nums[i-1] + 1;
            if(i % 2 == 0) nums[i] = min(nums[i], nums[i/2] + 1);
            if(i % 3 == 0) nums[i] = min(nums[i], nums[i/3] + 1);
        }

        return nums[x];
    }
}
