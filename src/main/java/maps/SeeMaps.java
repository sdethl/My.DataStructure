package maps;

        import java.util.Map;
        import java.util.TreeMap;

public class SeeMaps {

    /**
     * Map has unique value, but not unique value
     */

    public void method1(){
        Map<String, String> hm = new TreeMap();
        hm.put("one","cat");
        hm.put("one","dog");
        hm.put("two","dog");
        hm.put("three","fish");

        //iterate entry sets
        for(Map.Entry<String, String> entry : hm.entrySet()){
            System.out.println("value=" + entry.getKey() + ", value=" + entry.getValue());
        }

        //iterate values
        for(String str: hm.values()){
            System.out.println(str);
        }
        System.out.println("hashcode: " + hm.hashCode());
    }
}
