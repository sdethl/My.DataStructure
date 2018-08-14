package OOD;

import OOD.leetcode.CompareDucks;
import OOD.leetcode.Duck;
import org.junit.Test;

import java.util.ArrayList;

public class CompareObjects {

    Duck d1 = new Duck("Ann", 15, 2);
    Duck d2 = new Duck("Bella", 12,1);
    Duck d3 = new Duck("Cathy", 12,1);
    ArrayList<Duck> ducks = new ArrayList<>();

    @Test
    public void testDuck(){
        System.out.println(d1.compare(d1, d2));
    }

    @Test
    public void testDuckName(){
        System.out.println(d1.compareName(d1, d2));
    }

    @Test
    public void testSortByAllFields(){
        ducks.add(d1);
        ducks.add(d2);
        ducks.add(d3);
        CompareDucks cd = new CompareDucks();
        cd.sortByAllFields(ducks);
    }
}
