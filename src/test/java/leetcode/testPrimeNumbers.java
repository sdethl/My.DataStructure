package leetcode;

import org.junit.Test;

public class testPrimeNumbers {

    @Test
    public void testCase_1(){
        in1 inter = new PrimeNumbers();
        inter.primeNumbers(0);
        inter.primeNumbers(1);
        inter.primeNumbers(2);
        inter.primeNumbers(15);
        inter.primeNumbers(20);
        inter.primeNumbers(155);
    }
}
