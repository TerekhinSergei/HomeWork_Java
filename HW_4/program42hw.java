import java.util.ArrayDeque;
import java.util.Random;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

public class program42hw {
    public static void main(String[] args) {

        Random rand = new Random();
        ArrayDeque<Integer> llist = new ArrayDeque<>();        
        for (int i = 0; i < 10; i++) {
            llist.add(rand.nextInt(50));
        }
            int newElement = 77;
            System.out.println("Созданная очередь: " + llist);
            System.out.println("Добавляем элемент " + newElement + "\n" + 
                                "Очередь после добавления элемента: " + enqueue(llist, newElement));
            System.out.println("Удаляемый элемент (первый): " + dequeue(llist) + "\n" + 
                                "Очередь после удаления элемента: " + llist);
            System.out.println("Первый элемент: " + first(llist));
        }
        
    public static ArrayDeque<Integer> enqueue(ArrayDeque<Integer> llist, int newElement) {
        llist.addLast(newElement);        
        return llist;
    }

    public static int dequeue(ArrayDeque<Integer> llist) {
        int firstElement = llist.getFirst(); // возвращает первый элемент из очереди
        llist.pollFirst(); // удаляет первый элемент из очереди
        return firstElement;
    }

    public static int first(ArrayDeque<Integer> llist) {
        return llist.getFirst();
    }
}




    


