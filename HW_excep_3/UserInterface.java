package hw_excep_3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UserInterface<V extends View> {

    private CheckData model;
    private V view;

    public UserInterface(V v) {
        view = v;
    }

    public void start() {
        boolean next = true;
        while (next) {
            String input = view.getInputData(
                ">\nВведите через пробел:Фамилию Имя Отчество ДатуРождения(dd.mm.yyyy) НомерТелефона(без префикса:9115550011) Пол(m,f)\n" +
                "или Exit для прекращения программы:");
            if (input.contains("Exit") || input.contains("exit")) {
                next = false;               
            } else {
                String[] splitedInput = input.replaceAll("\\s+", " ").split(" ");

                int inputDataCount = checkInputDataCount(splitedInput.length);
                if (inputDataCount == -1) {
                    view.printOutputData("Введено мало данных. Должно быть: Фамилия Имя Отчество НомерТелефона ДатаРождения Пол (разделенные пробелом ' ')\n");
                } else if (inputDataCount == 0) {
                    view.printOutputData("Введено много данных. Должно быть: Фамилия Имя Отчество НомерТелефона ДатаРождения Пол (разделенные пробелом ' ')\n");
                } else {
                    try {
                        model = new CheckData();
                        model.CheckInputData(splitedInput);
                        writePersonData(model);
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (InputDataException e) {
                        view.printOutputData(e.getMessage());
                    }
                }
            }
        }
    }

    private int checkInputDataCount(int inputDataCount) {
        if (inputDataCount < CheckData.dataCount) {
            return -1;
        } else if (inputDataCount > CheckData.dataCount) {
            return 0;
        } else {
            return inputDataCount;
        }
    }

    private void writePersonData(CheckData data) throws IOException {
        File filepath = new File("E:\\обучение\\Java\\HomeWork_Java\\HW_excep_3\\" + data.getLastName()+".txt");
        //File filepath = new File("C:\\JavaException\\" + data.getLastName()+".txt");
        try (FileWriter fw = new FileWriter(filepath, true)) {
            fw.append(data.toString() + "\n");
        } catch (IOException e) {
            throw e;
        }
    }
    
}
