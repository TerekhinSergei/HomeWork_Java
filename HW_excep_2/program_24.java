//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class program_24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите любую строку > ");
        try {
            String str = scan.nextLine();
            if (str.length() > 0) {
            System.out.println("Вы ввели строку: " + str);                
            } else {               
              	throw new Exception	(); 
            }
        } catch (Exception e) {                
            System.out.println("Вы ничего не ввели. Ввод обязателен!");            
        } finally {
            scan.close();
        }
    }
}
