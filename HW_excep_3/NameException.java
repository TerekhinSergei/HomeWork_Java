package hw_excep_3;

public class NameException extends Exception {
    String data;

    public NameException(String inputData) {
        this.data = inputData;
    }

    public String getMessage() {
        return "Неправильный формат ФИО '" + data + "'.\n" +
                "Допустимые символы: буквы и дефис в двойных фамилиях!";
    }
}