package dpIssues;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testFibonacci {
    Fibonacci f = new Fibonacci();
    static final int num = 6;

    @Test(dataProvider = "f numbers")
    public void testDp(int n){
        System.out.println("F number is: " + f.dpFibonacci2(num));
    }

    @Test(dataProvider = "f numbers")
    public void testRecursive(int n){
        System.out.println("F number is: " + f.recursiveFibonacci(n));
    }

    @Test
    public void testDp2(){
        System.out.println("F number is: " + f.dpFibonacci2(num));
    }

    @DataProvider(name = "f numbers")
    public static Object[][] testData(){
        return new Object[][]{
                {1},
                {8},
                {15},
                {20},
                {30}
        };
    }

    @Test
    public void testFor(){
        for(int i =0; i<5; i++){
            System.out.println("for 1: " + i);
        }

        for(int i=0; i<5; ++i){
            System.out.println("for 2: " + i);
        }
    }
}
