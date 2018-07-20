package sorts;

public class SelectionSort extends Sort {

    /**
     * O(N2)
     *
     * Travers the array,
     * Set the min
     * Current value vs. min
     *
     * At the end of first loop, found the largest
     */

    public SelectionSort(int[] intArray) {
        super(intArray);
    }

    @Override
    public int[] algorithm() {

        for( int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex >0; lastUnsortedIndex-- ){
            int largest = 0;
            for( int i=1; i <= lastUnsortedIndex; i++ ){
                if( intArray[i] > intArray[largest]){
                    largest = i;
                }
             }
             swap(intArray, largest, lastUnsortedIndex);
    }
        return intArray;
    }


//    @Override
//    public void printArray(int[] intArray) {
//
//    }
}
