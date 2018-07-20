package jvm;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecords implements Iterable<Customer> {

    private Map<String, Customer> records;


    public CustomerRecords(){
        this.records = new HashMap<String, Customer>();
    }

    public void addCustomer(Customer customer){
        this.records.put(customer.getName(), customer);
    }

    public Map<String, Customer> getCustomer(){
        return this.records;
    }

    @Override
    public Iterator<Customer> iterator() {
        return null;
    }
}
