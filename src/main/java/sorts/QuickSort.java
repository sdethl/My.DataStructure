package sorts;

public class QuickSort extends Sort {

    QuickSort(int[] intArray) {
        super(intArray);
    }

    /**
     * Algorithm
     * 1. Uses a pivot element to partition the array into 2 parts
     * 2. Elements < pivot to the left, elements > pivot to the right
     * 3. pivot then will be the correct sorted position
     * 4. Process now is repeated for the left side and right side
     * 5. Eventually, every element has been pivot, so every element is in the correct sorted position
     **/

    int[] algorithm(int[] a, int start, int end) {
        if( end - start < 2 ){
            return a;
        }
        int pivotIndex = partition(a, start, end);
        algorithm(a, start, pivotIndex-1);
        algorithm(a, pivotIndex+1, end);
//        System.out.print("sorted: ");
//        for(int i : a){
//            System.out.print( i + "," );
//        }
        return a;
    }

    //Find the correct sorted position for the pivot element
    int partition(int[] input, int start, int end){
        // Save the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {
            // NOTE: empty loop body
            while (i < j && input[--j] >= pivot);
            if (i < j) {
                //to the left of pivot
                input[i] = input[j];
            }
            // NOTE: empty loop body
            while (i < j && input[++i] <= pivot);
            if (i < j) {
                //to the right of pivot
                input[j] = input[i];
            }
        }
        //put the pivot to correct position
        input[j] = pivot;
        return j;
    }

}
