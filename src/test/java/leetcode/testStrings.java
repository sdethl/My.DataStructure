package leetcode;

import org.testng.annotations.Test;

public class testStrings {


    @Test
    public void testCompressString(){
        String s = "AAABBBCCCE";
        OperateStrings os = new OperateStrings();
        System.out.println(os.compressString(s));
    }
}
