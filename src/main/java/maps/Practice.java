package maps;

import java.util.HashMap;
import java.util.Map;

public class Practice {

    /**
     * Given a list of sb, find out the duplicates
     * @param strings
     * @return
     */
    public Map<String, Integer> countTheDuplicates(String[] strings){
        HashMap<String, Integer> map = new HashMap<>();
        for(String string: strings){
            Integer count = map.get(string);
            if(count!=null){
                count++;
                map.put(string,count);
            }else{
                map.put(string,1);
            }
        }
        return map;
    }


}
