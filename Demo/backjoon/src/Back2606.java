import java.util.Scanner;

public class Back2606 {

    // 먼저 컴퓨터 100대를 배열로 표현 그리고 연결 되어 있는 상황을 배열의 값으로 표현한다.
    // 연결 할 때마다. 왼쪽 값을 기준 삼아 왼쪽 값과 같은 인덱스로 오른쪽도 다 바꿔버린다.
    // 그리고 1번 컴퓨터랑 같은 값을 찾으면 된다.

    static int[] com = new int[101];   // 1~100대

    public static void main(String[] args){
        int left , right;
        int num;
        Scanner scanner = new Scanner(System.in);
        final int COM_NUM = scanner.nextInt();
        scanner.nextLine();
        final int TESTCASE = scanner.nextInt();
        String tmp;
        int count = 0;

        for(int i = 1; i <= COM_NUM;i++)
        {
            com[i] = i;     // 각각 배열을 연결된 값으로 초기화
        }
        scanner.nextLine();
        for(int i = 1; i <= TESTCASE; i++){
            left = scanner.nextInt();
            right = scanner.nextInt();
            num = com[left];
            for(int j = 1 ; j <=COM_NUM;j++)
            {
                if(num == com[j]){
                    com[j] = com[right];
                }
            }
        }
        // 개수 세기
        for(int i = 1; i <= COM_NUM; i++){
            if(com[i] == com[1]) count++;
        }
        System.out.println(count -1);
    }
}
