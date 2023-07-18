package task03;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class DataProvider {
    public  Map<String, Integer> getData(){
        Map<String, Integer> hmap = new HashMap<>();
        hmap.put("Monday", 8);
        hmap.put("Tuesday", 9);
        hmap.put("Wednesday", 13);
        hmap.put("Thursday", 11);
        hmap.put("Friday", 12);
        hmap.put("Saturday", 10);
        hmap.put("Sunday", 15);
        return hmap;
    }
}
