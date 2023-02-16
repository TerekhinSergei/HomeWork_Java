//К калькулятору из предыдущего дз добавить логирование.
import java.util.Scanner;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class program22hw {
    public static void main(String[] args) throws IOException { 
        double num1 = 0;
        double num2 = 0;
        Logger loger = Logger.getLogger(program22hw.class.getName());
        FileHandler fHandler = new FileHandler("LogHW2_2.txt", true);
        SimpleFormatter sFormatter = new SimpleFormatter();
        fHandler.setFormatter(sFormatter);
        loger.addHandler(fHandler);

        Scanner scan = new Scanner(System.in);
        try {
        System.out.print("Введите первое число: ");               		
		num1 = scan.nextDouble (); 
        loger.info("Первое введенное число: " + String.valueOf(num1));       
        }catch (Exception e) {            
            loger.log(Level.SEVERE,
                    "не верный ввод первого числа", e);
        }
        
        try {
        System.out.print("Введите второе число: ");		
		num2 = scan.nextDouble ();
        loger.info("Второе введенное число: " + String.valueOf(num2)); 
        }catch (Exception e) {            
            loger.log(Level.SEVERE,
                    "не верный ввод второго числа", e);
        }      
        
        
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Введите операцию: ");
		String operation = scan1.nextLine();        
        loger.info("Операция: " +  operation);       
       
        switch (operation){
            case "+":
                System.out.println(num1 + " + " +num2 + " = " + (num1+num2));                
                loger.info("Результат: " +  (num1+num2)); 
                break;
            case "-":
                System.out.println(num1 + " - " +num2 + " = " + (num1-num2));
                loger.info("Результат: " +  (num1-num2));
                break;
            case "*":
                System.out.println(num1 + " * " +num2 + " = " + (num1*num2));
                loger.info("Результат: " +  (num1*num2));
                break;
            case "/":
                System.out.println(num1 + " / " +num2 + " = " + (num1/num2));
                loger.info("Результат: " +  (num1/num2));
                break;
            default:
                System.out.println("нет такой операции :(");
                loger.info("нет такой операции : " +  operation);
                
        }
   }    
}
