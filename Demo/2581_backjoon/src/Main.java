import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int[] answers = new int[2];
        int m, n;
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        n = scanner.nextInt();

        answers = sosu(m, n);

        if(answers[0] == -1)
            System.out.printf("-1");
        else
            System.out.printf("%d %d", answers[1],answers[0]);
    }

    static int[] sosu(int m, int n){
        int i, j;
        int count;
        int sum = 0;
        int[] aa = new int[2];
        ArrayList<Integer> a = new ArrayList<>();

        if(m == 1) m = 2;
        for(i = m; i <= n; i++){
            count = 0;
            for(j = 2; j < i ;j++){
                if(i % j == 0) count++;
            }
            if(count ==0 ){
                a.add(i);
                sum += i;
            }
        }
        if(a.isEmpty())
            aa[0] = -1;
        else{
            aa[0] = a.get(0);
            aa[1] = sum;
        }
        return aa;
    }
}
