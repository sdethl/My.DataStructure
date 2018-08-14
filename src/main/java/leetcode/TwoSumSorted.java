package leetcode;

import java.util.LinkedList;
public class TwoSumSorted {

    LinkedList<Integer> list = new LinkedList();

    //add to be a sorted list
    public void add(int num){
        if( list.isEmpty())
            list.add(num);
        else if( num < list.get(0)){
            list.addFirst(num);
        }else if( num > list.getLast()){
            list.addLast(num);
        }
    }
}
