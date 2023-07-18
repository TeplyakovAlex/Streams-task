package task01;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class OutPuter {
    public void getOutput(Stream<String> stream) {
        AtomicInteger count = new AtomicInteger(0);
        stream.forEach(str ->
                System.out.println(count.incrementAndGet() + ") " + str)
        );
    }
}
