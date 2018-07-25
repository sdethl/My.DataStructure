package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    /**
     * 412. Fizz Buzz
     * Write a program that outputs the string representation of numbers from 1 to n.
     But for multiples of three it should output “Fizz” instead of the number
     and for the multiples of five output “Buzz”.
     For numbers which are multiples of both three and five output “FizzBuzz”.
     */

    public static List<String> printFB(int n){
        List<String> result = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if( i%3==0 && i%5==0 ){
                result.add("FizzBuzz");
            }else if( i%3==0){
                result.add("Fizz");
            }else if( i%5==0){
                result.add("Buzz");
            }else result.add(Integer.toString(i));
        }
        for(String str: result){
            System.out.print(str + ",");
        }
        return result;
    }

//    public static List<String> printFB2(int n){
//        List<String> result = new ArrayList<>();
//        for(int i=1; i<=n; i++){
//            if( i%3==0 && i%5==0 ){
//                result.addFront("FizzBuzz");
//            }
//            if( i%3==0){
//                result.addFront("Fizz");
//            }
//            if( i%5==0){
//                result.addFront("Buzz");
//            }
//            else result.addFront(String.valueOf(i));
//        }
//        for(String str: result){
//            System.out.print(str + ",");
//        }
//        return result;
//    }

    public static void main(String[] args){
        printFB(15);
    }
}
