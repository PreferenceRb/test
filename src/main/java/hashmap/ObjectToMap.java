package hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kobe on 2018/8/27.
 */
public class ObjectToMap {
    public static void main(String[] args){
        Map<String,String> map = new HashMap<String, String>();
        map.put("1","test");
        Object object = map;
        Map<String,String> temp = (Map<String, String>) object;
        System.out.println(temp);
    }  
}
