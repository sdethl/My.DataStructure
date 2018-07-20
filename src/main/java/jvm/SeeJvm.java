package jvm;

public class SeeJvm {

    public void method1(){
        final Customer c = new Customer("John");
        c.setName("Susan");
        System.out.println(c);
    }

    public void method2(){
        final Customer c = new Customer("John");
        //Error code: can't assign value to a final variable
        //c = new Customer("Susan");
    }

    public void test_String_pools(){
        String one = "hello";
        String two = "hello";

        if( one == two){
            System.out.println( "the same");
        }else{
            System.out.println("different");
        }

        // using .intern with "==" to help jvm recognize the same object
        //String three = new String("hello");
        String three = new String("hello").intern();
        String four = "hello";

        //if( three.equals(four)){
        if( three == four ){
            System.out.println( "the same");
        }else{
            System.out.println("different");
        }
    }
}
