package hw_excep_3;

import java.util.Scanner;

public class DataView implements View {

    private Scanner in = new Scanner(System.in, "IBM866");

    public void printOutputData(String message) {
        System.out.printf("%s", message);
    }

    public String getInputData(String message) {
        System.out.printf("%s", message);
        return in.nextLine();
    }
    
}
