// Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что 1 человек может иметь несколько телефонов.
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class program51hw {
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();
        phoneBook.put("Сидоров", List.of("8 (910) 300-30-33", "8 (920) 400-10-11", "8 (930) 707-70-77"));
        phoneBook.put("Петров", List.of("8 (910) 100-10-10", "8 (920) 200-11-11"));
        phoneBook.put("Иванов", List.of("8 (910) 200-20-20", "8 (920) 300-30-11"));        
        phoneBook.put("Романов", List.of("8 (915) 500-50-50"));
        phoneBook.put("Сергеев", List.of("8 (915) 600-70-80", "8 (909) 992-29-99"));
        phoneBook.put("Мухин", List.of("8 (915) 777-03-06", "8 (909) 800-25-52"));
        phoneBook.put("Васин", List.of("8 (905) 505-15-51"));
        
        boolean flag = true;
        System.out.print(
                "Введите команду из списка:" +"\n"+
                 "add - добавить контакт,"+"\n"+ 
                 "all - показать всю телефонную книгу,"+"\n"+ 
                 "find - найти контакт," +"\n"+
                 "delete - удалить контакт," +"\n"+ 
                 "exit - выйти"+"\n"+ "> ");
        while (flag) {
            String comands = scanner();
            if (comands.equals("exit")) {
                flag = false;                
            } else {
                switch (comands) {                    
                    case "add":
                        add(phoneBook);
                        break;
                    case "all":
                        allBook(phoneBook);
                        break;
                    case "find":
                        find(phoneBook);
                        break;    
                    case "delete":
                        delete(phoneBook);
                        break;    
                    default:
                        System.out.println("Нет такой команды");
                        System.out.print("> ");
                        break;
                }
            }
        }
    }

    public static String scanner() {
        Scanner scanner = new Scanner(System.in, "cp866");;
        String scan = scanner.nextLine();        
        return scan;
    }

    public static Map<String, List<String>> add(Map<String, List<String>> phoneBook) {        
        System.out.println("Введите имя: ");        
        String name = scanner();
        List<String> numbers = new ArrayList<>();
        while (true) {
            System.out.println("Введите номер (если номеров несколько, Enter после каждого)");
            System.out.println("После завершения ввода номера/номеров введите 'end'");
            System.out.print("> ");
            String phone = scanner();
            if (phone.equals("end")) {
                break;
            } else {
                numbers.add(phone);
            }
        }
        phoneBook.put(name, numbers);
        System.out.print("> ");
        return phoneBook;
    }

    public static void allBook(Map<String, List<String>> phoneBook) {
        System.out.println(phoneBook);        
        System.out.print("> ");
    }

    public static void find(Map<String, List<String>> phoneBook) {
        System.out.println("Введите имя: ");
        String name = scanner();
        System.out.println(phoneBook.get(name));
        System.out.print("> ");
    }

    public static void delete(Map<String, List<String>> phoneBook) {
        System.out.println(phoneBook);
        System.out.println("Введите имя: ");
        String name = scanner();
        phoneBook.remove(name);
        System.out.println("Запись '"+ name +"' удалена.");
        System.out.println(phoneBook);
        System.out.print("> ");
    }
}