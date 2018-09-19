package sorts;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class runSorts {

    int[] numbers = arrayGenerator(20000, -10000,10000);

    @Test
    public void testBubbleSort(){
        Sort bs = new BubbleSort(numbers);
        bs.algorithm();
        //bs.printArray("Bubble sorted: ");
    }

    @Test
    public void testSelectionSort(){
        Sort ss = new SelectionSort(numbers);
        ss.algorithm();
        //ss.printArray("Selection sorted: ");
    }

    @Test
    public void testInsertionSort(){
        Sort is = new InsertionSort(numbers);
        is.algorithm();
       //is.printArray("Insert sorted: ");
    }

    @Test
    public void testQuickSort(){
        int len = numbers.length;
        Sort a = new QuickSort(numbers);
        a.algorithm(numbers, 0, len);
        //a.printArray("Quick sorted: ");
    }

    @Test
    public void testJDKSort(){
        Arrays.sort(numbers);
//        System.out.println("JDK dual-pivot quick sort: ");
//        for(int i : numbers){
//            System.out.print( i + ",");
//        }
    }

    @Test
    public void testJDKParallelSort(){
        Arrays.parallelSort(numbers);
//        System.out.println("JDK dual-pivot quick sort: ");
//        for(int i : numbers){
//            System.out.print( i + ",");
//        }
    }

    @Test
    public void testMergeSort(){
        Sort s = new MergeSort(numbers);
        s.algorithm(numbers, 0, numbers.length);
        //s.printArray("Merged Sorted: ");
    }

    private static int[] arrayGenerator(int lengthOfArray, int min, int max){
        int[] array = new int[lengthOfArray];
        Random r = new Random();
        for(int i=0; i<lengthOfArray; i++){
            array[i] = r.nextInt((max - min)+1) + min;
        }
//        System.out.println("Original array: ");
//        for(int i : array){
//            System.out.print(i + ",");
//        }
        return array;
    }
}
