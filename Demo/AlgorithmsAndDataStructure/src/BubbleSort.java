public class BubbleSort {
    public static void main(String[] args){
        int[] array = new int[]{1, 5, 6,3,2,4,8,9,0};

        System.out.println(java.util.Arrays.toString(array));
        bubbleSort(array);
        System.out.println(java.util.Arrays.toString(array));

        array = new int[]{1, 5, 6,3,2,4,8,9,0};

        System.out.println(java.util.Arrays.toString(array));
        bubbleSort2(array);
        System.out.println(java.util.Arrays.toString(array));
    }

    static void bubbleSort(int[] array){
        for(int i = 0 ;i < array.length - 1; i++){
            for(int j = 0; j < array.length - 1 ;j++){
                if(array[j] > array[j+1]){
                    int tmp =  array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    static void bubbleSort2(int[] array){
        int n = array.length;
        boolean swapped;
        do{
            swapped = false;
            for(int i = 0; i<n-1; i++) {
                if(array[i]>array[i+1])
                {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swapped = true;
                }
            }
        }while(swapped == true);
    }
}
