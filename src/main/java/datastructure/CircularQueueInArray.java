package datastructure;

public class CircularQueueInArray implements Queue{

    /**
     * # 622. Design Circular Queue
     * Design your implementation of the circular queue.
     * The circular queue is a linear data structure in which the operations are performed based on FIFO (First In First Out) principle
     * and the last position is connected back to the first position to make a circle. It is also called "Ring Buffer"
     */

    int capacity;
    int[] queue;

    //points that locate to the first space, last space and the last space that is not null
    int front;
    int rear;
    int current;

     public CircularQueueInArray(int capacity){
        this.capacity = capacity;
        queue = new int[capacity];
        rear = -1;
        front = 0;
        current = 0;
     }

     public boolean enQueue(int data){
        if(isFull()) return false;
        rear = ( rear+1 )%capacity;
        //for normal queue
        //rear = rear +1;
        queue[rear] = data;
        current++;
        return true;
     }

     public boolean deQueue(){
        if(isEmpty()) return false;
        front = ( front+1 )%capacity;
        //for normal queue
        //front = front +1;
        current--;
        return true;
     }

     public int Front(){
        if(isEmpty()) return -1;
        return queue[front];
     }

     public int Rear(){
        if(isEmpty()) return -1;
        return queue[rear];
     }

     public boolean isFull(){
        return current == capacity;
     }

     public boolean isEmpty(){
        return current == 0;
     }

     public void toPrint(){
         for(int i : queue){
             System.out.print(i + " ");
         }
     }
}
