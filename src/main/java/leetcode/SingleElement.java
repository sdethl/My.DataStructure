package leetcode;

import java.util.*;

public class SingleElement {

    /**
     * leetcode #136. Single Number
     *
     * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
     Note:
     Your algorithm should have a linear runtime complexity.
     Could you implement it without using extra memory?
     Example 1:
     Input: [2,2,1]
     Output: 1
     Example 2:
     Input: [4,1,2,1,2]
     Output: 4
     */

    /**
     * first , we have to know the bitwise XOR in java
     0 ^ N = N
     N ^ N = 0
     So..... if N is the single number
     N1 ^ N1 ^ N2 ^ N2 ^..............^ Nx ^ Nx ^ N
     = (N1^N1) ^ (N2^N2) ^..............^ (Nx^Nx) ^ N
     = 0 ^ 0 ^ ..........^ 0 ^ N
     = N
     */
    public static int theNumber(int[] nums){
        int result = 0;
        for(int num : nums){
            result = result ^ num;
        }
        return result;
    }

    public static int theElement(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        //<value, count>
        for(int n : nums){
            if( map.containsKey(n)){
                map.put(n, map.get(n)+1);
            }
            else map.put(n, 1);
        }
        return getKeyFromValue(map, 1);
    }

    public static int[] theElements(int[] nums){

        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            if( map.containsKey(n)){
                map.put(n, map.get(n)+1);
            }
            else map.put(n, 1);
        }
        List<Integer> al = getKeysFromValue(map, 1);
        int[] result = new int[al.size()];
        for(int i=0; i<al.size(); i++){
            result[i] = al.get(i);
        }
        return result;
    }

    private static int getKeyFromValue(Map<Integer, Integer> m, int count){
        int result=0;
        for( int i : m.keySet()){
            if(m.get(i).equals(count)){
                result = i;
            }
        }
        return result;
    }

    private static List<Integer> getKeysFromValue(Map<Integer, Integer> m, int count){
        List<Integer> list = new ArrayList<>();
        for( int i : m.keySet()){
            if(m.get(i).equals(count)){
                list.add(i);
            }
        }
        return list;
    }

    private static List<Character> getKeysFromValueChar(Map<Character, Integer> map, int count){
        List<Character> result = new ArrayList<>();
        for(char c : map.keySet()){
            if(map.get(c).equals(count)){
                result.add(c);
            }
        }
        return result;
    }

    /**
     * #387. First Unique Character in a String
     *
     * Given a sb, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
     * Examples:
     s = "leetcode"
     return 0.
     s = "loveleetcode",
     return 2.
     */
     public static int theFirstUniqElement(String s){
         Map<Character, Integer> map = new LinkedHashMap<>();
         Set<Character> set = new HashSet<>();
         for (int i = 0; i < s.length(); i++) {
             if (set.contains(s.charAt(i))) {
                 if (map.get(s.charAt(i)) != null) {
                     map.remove(s.charAt(i));
                 }
             } else {
                 // value = index
                 map.put(s.charAt(i), i);
                 set.add(s.charAt(i));
             }
         }
         // is "map.size() == 0" true?
         // yes - return -1
         // no - return the first element of the map
         return map.size() == 0 ? -1 : map.entrySet().iterator().next().getValue();
     }

    /**
     * 287. Find the Duplicate Number
     *
     * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive),
     * prove that at least one duplicate number must exist.
     * Assume that there is only one duplicate number, find the duplicate one.
     * Example 1:
     Input: [1,3,4,2,2]
     Output: 2
     *
     * Note:
     You must not modify the array (assume the array is read only).
     You must use only constant, O(1) extra space.
     Your runtime complexity should be less than O(n2).
     There is only one duplicate number in the array, but it could be repeated more than once.
     */
    public static int findTheDup(int[] nums){
        int dup = -1;
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            if( set.contains(n)){
                dup = n;
            }
            else set.add(n);
        }
        return dup;
    }

    public static int[] removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int[] result = new int[set.size()];
        int i = 0;
        for(Integer val : set){
            result[i++] = val;
        }
        return result;
    }

    /**
     * # 215. Kth Largest Element in an Array
     *
     * Find the kth largest element in an unsorted array.
     * Example 1:
     Input: [3,2,1,5,6,4] and k = 2
     Output: 5
     */
    public static int findKthLargest(int[] nums, int k){
        int l = nums.length;
        if( k > l|| k ==0 ){
            throw new IllegalArgumentException();
        }else{
            Arrays.sort(nums);
        }
        return nums[l-k];
    }

    /**
     *  # 268. Missing Number
     *  Given an array containing n distinct numbers taken from 0, 1, 2, ..., n,
     *  find the one that is missing from the array.
     Example 1:
     Input: [3,0,1]
     Output: 2
     */
    public static int findMissingNum(int[] nums){
        int result = -1;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if( (nums[i+1] - nums[i]) > 1)
                result = nums[i] + 1;
            if(result != -1)
                break;
        }
        return result;
    }

    /**
     * Missing numbers from 2 arrays
     *  a1[n]:
     *  a2[n]: shuffle a1, and delete elements randomly
     *  find the missing number
     *
     *  algorithm:
     *  1. take care of the edge cases
     *  2. sort the arrays
     *  3. Loop each element for a1[] and a2[]
     *      a. compare a1[n] and a2[m]
     *      b. if the last element got deleted (a1.size > a2.size)
     *          return a[n]
     *      c. if (a[n] != a[m])
     *          return a[n]
     */
    public static int findMissingNumFrom2Arrays(int[] nums, int[] nums2){

        int size1 = nums.length;
        int size2 = nums2.length;
        if( size1 <= size2){
            return 0;
        }

        int result = 0;
        Arrays.sort(nums);
        Arrays.sort(nums2);
//        for(int i=0; i< size1 ; i++){
//            for(int j=0; j < size2; j++){
//                if ( nums[i] != nums2[j] || i>j){
//                   result = nums[i];
//                }
//            }
//        }

        return result;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        int[] nums2 = {1,4,5,2};
        //System.out.println(findMissingNum(nums));
        System.out.println(findMissingNumFrom2Arrays(nums, nums2));
    }
}
