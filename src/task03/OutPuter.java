package task03;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OutPuter {
    public void getOutput(Map<String, Integer> hmap) {
        AtomicInteger count = new AtomicInteger(0);
        hmap.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
                .forEach((key, value) -> System.out.println(count.incrementAndGet() + ") "+ key + " => " + value));
    }
}
