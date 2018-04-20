public class MergeSort {

    static void merge(int[] array, int p, int r){
        if(p <r) {
            int mid = (p + r) / 2;
            merge(array, p, mid);
            merge(array, mid + 1, r);
            mergeArray(array, p, mid, r);
        }
    }

    static void mergeArray(int[] array, int p, int q, int r){
        int[] newArray= new int[array.length];
        int i =p;
        int j = q+ 1;
        int t = p;

        while(i<=q && j<=r){
            if(array[i] <= array[j]){
                newArray[t] = array[i];
                t++;
                i++;
            }
            else if(array[i] > array[j]){
                newArray[t] = array[j];
                t++;
                j++;
            }
        }

        while(i <= q){
            newArray[t] = array[i];
            t++;
            i++;
        }
        while(j <= r){
            newArray[t] = array[j];
            t++;
            j++;
        }
        i =p;
        while(i <= r){
            array[i] = newArray[i];
            i++;
        }
    }
}
