package task03;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataHandler {
    public Map<String, Integer> filterData(Map<String, Integer> hmap){

        return hmap.entrySet()
                .stream()
                .filter(map -> map.getValue() <= 13 && map.getValue()>=10)
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue));
    }
}
