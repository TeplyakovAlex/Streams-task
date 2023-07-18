package task02;

import java.util.HashMap;
import java.util.Map;

public class DataProvider {
    public  Map<String, Double> getData(){
        Map<String, Double> hmap = new HashMap<>();
        hmap.put("Apple", 1.05);
        hmap.put("Orange", 1.99);
        hmap.put("Kiwi", 2.00);
        hmap.put("Banana", 3.15);
        return hmap;
    }
}
