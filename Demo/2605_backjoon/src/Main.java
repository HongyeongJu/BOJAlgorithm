import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static int[] num = new int[100];
    static int max;
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>();
        int number;
        int count = 1;
        Scanner scanner = new Scanner(System.in);

        max = scanner.nextInt();

        for(int i = 0 ; i < max ; i++){
            number = scanner.nextInt();
            a.add(i-number, count);
            count++;
        }

        for(int i = 0 ; i <max;i++){
            System.out.println(a.get(i));
        }
    }
}
