import java.util.Scanner;
/*
Задано уравнение вида q + w = e, q, w, e >= 0. 
Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
Требуется восстановить выражение до верного равенства. 
Предложить хотя бы одно решение или сообщить, что его нет.
*/
public class program4hw {
    //решение для чисел 0<=q,w<=99, 0<=е<=198
    public static void main(String[] args) {
        System.out.print("Введите целое число e (0,198): ");
		Scanner scan = new Scanner(System.in);
		int e = scan.nextInt();
        int count = 0; //количество решений
        for (int i = 0; i <= 9; i++) { //если решать только для двузначных q и w, то i,k = 1
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int n = 0; n <= 9; n++) {
                        //for (int m = 0; m <= 9; m++) { //если не задавать число e
                            //for (int l = 0; l <= 9; l++) {
                                int q = i * 10 + j;
                                int w = k * 10 + n;
                                //int e = m * 10 + l;
                                if (q + w == e) {
                                    count++; 
                                    System.out.println(count +": "+ q + " + " + w  + " = " + e);
                                }
                            //}
                        //}
                    }
                }
            }
        }
        if (count!=0){
            System.out.println("найдено " + count + " решений");            
        }else{
            System.out.println("решений не надено");
        }            
    } 
}
