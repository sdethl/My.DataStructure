package Apple;

import leetcode.Apple.RemoveConsecutive;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class testRemoveConsective {

    @Test(dataProvider = "data")
    public void testcase1(String string, String expected){
        RemoveConsecutive rc = new RemoveConsecutive();
        System.out.println(rc.removeCon(string));
        assertEquals(rc.removeCon(string), expected);
    }

    @DataProvider(name = "data")
    public static Object[][] data(){
        return new Object[][]{
//                {"aaa",""},
//                {"aabbbcdb", "cdb"},
//                {"ad", "ad"},
//                {"dBb", "d"},
//                {"a", "a"},
                {"a=09,bbc", "ac"}
        };
    }

    @Test
    public void testcase2(){
        StringBuilder sb = new StringBuilder();
        String s = sb.append("adf/.,/2859275").reverse().toString();
        System.out.println(s);
    }
}
