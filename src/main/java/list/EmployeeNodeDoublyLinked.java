package list;

/**
 * Node for doubly linked data structure
 */
public class EmployeeNodeDoublyLinked {

    private Employee e;
    private EmployeeNodeDoublyLinked previous;
    private EmployeeNodeDoublyLinked next;


    public Employee getE() {
        return e;
    }

    public void setE(Employee e) {
        this.e = e;
    }

    public EmployeeNodeDoublyLinked getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeNodeDoublyLinked previous) {
        this.previous = previous;
    }

    public EmployeeNodeDoublyLinked getNext() {
        return next;
    }

    public void setNext(EmployeeNodeDoublyLinked next) {
        this.next = next;
    }
}
