package hw_excep_3;

public class GenderException extends Exception {
    String data;

    public GenderException(String inputData) {
        this.data = inputData;
    }

    public String getMessage() {
        return "Неправильно указан пол: '" + data + "'\n" +
                "Формат ввода пола: m(M) или f(F).";
    }
}