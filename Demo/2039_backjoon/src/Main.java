import java.util.Scanner;

public class Main {

    static int[] height = new int[10];
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int[] ans = new int[2];

        for(int i = 1; i <= 9; i++){
            height[i] = scanner.nextInt();
            sum += height[i];
        }
        sort();         //정렬 후 푼다. 블루트 포스로

        for(int i = 1; i < 9; i++){
            for(int j = i+1; j <=9; j++){
                if(sum - (height[i] + height[j]) == 100){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }

        for(int i =1; i <= 9; i++){
            if(height[ans[0]] != height[i] && height[ans[1]] != height[i]) System.out.println(height[i]);
        }
    }

    static void sort(){
        int tmp = 0;
        int e;
        for(int i = 1; i < 9; i++){
            tmp = i;
            for(int j = i+1; j <= 9 ;j++){
                if(height[tmp] > height[j]) tmp = j;
            }
            e = height[tmp];
            height[tmp] = height[i];
            height[i] = e;
        }
    }
}
