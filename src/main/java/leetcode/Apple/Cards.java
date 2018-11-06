package leetcode.Apple;

import java.util.Random;

public class Cards {

    private int[] cards;
    private int[] copyOfCards;
    private int totalCards;

    public Cards(int totalCards){
        this.totalCards = totalCards;
        this.cards = new int[totalCards];
        for(int i =0; i<totalCards; i++){
            cards[i] = i+1;
        }
        this.copyOfCards = cards;
    }

    //O(n)
    public int[] shuffledCards(){

        for(int i =0; i<totalCards; i++){
            int index = generateRandom(i,totalCards);
            System.out.println("x: " + i + "y: " + index);
            if( i == index){
                continue;
            }
            swap(cards[i], cards[index]);
        }
        return cards;
    }

    public int[] resetCardOrders(){
        return copyOfCards;
    }

    public void printCards(int[] input){
        System.out.println("Cards");
        for(int n : input){
            System.out.print( n + "," );
        }
    }

    public void printOriginalCards(){
        System.out.println("original cards");
        for(int n : copyOfCards){
            System.out.print( n + "," );
        }
    }

    private int generateRandom(int min, int max){
        Random r = new Random();
        return r.nextInt(max - min) + min;
    }

    private void swap(int x, int y){
        if( x==y ){
            return;
        }
        int temp;
        temp = cards[x];
        cards[x] = cards[y];
        cards[y] = temp;
    }
}
