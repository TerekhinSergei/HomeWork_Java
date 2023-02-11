import java.util.*;
public class program3hw {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");		
		Double num1 = scan.nextDouble ();
        System.out.print("Введите второе число: ");		
		Double num2 = scan.nextDouble ();
        
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Введите операцию: ");
		String operation = scan1.nextLine();        
       
        switch (operation){
            case "+":
                System.out.println(num1 + " + " +num2 + " = " + (num1+num2));
                break;
            case "-":
                System.out.println(num1 + " - " +num2 + " = " + (num1-num2));
                break;
            case "*":
                System.out.println(num1 + " * " +num2 + " = " + (num1*num2));
                break;
            case "/":
                System.out.println(num1 + " / " +num2 + " = " + (num1/num2));
                break;
            default:
                System.out.println("нет такой операции :(");
        }
   }    
}
