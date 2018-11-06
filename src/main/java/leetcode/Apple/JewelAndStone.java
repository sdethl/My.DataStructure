package leetcode.Apple;

import java.util.HashSet;
import java.util.Set;

public class JewelAndStone {

    //O(J*S)
    public int findNumOfJewl(String J, String S){

        int lengthJ = J.length();
        int lengthS = S.length();
        int counter = 0;
        if( lengthJ == lengthS && lengthJ ==0){
            return counter;
        }

        for(int i=0; i < lengthJ; i++){
            for(int j=0; j< lengthS; j++){
                if( J.charAt(i) == S.charAt(j)){
                    counter++;
                }
            }
        }
        return counter;
    }

    //O(J+S)
    public int findNumOfJewl2(String J, String S){
        int counter = 0;
        Set<Character> jewelSet = new HashSet();
        for(char c : J.toCharArray()){
            jewelSet.add(c);
        }

        for(char c: S.toCharArray()){
            if(jewelSet.contains(c)){
                counter++;
            }
        }
        return counter;
    }
}
