package common;

public class Util {

    public static void swap(int[] array, int i, int j){
        if( i== j ){
            return;
        }
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
