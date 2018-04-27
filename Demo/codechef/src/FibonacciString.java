/*
코드 쉐프 피보나치 스트링
All submissions for this problem are available.

For a string S let the unique set of characters that occur in it one or more times be C. Consider a permutation of the elements of C as (c1,c2,c3...). Let f(c) be the number of times c occurs in S.

If any such permutation of the elements of C satisfies f(ci)=f(ci−1)+f(ci−2) for all i≥3, the string is said to be a dynamic string.

Mr Bancroft is given the task to check if the string is dynamic, but he is busy playing with sandpaper. Would you help him in such a state?

Note that if the number of distinct characters in the string is less than 3, i.e. if |C|<3, then the string is always dynamic.

1. 먼저 문자열에 있는 영단어의 개수를 각각 체크한다. (모든 배열을 돌아다니면서 개수 증가)
2. 다음에는 개수가 적은 것부터 시작하여 큰 것 까지 오름차순으로 알파벳을 정렬한다.        <- 가장 적은 수를 계속 찾아가면서 새로운 문자열을 만들어낸다.
3. 동적 프로그래밍을 실시한다.
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FibonacciString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0 ; i< num; i++){
            String str = scanner.nextLine();
            int[] nums = alphabeit(str);

            Arrays.sort(nums);

            if(isPibo(nums)) System.out.println("Dynamic");
            else System.out.println("Not");

        }
    }

    // 알파벳의 개수를 체크한다. 채크해서 정수 배열을 반환한다.(정수 배열은 알파벳의 개수를 알아보는것.)
    static private int[] alphabeit(String str){
        int[] alpha = new int[26];
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(alpha[str.charAt(i) - 'a'] == 0) count++;
            alpha[str.charAt(i) - 'a']++;
        }
        int[] array = new int[count];
        int index = 0;
        for(int i = 0 ; i < alpha.length;i++){
            if(alpha[i] != 0){
                array[index++] = alpha[i];
            }
        }

        return array;
    }

    static boolean isPibo(int[] nums){
        boolean isPi
        if(nums.length <3) return true;
        else {
            if(nums.length >=4 && nums[3] != nums[2] + nums[1]){
                int tmp = nums[1];
                nums[1] = nums[0];
                nums[0] = tmp;
            }
             isPi = true;
            for(int i =2 ; i < nums.length ; i++){
                if(nums[i] != (nums[i-1] + nums[i-2])) {
                    isPi = false;
                    break;
                }
            }
        }

        return isPi;
    }
}
