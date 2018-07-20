package list;

import org.junit.Test;

import java.util.Collection;
import java.util.LinkedList;

public class runEmployee {

    @Test
    public void testEm(){
        Employee e1 = new Employee("Jane", "Jones", 123);
        Employee e2 = new Employee("Bill", "End", 124);
        Employee e3 = new Employee("Jo", "Jo", 125);

        LinkedList<Employee> emList = new LinkedList<>();
        emList.add(e1);
        emList.add(e2);
        emList.add(e3);


    }
}
