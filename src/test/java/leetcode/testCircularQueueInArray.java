package leetcode;

import datastructure.CircularQueueInArray;
import org.junit.Test;

public class testCircularQueueInArray {

    @Test
    public void testCase_1(){
        CircularQueueInArray c = new CircularQueueInArray(3);
        c.enQueue(1);
        c.enQueue(2);
        c.enQueue(3);

        System.out.println("is full?" +c.isFull());
        System.out.println("rear: " +c.Rear());

        c.deQueue();
        System.out.println("rear: " +c.Rear());
        System.out.println("Front:" + c.Front());

        c.enQueue(4);
        c.toPrint();
        System.out.println("now Front:" + c.Front());

        c.deQueue();
        c.deQueue();
        System.out.println("now Front:" + c.Front());
    }
}
