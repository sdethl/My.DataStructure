package sorts;

public class MergeSort extends Sort {

    public MergeSort(int[] intArray) {
        super(intArray);
    }

    @Override
    int[] algorithm(int[] input, int start, int end) {
        if (end - start < 2) {
            return input;
        }

        int mid = (start + end) / 2;
        algorithm(input, start, mid);
        algorithm(input, mid, end);
        merge(input, start, mid, end);
        return input;
    }

    // { 20, 35, -15, 7, 55, 1, -22 }
    public static void merge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);


    }
}
