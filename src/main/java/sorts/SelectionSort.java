package sorts;

public class SelectionSort extends Sort {

    /**
     * O(N2)
     *
     * Travers the array,
     * Find the larger one then swap
     *
     * At the end of first loop, found the largest, unsorted list shorts by 1
     * At the end of second loop, found the second largest, unsorted list shots by 1
     */

    public SelectionSort(int[] intArray){
        super(intArray);
    }

    @Override
    public int[] algorithm(){
        int len = intArray.length;
        for( int lastUnsortedIndex = len-1; lastUnsortedIndex >0; lastUnsortedIndex-- ){
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
}
