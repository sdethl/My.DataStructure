package datastructure.Queue;

public class MyQueue {

    private int[] queArray;
    private int capacity;
    private int front;
    private int rear;
    private int nItems;

    public MyQueue(int size){
        this.queArray = new int[size];
        this.capacity = size;
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public void insert(int number){
        if( !isFull() ){
            rear++;
            queArray[rear] = number;
            nItems++;
        }
    }

    //remove from front
    //front doesn't have to be 0
    public int remove(){
        int removedNode = queArray[front];
        front++;
        if( front == capacity){
            front = 0;
        }
        nItems--;
        return removedNode;
    }

    public int peekFront(){
        return queArray[front];
    }

    public void view(){

    }

    public boolean isEmpty(){
        return (nItems == 0);
    }

    public boolean isFull(){
        return (nItems == capacity);
    }




}
