package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfArrays {

    /**
     *  #350. Intersection of Two Arrays II
     *
     *  Given two arrays, write a function to compute their intersection.
     Example:
     Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
     */

    public static int[] intersection(int[] a, int[] b){

        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : a){
            map.put(i, 0);
        }
        for(int i: b){
            if(map.get(i) > 0)
                map.put(i , map.get(i)+1);
        }
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() > 0 )
                list.add(e.getKey());
        }
        int length = list.size();
        int[] result = new int[length];
        for(int i =0; i<length ;i++){
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3};
        int[] b = {3, 3};

        int[] result = (intersection(a, b));
        for(int i: result){
            System.out.print(i);
        }
    }
}
