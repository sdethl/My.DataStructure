package JavaCore;

import org.junit.Test;

public class reviewString {

    @Test
    public void testString(){

        String s1 = "sunny";
        String s2 = "sunny";
        String s3 = new String("sunny");

        System.out.println( s1.equals(s2));
        System.out.println( s1 == s2 );
        System.out.println(s3.equals(s1));
        System.out.println(s1 == s3);
    }

    @Test
    public void testStringBuilder(){
        StringBuilder sb = new StringBuilder();

        //String create
        sb.append("today").append(" is ").append("good!");
        System.out.println(sb);

        //String edit
        sb.insert(1, "a ");
        System.out.println(sb);

        //String cap
        System.out.println("capacity: " + sb.capacity());


        //String reverse
        sb.reverse();
        System.out.println("reversed : " + sb);

        //find the string
        System.out.println("last index of 'a' is: " + sb.lastIndexOf("aa"));
    }
}
