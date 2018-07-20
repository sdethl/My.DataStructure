package sorts;

public class InsertSort extends Sort {


    public InsertSort(int[] intArray) {
        super(intArray);
    }

    @Override
    int[] algorithm() {

        int length = intArray.length;

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < length; firstUnsortedIndex++){
            int newElement = intArray[firstUnsortedIndex];
            int i;
            //compare from right to left
            for( i=firstUnsortedIndex; i>0 && intArray[i-1] > newElement; i--){
                    //shifting values
                    intArray[i] = intArray[i-1];

            }
            //insert
            intArray[i] = newElement;
        }
        return intArray;
    }
}
