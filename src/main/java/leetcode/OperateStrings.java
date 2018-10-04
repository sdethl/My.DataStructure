package leetcode;

import java.util.HashMap;
import java.util.Map;

public class OperateStrings {

    /**
     * Given a string in the form of "AAABBBCCD"
     * compress it to become "A3B3C3D1"
     *
     * 1. Take care special cases
     * 2. initialize
     *      char[]
     *      StringBuilder
     *      HashMap
     * 3. Loop for each member:
     *      a. push a[i] into map
     *      b. if a[i] is new to the map, add to key, value =1
     *      c if a[i] exists, add to key, value+1
     * 4. output the elements to a string
     */
    public String compressString(String s){

        if (s == null){
            return "error!";
        }else if( s.length() == 1){
            return s + "1";
        }
        char[] letters = s.toCharArray();
        Map<Character, Integer> map = new HashMap();

        for(char letter : letters){
            if(map.containsKey(letter)){
                int value = map.get(letter) + 1;
                map.put(letter, value);
            }else{
                map.put(letter, 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            sb.append(entry.getKey());
            sb.append(entry.getValue());
        }
        return sb.toString();
    }
}
