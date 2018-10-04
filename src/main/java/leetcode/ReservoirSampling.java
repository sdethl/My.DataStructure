package leetcode;

import java.util.Random;

public class ReservoirSampling {

    public int[] ramdonNumbers(int[] numbers, int k){
        int[] reservoir = new int[k];
        Random random = new Random();
        for(int i=0; i<reservoir.length; i++){
            reservoir[i] = numbers[k];
        }
        //The i-th item is chosen to be included in the reservoir with probability k/i
        for(int i=k+1; i<numbers.length; i++){
            int j = random.nextInt(i)+1;
            if( j<k ) reservoir[j] = numbers[i];
        }
        return reservoir;
    }
}
