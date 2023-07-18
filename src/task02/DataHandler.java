package task02;

import java.util.Map;
import java.util.stream.Collectors;

public class DataHandler {
    public Map<String, Double> filterData(Map<String, Double> hmap){

        return hmap.entrySet()
                .stream()
                .filter(map -> map.getValue() <= 2.00)
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue));
    }
}
