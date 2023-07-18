package task01;

import java.util.stream.Stream;

public class DataHandler {
    public Stream<String> filterData(Stream<String> stream,String filter){

        return stream.filter(str -> str.startsWith(filter));
    }
}
