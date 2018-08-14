package basics;

import java.util.ArrayList;
import java.util.Arrays;

public class Conversions {

    public static String intToString(int nums){
        String s = String.valueOf(nums);
        return s;
    }

    public static String arrayToString(String[] strings){
        String str = Arrays.toString(strings);
        return str;
    }

    public static String arrayToString(int[] nums){
        String str = Arrays.toString(nums);
        return str;
    }

    public static String arrayToString(char[] chars){
        String str = Arrays.toString(chars);
        return str;
    }

    public static String arrayListToString(ArrayList<String> strs){
        String str = strs.toString();
        return str;
    }

    public static String stringBuilderToString(StringBuilder sb){
        String str = sb.toString();
        return str;
    }

    public static void main(String[] args){

       String[] strs = {"a", "b", "c"};
       int[] numbers = {1,2,3};
       char[] chars = {'a','b','c'};
       ArrayList<String> list = new ArrayList();
       list.add("list1");
       list.add("list2");
       list.add("list3");
       StringBuilder sb = new StringBuilder();
       sb.append("a");
       sb.append("b");
       sb.append("c");

       System.out.println(intToString(5));
       System.out.println(arrayToString(numbers));
       System.out.println(arrayToString(strs));
       System.out.println(arrayToString(chars));
       System.out.println(arrayListToString(list));
       System.out.println(stringBuilderToString(sb));
    }
}
