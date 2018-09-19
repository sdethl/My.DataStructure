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
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < len; firstUnsortedIndex++){
            int toBeInsertedElement = intArray[firstUnsortedIndex];
            int i;
            //shifting: compare from right to left
            for( i=firstUnsortedIndex; i>0 && intArray[i-1] > toBeInsertedElement; i--){
                //shifting values, move [i-1] to [i]
                intArray[i] = intArray[i-1];
            }
            //insert
            intArray[i] = toBeInsertedElement;
        }
        return intArray;
    }
}
