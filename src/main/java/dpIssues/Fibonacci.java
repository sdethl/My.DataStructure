package dpIssues;


import java.util.HashMap;
import java.util.Map;

/**
 * Fibonacci sequence: 0 1 1 2 3 5 8 13 21 34
 *
 * F numbers are defined by the recurrence relation
 * F(N) = F(N-1) + F(N-2)
 * F(0) = 0
 * F(1) = 1
 *
 */
public class Fibonacci {

    // time complexity O(2^n)
    public int recursiveFibonacci(int n){
        if( n == 0) return 0;
        if( n == 1 ) return 1;
        return recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
    }

    //time complexity O(N)
    public int dpFibonacci(int n){
        Map<Integer, Integer> memoizeTable = new HashMap<>();
        memoizeTable.put(0, 0);
        memoizeTable.put(1, 1);
        if(memoizeTable.containsKey(n))
            return memoizeTable.get(n);
        memoizeTable.put(n-1, dpFibonacci(n-1));
        memoizeTable.put(n-2, dpFibonacci(n-2));
        int calculatedNumber = memoizeTable.get(n-1) + memoizeTable.get(n-2);
        memoizeTable.put(n, calculatedNumber);
        return calculatedNumber;
    }

    //bottom-up: tabulation
    public int dpFibonacci2(int n){
        int[] f = new int[n+2];
        f[0] = 0;
        f[1] = 1;

        for(int i=2; i<=n; i++){
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }
}
