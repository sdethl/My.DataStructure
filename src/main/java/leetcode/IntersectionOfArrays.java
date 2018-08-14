package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfArrays {

    /**
     *  # 349. Intersection of Two Arrays
     *  Given two arrays, write a function to compute their intersection.
     Example:
     Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
     Note:
     Each element in the result must be unique.
     The result can be in any order.
     */
//    public int[] intersection2(int[] a, int[] b){
//
//    }


    /**
     *  #350. Intersection of Two Arrays II
     * 交集
     *  Given two arrays, write a function to compute their intersection.
     Example:
     Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
     */

    public static int[] intersection(int[] a, int[] b){

        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : a){
            if( map.containsKey(i))
                map.put(i, map.get(i)+1);
            else map.put(i, 1);
        }

        for(int i: b){
            if( map.containsKey(i)  && map.get(i)>0 ){
                list.add(i);
                map.put(i , map.get(i)-1);
            }

        }
        int length = list.size();
        int[] result = new int[length];
        for(int i =0; i<length ;i++){
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3,1};
        int[] b = {1,3};

        int[] result = (intersection(a, b));
        for(int i: result){
            System.out.print(i + ",");
        }
    }
}
