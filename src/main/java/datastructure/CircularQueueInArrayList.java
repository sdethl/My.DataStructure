package datastructure;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class CircularQueueInArrayList implements Queue{

    private int capacity;
    private int counter;
    ArrayList<Integer> list;

    public CircularQueueInArrayList(int capacity){
        this.capacity = capacity;
        list = new ArrayList<>(capacity);
        counter = 0;
    }

    public boolean enQueue(int value){
        if( isFull() ){
            return false;
        }
        list.add(value);
        counter++;
        return true;
    }

    public boolean deQueue(){
        if( isEmpty()){
            return false;
        }
        list.remove(0);
        counter--;
        return true;
    }

    public int Front(){
        if( isEmpty()){
            return -1;
        }
        return list.get(0);
    }

    public int Rear(){
        if( isEmpty()){
            return -1;
        }
        return list.get(counter-1);
    }

    public boolean isFull(){
        return counter == capacity;
    }

    public boolean isEmpty(){
        return counter == 0;
    }

    public void toPrint(){
        for(int i : list){
            System.out.print(i + " ");
        }
        java.util.Queue queue = new PriorityQueue();
    }
}
