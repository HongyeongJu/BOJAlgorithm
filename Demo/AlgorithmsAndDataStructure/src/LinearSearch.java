public class LinearSearch {

    public static void main(String[] args){
        int[] array = new int[]{1, 5,7, 8, 9, 2,6, 4};

        System.out.println(linearSearch(2, array));
        System.out.println(linearSearch(22, array));
    }

    static int linearSearch(int x, int[] array){
        for(int i = 0; i < array.length; i++){
            if(x == array[i]) return i;
        }
        return -1;
    }
}
