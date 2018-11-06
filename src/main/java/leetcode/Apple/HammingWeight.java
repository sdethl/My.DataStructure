package leetcode.Apple;

public class HammingWeight {

    public int findTotalOfOne(int n){
        int sum = 0;
        while( n != 0 ){
            sum++; //if n is not zero, then it has at least one '1'
            n = n & (n-1);
        }
        return sum;
    }
}
