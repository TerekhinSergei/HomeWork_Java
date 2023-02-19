// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее арифметичское этого списка.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class program33hw {
    public static void main(String[] args) {
        Random random = new Random();
        int len = 15;
        List<Integer> list = new ArrayList<>(len);
        for (int i = 0; i < len; i++) {
            list.add(random.nextInt(100));
        }

        System.out.println(list.toString());

        int min = Collections.min(list);
        int max = Collections.max(list);
        int count = 0;
        int sum = 0;
        
        for (Integer i : list) {
            sum += i;
            count ++;
        }
        double result = sum / count;

        System.out.println("Минимальное: " + min);
        System.out.println("Максимальное: " + max);
        System.out.println("Cреднее арифметичское: " + result);
    }  
}
