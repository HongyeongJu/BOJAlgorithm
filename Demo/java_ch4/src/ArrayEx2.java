import java.util.*;

public class ArrayEx2 {
    public static void main(String[] args){
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = {100, 95, 80, 70, 60};
        char[] chArr = {'a', 'b', 'c', 'd'};

        for(int i = 0; i <iArr1.length; i++){
            iArr1[i] = i + 1;
        }

        for(int i = 0; i<iArr2.length; i++){
            iArr2[i] = (int)(Math.random() * 10) + 1; //1~10의 값을 배열에 저장
        }

        for(int i = 0 ; i < iArr3.length;i++){
            System.out.print(iArr1[i]+",");
        }

        System.out.println();
        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArr3);      //주소 출력
        System.out.println(chArr);      // 문자열 출력
    }
}
