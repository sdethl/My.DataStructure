package sorts;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class runSorts {

    int[] numbers = arrayGenerator(50, -100,100);

    @Test
    public void testBubbleSort(){
        BubbleSort bs = new BubbleSort(numbers);
        bs.algorithm();
        bs.printArray("Bubble sorted: ");
    }

    @Test
    public void testSelectionSort(){
        SelectionSort ss = new SelectionSort(numbers);
        ss.algorithm();
        ss.printArray("Selection sorted: ");
    }

    @Test
    public void testInsertSort(){
        InsertSort is = new InsertSort(numbers);
        is.algorithm();
        is.printArray("Insert sorted: ");
    }

    @Test
    public void test(){
        List<Integer> l = new ArrayList();
        for(int i =0 ; i<numbers.length; i++){
            l.add(numbers[i]);
        }
        for(int n : l){
            System.out.print(n + " ,");
        }
    }

    private int[] arrayGenerator(int lengthOfArray, int min, int max){
        int[] array = new int[lengthOfArray];
        Random r = new Random();
        for(int i=0; i<lengthOfArray; i++){
            array[i] = r.nextInt((max - min)+1) + min;
        }
        return array;
    }
}
