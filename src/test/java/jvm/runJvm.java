package jvm;

import org.junit.Test;

public class runJvm {

    SeeJvm sf = new SeeJvm();

    @Test
    public void testJvm(){
        sf.method1();
    }

    @Test
    public void testStringPool(){
        sf.test_String_pools();
    }
}
