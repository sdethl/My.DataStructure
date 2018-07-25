package list;

import org.junit.Test;
import java.util.LinkedList;

public class runEmployee {

    @Test
    public void testEm(){
        Employee e1 = new Employee("Jane", "Jones", 123);
        Employee e2 = new Employee("Bill", "End", 124);
        Employee e3 = new Employee("Jo", "Jo", 125);
        Employee e4 = new Employee("Zoe", "Jo", 126);

        LinkedList<Employee> emList = new LinkedList<>();
        emList.addLast(e1);
        emList.add(e2);
        emList.addFirst(e3);
        emList.set(1, e4);
        for(Employee e : emList){
            System.out.println(e);
        }
        System.out.println(emList.contains(e3));
    }
}
