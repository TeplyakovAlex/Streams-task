package task01;

import java.util.stream.Stream;

public class DataProvider {
    public Stream<String> getData(){

        return Stream.of("Kate", "John",
                "Nik", "Olivia", "Bob", "Nike");
    }
}
