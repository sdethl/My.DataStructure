package leetcode.Apple;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FirstUniqueChar {

    // #387 find the first unique letter and return index
    //O(n^2)
    public int firstUnique(String s){
        char[] chars = s.toCharArray();
        for(int i=0; i<s.length()-1; i++){
            for(int j=1; j<s.length();j++){
                if( chars[i] != chars[j]){
                    return i;
                }
            }
        }
        return -1;
    }

    //O(n^2)
    public int firstUnique2(String s){
        for(int i=0; i<s.length(); i++){
            if(s.indexOf(s.charAt(i)) != s.lastIndexOf(s.charAt(i))){
                return i;
            }
        }
        return -1;
    }

    //O(n)
    //Since order matters, so use LinkedList
    public int firstUnique3(String s){
        int len =s.length();
        if( len == 1){
            return 0;
        }
        List counter = new LinkedList(); //for index
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i< len; i++){
            char current = s.charAt(i);
            if( !map.containsKey(current)){
                map.put(current, i);
                counter.add(i);
            }else{
                counter.remove(map.get(current));
            }
        }
        return  counter.isEmpty() ? -1 : (int)counter.get(0);
    }
}
