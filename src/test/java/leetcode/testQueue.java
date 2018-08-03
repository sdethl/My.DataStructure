package leetcode;

import datastructure.CircularQueueInArray;
import datastructure.CircularQueueInArrayList;
import org.junit.Test;

public class testQueue {

    @Test
    public void testCircularQueueInArray(){
        CircularQueueInArray c = new CircularQueueInArray(3);
        c.enQueue(1);
        c.enQueue(2);
        c.enQueue(3);

        System.out.println("is full?" +c.isFull());
        System.out.println("rear: " +c.Rear());

        c.deQueue();
        System.out.println("after dequeue, rear: " +c.Rear());
        System.out.println("after dequeue, front:" + c.Front());

        c.enQueue(4);
        c.toPrint();
        System.out.println("after enqueue, now Front:" + c.Front());

        c.deQueue();
        c.deQueue();
        System.out.println("after dequeue, now Front:" + c.Front());
    }

    @Test
    public void testCircularQueueInArrayList(){
        CircularQueueInArrayList c = new CircularQueueInArrayList(3);
        c.enQueue(1);
        c.enQueue(2);
        c.enQueue(3);

        System.out.println("is full?" +c.isFull());
        System.out.println("rear: " + c.Rear());

        c.deQueue();
        System.out.println("after dequeue, rear: " + c.Rear());
        System.out.println("after dequeue, front:" + c.Front());

        c.enQueue(4);
        c.toPrint();
        System.out.println("after enqueue, now Front:" + c.Front());

        c.deQueue();
        c.deQueue();
        System.out.println("after dequeue, now Front:" + c.Front());
    }
}
