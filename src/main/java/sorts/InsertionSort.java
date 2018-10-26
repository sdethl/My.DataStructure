package sorts;

public class InsertionSort extends Sort {

    /***
     * 1. the first element a[0] is the sorted one
     * 2. toBeInsertedE = a[i] compares to each of the sorted elements from right to left
     *      if a[i] < a[j] shift
     * 4. if a[j] < a[i] insert
     */

    public InsertionSort(int[] intArray) {
        super(intArray);
    }

    @Override
    int[] algorithm(){

        int len = intArray.length;
        for(int i = 1; i < len; i++){
            int toBeInsertedElement = intArray[i];
            int j = i-1;
            while( j>=0 && intArray[j] > toBeInsertedElement){
                intArray[j+1] = intArray[j];
                j--;
            }
            intArray[j+1] = toBeInsertedElement;
        }
        return intArray;
    }
}
