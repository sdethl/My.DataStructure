package leetcode;

public class testClass implements in1 {

    /**
     * Output:
     Print total number of prime numbers between 2 and the given number ( including them ).
     */
    @Override
    public void primeNumbers(int p) {
        int counter = 0;
        for(int i=1; i <= p ; i++ ){
            if ( isPrime(i) ) {
                System.out.println(i);
                counter++;
            }
        }
        System.out.println("total of prime numbers for " + p + " is: " + counter);
    }

    private boolean isPrime(int num){
        boolean result = true;
        if( num == 1){
            result = false;
        }else if( num == 2){
            result = true;
        }else if( num%2 == 0){
            result = false;
        }else {
            for(int i=3; i<num; i+=2){
                if(num%i == 0){
                    result = false;
                }
            }
        }
        return result;
    }
}
