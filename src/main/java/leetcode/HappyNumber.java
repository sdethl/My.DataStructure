package leetcode;

import datastructure.LinkedList.LinkedList;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {


    /**
     * # 202. find the happy number
     *
     *  if it's not a happy number, it must have a loop
     *  16 is not a happy number,
     *
     * 1² + 6² => 1 + 36 => 37
     * 3² + 7² => 9 + 49 => 58
     * 5² + 8² => 25 +64 => 89
     * 8² + 9² => 64 + 81 => 145
     * 1² + 4² + 5² => 1+16+25 => 42
     * 4² + 2² => 16 +4 => 20
     * 2² + 0² => 4 +0 => 4
     * 4² => 16 (the cycle repeats again).
     *
     * Follow up: Happy Prime number
     */

    //Recursion wont work
//    public boolean isHappy(int x){
//        int sum = sumOfNumSquare(x);
//        if( sum == 1){
//            return true;
//        }else{
//            isHappy(sum);
//        }
//        return false;
//    }

    public boolean isHappyNumber(int n){
        Set<Integer> set= new HashSet<>();
        while(!set.contains(n)) {
            if(n == 1)
                return true;
            set.add(n);
            n = sumOfNumSquare(n);
        }
        return false;
    }

    private int sumOfNumSquare(int num){

        int sum = 0;

        // 232 => 2^2 + 3^2 + 2^2 = 17
        // return sum = 17
        while( num > 0 ){
            int digit = num % 10;
            sum = sum + digit * digit;
            num = num/10;
        }
        return sum;
    }

    public boolean hasLoop(LinkedList list){
        return true;
    }
}
