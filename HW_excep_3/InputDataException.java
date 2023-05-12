package hw_excep_3;

public class InputDataException extends Exception {
    String data;

    public InputDataException(String inputData) {
        this.data = inputData;
    }

    public String getMessage() {
        return this.data;
    }
}