package sorts;

public class BubbleSort extends Sort {

    /**
     * O(N2)
     *
     * Traverse the array,
     * If array[i]>array[i+1]
     * Swap
     *
     * At the end of first loop, find the largest number
     * At the end of second loop, find the second largest number
     *
     * https://en.wikipedia.org/wiki/Bubble_sort
     */

    public BubbleSort(int[] intArray) {
        super(intArray);
    }

    @Override
    public int[] algorithm(){
        for(int unSortedIndex=intArray.length-1; unSortedIndex>0 ; unSortedIndex--){
            for(int i=0; i<unSortedIndex; i++){
                if(intArray[i] > intArray[i+1]){
                    swap(intArray, i, i+1);
                }
            }
        }
        return intArray;
    }
}
