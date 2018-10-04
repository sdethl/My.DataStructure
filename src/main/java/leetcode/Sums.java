package leetcode;

import java.util.ArrayList;
import java.util.Collections;


public class Sums {
    ArrayList<Integer> list = new ArrayList<>();

    Sums(){

    }

    public void add(int num){
        list.add(num);
        Collections.sort(list);
    }

    public boolean find(int sum){
        for(Integer i : list){
            if( list.contains(sum - i))
                return true;
        }
        return false;
    }

    /**
     * Given an array of integers, positive and negative, write a program that can find
     * the largest continuous sum
     *
     * algorithm: (Dynamic Program)
     *
     * 1. Take care special cases
     *
     * 2. initialize:
     *  largestSum = a[0];
     *  tempSum = a[0];
     *
     * 3. Loop for each element:
     *      a. tempSum = tempSum + a[i]
     *      b. if tempSum > largestSum
     *              largestSum = tempSum
     *         return largestSum
     */

    public int largestSum(int[] numbers){
        int end = numbers.length;
        if(end == 0){
            return 0;
        }
        if(end == 1){
            return  numbers[0];
        }
        int largestSum = numbers[0];
        int tempSum = numbers[0];
        for(int i=1; i<end; i++){
            System.out.println("loop " + i);

            tempSum = Math.max(numbers[i], tempSum + numbers[i]);
            System.out.println(" tempsum: " + tempSum);
            largestSum = Math.max(tempSum, largestSum);
            System.out.println(" largest sum: " + largestSum);
        }
        return  largestSum;
    }

    public String toString(){
        String result = "";
        for(int i : list){
            result = result + String.valueOf(i) + ",";
        }
        return result;
    }
}
