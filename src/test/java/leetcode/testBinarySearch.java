package leetcode;

import org.testng.annotations.Test;
import search.BinarySearch;

import static org.testng.AssertJUnit.assertEquals;

public class testBinarySearch {

    BinarySearch bs = new BinarySearch();

    @Test
    public void testCase_1(){
        int[] nums = {2,4,6,8,9};
        int start = 0;
        int end = nums.length;
        int value = 8;
        int result = bs.recursiveBinarySearch(nums, start, end, value);
        System.out.println(result);
        assertEquals(3, result);
    }

    @Test
    public void testCase_2(){
        int[] nums = {2,4,6,8,9,10};
        int start = 0;
        int end = nums.length;
        int value = 8;
        int result = bs.recursiveBinarySearch(nums, start, end, value);
        System.out.println(result);
        assertEquals(3, result);
    }

    @Test
    public void testCase_3(){
        int[] nums = {2,4,6,8,9,10};
        int start = 0;
        int end = nums.length;
        int value = 8;
        int result = bs.iterativeBinarySearch(nums, start, end, value);
        System.out.println(result);
        assertEquals(3, result);
    }

    @Test
    public void testCase_4(){
        int[] nums = {2,4,6,8,9,10,11};
        int start = 0;
        int end = nums.length;
        int value = 8;
        int result = bs.iterativeBinarySearch(nums, start, end, value);
        System.out.println(result);
        assertEquals(3, result);
    }
}
