// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к 
// падению приложения, вместо этого, необходимо повторно запросить у пользователя 
// ввод данных.

import java.util.Scanner;

public class program_21 {
    public static void main(String[] args) {
        boolean stop = false;
        Scanner scan = new Scanner(System.in);
        while(!stop){
            System.out.print("Введите дробное число: ");
            try {				
				float num = Float.parseFloat(scan.nextLine());				
                System.out.println("Вы ввели число " + num);
                stop = true;
            } catch (NumberFormatException e) {                
                System.out.println("Необходимо вести дробное число!\n(напоминаю: десятичный знак - точка)");
            }
        }
        scan.close();;
    }
}

