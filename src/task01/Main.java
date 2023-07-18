package task01;

public class Main {

    public static void main(String[] args) {

        DataProvider provider = new DataProvider();
        DataHandler handler = new DataHandler();
        OutPuter outPuter = new OutPuter();

        System.out.println("""
                Enter a letter to filter names:
                """);

outPuter.getOutput(handler.filterData(provider.getData(),InPutter.getLetter()));
    }


}
