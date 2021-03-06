package datastructure.Stack;

public class MyStack {

    private int[] stackArray;
    private int capacity;
    private int top;

    public MyStack(int size){
        this.capacity = size;
        this. stackArray = new int[size];
        top = -1;
    }

    public void push(int number) {
        if (isFull()) {
            return;
        } else {
            top++;
            stackArray[top] = number;
        }
    }

    public int pop(){
        if( isEmpty()){
            return 0;
        } else{
            int oldTope = top;
            top--;
            return stackArray[oldTope] ;
        }
    }

    /**
     * #155. Find the minimum number
     * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
     */
    public int getMin(){
        return 0;
    }

    public int peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == (capacity - 1));
    }

}
