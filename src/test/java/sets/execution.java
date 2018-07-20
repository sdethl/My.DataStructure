package sets;

import maps.Practice;
import maps.SeeMaps;
import org.junit.Test;

import java.util.*;

public class execution {
    @Test
    public void testSet(){
        HashSet s = new HashSet();
        s.add("first");
        s.add("first");
        s.add("first");
        s.add("first");
        s.add("first");



        SeeHashset hs = new SeeHashset();
        hs.method1(s);
    }

    @Test
    public void testMap(){
        SeeMaps m = new SeeMaps();
        m.method1();

    }

    @Test(expected = IllegalArgumentException.class)
    public void testPractice(){
        String[] cities = {"Austin","Austin","New York","Austin","New York","Austin","New York","Austin","New York","Austin"};
        Practice p = new Practice();
        Map<String, Integer> countMap = p.countTheDuplicates(cities);
        for(Map.Entry<String, Integer> entry: countMap.entrySet()){
            System.out.println(entry);

        }

    }
}
