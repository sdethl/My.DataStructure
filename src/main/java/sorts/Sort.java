package sorts;

public abstract class Sort {

    protected int[] intArray;

    Sort(int[] intArray){
        this.intArray = intArray;
//        printArray("original array");
//        System.out.println("");
    }

    int[] algorithm(){
        return intArray;
    }
    int[] algorithm(int[] intArray, int start, int end){ return  intArray;}

    void printArray(String arrayName){
        System.out.println(arrayName);
        for(int number : intArray){
            System.out.print( number + ", ");
        }
        System.out.println("");
    }

    public void swap(int[] array, int i, int j){
        if( i== j ){
            return;
        }
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
