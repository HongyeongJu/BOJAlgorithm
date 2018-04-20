import java.util.Scanner;

public class Back2607 {
    public static void main(String[] args){
        int count;
        int[] first = new int[26];
        int[] con;            // 알파벳 개수 대조군
        int numCnt = 0;
        String[] ches = new String[101];        // 1~100까지
        Scanner scanner =  new Scanner(System.in);
        count = scanner.nextInt();
        // 단어 입력
        scanner.nextLine();
        for(int i = 1 ; i <= count; i++){
            ches[i] = scanner.nextLine();
        }
        //첫번째 단어의 알파벳 개수 셈하기
        for(int i = 0; i < ches[1].length() ;i++){
            first[ches[1].charAt(i) - 'A']++;
        }

        // 대조군 과 알파벳 개수 비교하기.

        for(int i = 2; i<=count; i++){
            //대조군 초기화하기
            con = new int[26];

            //대조군 알파벳 개수 셈하기
            for(int j = 0; j < ches[i].length(); j++){
                con[ches[i].charAt(j) -'A']++;
            }

            // 대조군과 원본 비교하기
            if(checkNum(first, con)) numCnt++;
        }

        System.out.println(numCnt);
    }

    static boolean checkNum(int[] first, int[] con){
        int count =0;
        for(int i =0; i< 26; i++){
            if(first[i] != con[i]){     // 개수가 다르면
                if(Math.abs(first[i] - con[i]) >= 2) return false;          // 만일 차이가 2이상나면 false 출력
                count++;        // 1이면 count 증가
            }
        }

        if(count <= 1) return true;
        else return false;
    }
}
