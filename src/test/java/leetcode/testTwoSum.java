package leetcode;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class testTwoSum {

    TwoNumbers t = new TwoNumbers();

    @Test(dataProvider = "test data")
    public void testCase_1(int[] nums, int target, int[] expected){
        int[] result = t.twoSum(nums, target);
        assertArrayEquals(expected, result);
        Arrays.stream(result).forEach(num -> System.out.print(num + " , "));
        System.out.println(" ");
    }

    @Test(dataProvider = "test data")
    public void testCase_2(int[] nums, int target, int[] expected){
        int[] result = t.twoSumMap(nums, target);
        assertArrayEquals(expected, result);
        for(int i:result){
            System.out.print(i + ",");
        }
        System.out.println(" ");
    }

    @Test(dataProvider = "sorted data")
    public void testCase_3(int[] nums, int target, int[] expected){
        int[] result = t.twoSumSorted(nums,target);
        assertArrayEquals(expected, result);
        for(int i: result){
            System.out.print(i + ",");
        }
        System.out.println(" ");
    }

    @Test(dataProvider = "sorted data")
    public void testCase_4(int[] nums, int target, int[] expected){
        int[] result = t.twoSumSortedBinarySearch(nums,target);
        assertArrayEquals(expected, result);
        for(int i: result){
            System.out.print(i + ",");
        }
        System.out.println(" ");
    }

    @DataProvider(name = "test data")
    public static Object[][] testData(){
        return new Object[][] {
            //{nums, target, expected}

            // Normal cases
            {new int[]{1,3,4,6}, 5, new int[]{0,2}}, // even number of elements
            {new int[]{0,2,4}, 4, new int[]{0,2}}, // odd number of elements
            {new int[]{1,2,3,4,5,6}, 11, new int[]{4,5}},
            {new int[]{1,-2,-5,4,5,6}, 0, new int[]{2,4}}, // negative numbers
            {new int[]{1900,-2,-500,4,-1500,610}, -2000, new int[]{2,4}}, // negative numbers

            {new int[]{2,3}, 5, new int[]{0,1}}, // input is a very small array with 2
            {new int[]{123}, 123, new int[]{0}}, //input is a very small array with 1

            {new int[]{1,2,4,1}, 4, new int[]{}}, //No results were found
            {new int[]{}, 4, new int[]{}}, //Illegal input


        };
    }

    @DataProvider(name = "sorted data")
    public static Object[][] testData2(){
        return new Object[][]{
           {new int[]{1,2,3,6,9}, 8, new int[]{1,3}},
           {new int[]{3,6}, 9, new int[]{0,1}},
           {new int[]{-5,-2,0,6,10}, 4, new int[]{1,3}},
        };
    }

    @Test
    public void testTwoSum(){
        Sums ts = new Sums();
        ts.add(3);
        ts.add(99);
        ts.add(8);
        System.out.println(ts.toString());

        System.out.println(ts.find(7));
        System.out.println(ts.find(10));
    }

    @Test
    public void testLargestSum(){
        int[] nums = {100,-10,20,-10,3};
        Sums s = new Sums();
        System.out.println(s.largestSum(nums));
    }


}
