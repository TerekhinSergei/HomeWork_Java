// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.Random;
//import java.util.Stack; 

public class program41hw {
    public static void main(String[] args) {

    Random rand = new Random();

    /*Stack<Integer> stack = new Stack<>();  // Вариант с использование Stack
    Stack<Integer> reverse = new Stack<>();

    for (int i = 0; i < 15; i++) {            
        stack.push(rand.nextInt(100));
    }
    System.out.println("-Исходный  список:  " + stack);

    for (int i = 0; i < 15; i++) {
        reverse.push(stack.pop());
    }
    System.out.println("Перевернутый список:" + reverse);

    }*/

    LinkedList<Integer> llist = new LinkedList<Integer>(); // Вариант с использованием LinkedList
    LinkedList<Integer> revlist = new LinkedList<Integer>();

    for (int i = 0; i < 15; i++) {            
        llist.add(rand.nextInt(100));
    }
    System.out.println("- Исходный  список: " + llist);

    for (int i = 0; i < 15; i++) {        
        revlist.push(llist.removeFirst());
    }
    System.out.println("Перевернутый список:" + revlist);

    }

    
}

       

