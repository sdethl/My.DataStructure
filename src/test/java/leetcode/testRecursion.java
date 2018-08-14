package leetcode;

import org.junit.Test;


public class testRecursion {

    @Test
    public void testCase_1(){
        Recursion r = new Recursion();
        r.numberToWords(123);
        r.numberToWords(2);
        r.numberToWords(700);
        r.numberToWords(23);
    }

    @Test
    public void testCase_2(){
        Recursion r = new Recursion();
        r.numberToWords(12345);
    }

    @Test
    public void testCase_7(){
        Recursion r = new Recursion();
        r.numberToWords(12);

    }

    @Test
    public void testCase_3(){
        Recursion r = new Recursion();
        r.numberToWords(93);

    }
    @Test
    public void testCase_4(){
        Recursion r = new Recursion();
        r.numberToWords(123);
    }

    @Test
    public void testCase_6(){
        Recursion r = new Recursion();
        r.numberToWords(900);

    }

    @Test
    public void testCase_5(){
        Recursion r = new Recursion();
        r.numberToWords(200401);

    }

    @Test
    public void testCase_8(){
        Recursion r = new Recursion();
        r.numberToWords(6000000);

    }
    @Test
    public void testCase_9(){
        Recursion r = new Recursion();
        r.numberToWords(1234567891);
        System.out.println(123/10);
        System.out.println(Integer.MAX_VALUE);//2147483647
        System.out.println(Integer.MIN_VALUE); //-2147483648

    }

}
