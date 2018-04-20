/*
백준 2751 제목: 수 정렬하기 2 날짜 : 18.4.17
난이도 : 3
분류 : 퀵정렬
정렬해야되는 수개수가 1000000정도이므로. 보통 선택 정렬이나 버블 정렬을 이용하면 안된다. (합병정렬)을 이용
 */

import java.util.Arrays;
import java.util.Scanner;

public class Back2751 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        final int t= scanner.nextInt();
        int[] array = new int[t];
        for(int i = 0; i < t; i++){
            array[i] = scanner.nextInt();
        }

        quickSort(array, 0, array.length -1);

        for(int i = 0 ; i < t; i++){
            System.out.println(array[i]);
        }
    }

    static void quickSort(int[] arr, int left, int right) {
        int i, j, pivot, tmp;
        if (left < right) {
            i = left;   j = right;
            pivot = arr[left];
            //분할 과정
            while (i < j) {
                while (arr[j] > pivot) j--;
                // 이 부분에서 arr[j-1]에 접근해서 익셉션 발생가능함
                while (i < j && arr[i] <= pivot) i++;

                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
            arr[left] = arr[i];
            arr[i] = pivot;
            //정렬 과정
            quickSort(arr, left, i - 1);
            quickSort(arr, i + 1, right);
        }
    }
}
