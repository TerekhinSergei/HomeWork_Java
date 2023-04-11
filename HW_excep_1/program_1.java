// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class program_1 {
    public static void main(String[] args) {        
        String[] array = {"16","8","4","0", null,"15"};
        // чтобы увидеть вывод исключения необходимо оставить только один из методов
        // остальные закомментировать 
        System.out.println("Результат работы метода:");
        // divisionByZero(100, array);
        printValueOfArray(array,6);                       
        //printStringArray(array); 
    }

    // divisionByZero
    public static void divisionByZero(double num1, String[] array){
        for (int i = 0; i < array.length; i++) {
          int num2 = Integer.parseInt(array[i]); //NumberFormatException
            if(num2 ==  0){
                throw new ArithmeticException("На ноль делить нельзя!!!");
            } else {
                double res = num1/num2;
                System.out.println("Результат деления равен > " + res);
            }   
        }
    }
   
  // out of bounds
    public static void printValueOfArray(String[] array, int i){
        if(i >= array.length){ throw new ArrayIndexOutOfBoundsException("Элемента c таким индексом не существует");
        } else {
            System.out.println("Элемент с индексом "+ i + " равен " + array[i]);
        }
    }

  // Null pointer exception
    public static void printStringArray(String[] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == null){ throw new NullPointerException("Элемент отсутствует!!!");
            } else { 
            System.out.print(array[i] + ", ");
            } 
        }    
    }
}        