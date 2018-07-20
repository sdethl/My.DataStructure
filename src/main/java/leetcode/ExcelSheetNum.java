package leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExcelSheetNum {

    /**
     * # 171. Excel Sheet Column Number
     *
     * 26进制
     * This is a wrong method, since column name could be more than 2 letters
     */
    public static int returnNum(String s){
        int result;
        char[] c = s.toCharArray();
        int length = c.length;
        Map<Character, Integer> map = new LinkedHashMap<>();
        map.put('A', 1);
        map.put('B', 2);
        map.put('C', 3);
        map.put('D', 4);
        map.put('E', 5);
        map.put('F', 6);
        map.put('G', 7);
        map.put('H', 8);
        map.put('I', 9);
        map.put('J', 10);
        map.put('K', 11);
        map.put('L', 12);
        map.put('M', 13);
        map.put('N', 14);
        map.put('O', 15);
        map.put('P', 16);
        map.put('Q', 17);
        map.put('R', 18);
        map.put('S', 19);
        map.put('T', 20);
        map.put('U', 21);
        map.put('V', 22);
        map.put('W', 23);
        map.put('X', 24);
        map.put('Y', 25);
        map.put('Z', 26);
        if( length == 1){
            result = map.get(c[0]);
        }else{
            result = map.get(c[0])*26 + map.get(c[1]);
        }
        return result;
    }

    /**
     *Integers are base 10 numbers calculated as:
     321 = 3 * (10^2) + 2 * (10^1) + 1 * (10^0)
     An excel sheet column number(replace alphabets with corresponding number) is a base 26 number:
     CBA = C * (26^2) + B * (26^1) + A * (26^0)
     where C = 3, B = 2 & A = 1
     */
    public static int titleToNumber(String s) {
        double sum = 0;
        int len = s.length();
        for(int i = len - 1;i > -1;i--){
            sum += Math.pow(26, len - (i + 1)) * (s.charAt(i) - 'A' + 1) ;
        }
        return (int)sum;
    }

    public static void main(String[] args){
        System.out.print(titleToNumber("AAA"));
    }
}
