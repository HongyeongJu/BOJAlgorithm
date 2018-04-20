public class SelectionSort {
    public static void main(String[] args){
        int[] a = new int[]{1,2,8,9,7,5,3,5,6,2};

        selectionSort(a);

        for(int i = 0; i < a.length; i++)
            System.out.print(a[i]);
    }

    private static void selectionSort(int[] array){
        int tmp;
        for(int i = 0; i < array.length -1;i++){
            int min = i;
            for(int j = i + 1; j <array.length; j++){
                if(array[min] > array[j]) min = j;
            }
            tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;
        }
    }
}
