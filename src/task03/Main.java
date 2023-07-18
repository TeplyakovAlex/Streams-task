package task03;

public class Main {

    public static void main(String[] args) {

        DataProvider provider = new DataProvider();
        DataHandler handler = new DataHandler();
        OutPuter outPuter = new OutPuter();

       outPuter.getOutput(handler.filterData(provider.getData()));
    }


}
