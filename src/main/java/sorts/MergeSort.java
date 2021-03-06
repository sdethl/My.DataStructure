package sorts;

public class MergeSort extends Sort {

    /**
     * Summary:
     *
     * Split to unsorted arrays;
     * Merge into sorted arrays;
     *
     * Time complexity: O(nlogn)
     *
     * 1. Divide the array into 2 arrays, which are unsorted.
     * The first array is the left array, the second array is the right array
     * 2. Split the left and right array again
     * 3. Keep splitting until all the arrays have only one element each
     *
     * 4. Merge every left/right pair of sibling arrays into a sorted array
     * 5. After the first merge, we will have a bunch of 2-element sorted arrays
     * 6. Then merge those sorted arrays(left/right siblings) to end up with a bunch of 4-element sorted arrays
     * 7. Repeat until you have a single sorted array

     */
    public MergeSort(int[] intArray) {
        super(intArray);
    }

    @Override
    int[] algorithm(int[] input, int start, int end) {
        if (end <= start) {
            return input;
        } // we are done traversing the array
        int mid = (start + end) / 2;
        algorithm(input, start, mid);
        algorithm(input, mid+1, end);
        merge(input, start, mid, end);
        return input;
    }

    /**
     * 1. Merge sibling left/right
     * 2. Create a temp[end]
     * 3. set i=first element of first array, j=first element of second array
     * 4. if firstArray[i] < secondArray[j], temp[n]=firstArray[i], i++
     *    if firstArray[i] > secondArray[j], temp[n]=firstArray[j], j++
     * 5. repeat until all elements have been processed
     * 6. Copy this temp[] back to original array in correct position
     * 7.
     */
    private void merge(int[] input, int start, int mid, int end) {
        if (input[mid - 1] <= input[mid]) {
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start + 1];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }

    private void merge2(int[] input, int start, int mid, int end){

        int[] tempArray = new int[end-start+1];

        int leftSlot = start;
        int rightSlot = mid+1;
        int k =0;

        while( leftSlot <= mid && rightSlot >= end){
            if( input[leftSlot] < input[rightSlot] ){
                tempArray[k] = input[leftSlot];
                leftSlot++;
            }else {
                tempArray[k] = input[rightSlot];
                rightSlot++;
            }
            k++;
        }// When you get here, both the left and right parts are sorted

        for( int i=0; i<tempArray.length; i++){
            input[start+i] = tempArray[i];
        }
    }

    private void mergeInPlace(int[] input, int start, int mid, int end){

    }
}
