import java.util.Arrays;

// 한개의 원소를 빼서 엄격하게 증가 배열이 된다면, 각각 한개씩 빼볼수 밖에 없다.
// 모듈을 만든다. (1. 한개의 원소를 추출하는 메소드 )
// (2. 한개의 원소를 추출한 배열을 정렬하는 메소드)
// 한개를 추출해도 같은 값이 있는게 있으면 안된다.!!
// psudocode
// for i  = 0 to n-1
// 원소 추출한 배열과 그 배열을 정렬한 배열 값이 서로 같다면. true
//
// 끝날때까지 없다면 false
public class Test {

    public static void main(String[] args){
        int[] array = new int[]{1, 2, 3, 4, 5, 3, 5, 6};

        System.out.println(Arrays.toString(array));
        int[] temp = extraction(array, 2);

        System.out.println(Arrays.toString(temp));

        System.out.println(Arrays.toString(sorting(temp)));
        System.out.println(Arrays.toString(temp));

        System.out.println(almostIncreasingSequence(array));
    }


    static boolean almostIncreasingSequence(int[] sequence) {

        for(int i = 0 ; i < sequence.length; i++){
            int[] a1 = extraction(sequence, i);
            int[] a2 = sorting(a1);

            if(same(a2)) return false;

            if(Arrays.equals(a1, a2)) return true;
        }

        return false;
    }
    //  한개의 원소를 추출하는 메소드
    static int[] extraction(int[] array, int index){
        int[] tmp = new int[array.length -1];
        for(int i= 0; i < tmp.length;i++){
            if(i < index) tmp[i] = array[i];
            else if(i >=index) tmp[i] =array[i+1];
        }
        return tmp;
    }

    static int[] sorting(int[] array1){
        int[] array;
        array = Arrays.copyOf(array1, array1.length);
        for(int i = 0 ; i < array.length -1; i++){
            int min = i;
            for(int j = i +1; j <array.length ;j++){
                if(array[min] > array[j]) min = j;
            }
            int tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;
        }

        return array;
    }
    // 추출하고 정렬했는데 같은 값이 나왔는지 확인하는 함수

    static boolean same(int[] array){
        for(int i = 0 ; i < array.length -1 ;i++){
            if(array[i] == array[i+1]) return true;
        }

        return false;
    }

}
