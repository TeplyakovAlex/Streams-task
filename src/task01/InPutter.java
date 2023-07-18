package task01;

import java.util.Scanner;

public class InPutter {
    static Scanner letter;
    public static  String getLetter() {

        letter = new Scanner(System.in);
        return letter.nextLine().toUpperCase();
    }
}
