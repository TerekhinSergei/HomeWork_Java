import java.util.Scanner;
import java.util.Stack;

// В калькулятор добавьте возможность отменить последнюю операцию.

public class program43hw {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String str = "";
        Scanner iScanner = new Scanner(System.in);
        int res;
        System.out.println("Программа калькулятор с возможностью отмены ранее введенны данных командой <revet>\n");

        while (stack.size() < 4) {
            if (stack.size() < 1){
                System.out.println("ведите первое число: ");
            }else{
                if (stack.size() < 2){
                    System.out.println("ведите второе число (или revert): ");
                }else{
                    if (stack.size() < 3) {
                        System.out.println("ведите знак (или revert): ");
                    }else{
                        if (stack.size() == 3) {
                            System.out.println("ведите run для вычисения (или revert): ");
                        }    
                    }    
                }
            }              
            str = iScanner.nextLine();
                
            if (str.equals("revert")) {
                stack.remove(stack.size()-1);
            }else{
                stack.push(str);      
            }
        }    
        if (str.equals("run")) {
            stack.pop();
            System.out.print("Вычисляем: ");
            System.out.println(stack);
        }                   
        if (isDigit(stack.lastElement())) {
            System.out.println("Ошибка ввода данных");
        }else{
            switch (stack.pop()) {
                case "+":
                    res = Integer.parseInt(stack.pop()) + Integer.parseInt(stack.pop());
                    System.out.println(res);
                    break;
                case "-":
                    res = - Integer.parseInt(stack.pop()) + Integer.parseInt(stack.pop());
                    System.out.println(res);
                    break;
                case "*":
                    res = Integer.parseInt(stack.pop()) * Integer.parseInt(stack.pop());
                    System.out.println(res);
                    break;
                case "/":
                    Integer temp = Integer.parseInt(stack.pop());
                    res = Integer.parseInt(stack.pop()) / temp;
                    System.out.println(res);
                    break;
                default:
                    System.out.println("нет такой операции");
                    break;
            }           
        }         
        
    }
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    } 
    
}

