package leetcode;

import java.util.ArrayList;
import java.util.Collections;


public class TwoSum {
    ArrayList<Integer> list = new ArrayList<>();

    TwoSum(){

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

    public String toString(){
        String result = "";
        for(int i : list){
            result = result + String.valueOf(i) + ",";
        }
        return result;
    }
}
