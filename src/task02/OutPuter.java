package task02;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class OutPuter {
    public void getOutput(Map<String, Double> hmap) {
        AtomicInteger count = new AtomicInteger(0);
        hmap.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
                .forEach((key, value) -> System.out.println(count.incrementAndGet() + ") "+ key + " => " + value));
    }
}
