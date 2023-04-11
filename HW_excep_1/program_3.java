//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
//Если длины массивов не равны, необходимо как-то оповестить пользователя.

import java.util.Arrays;

public class program_3 {
    public static void main(String[] args) {
        int[] arr1 = {11, 21, 31, 41, 51};
        int[] arr2 = {7, 8, 9, 10};
        int[] array = subtraction(arr1, arr2);
        
        System.out.println(Arrays.toString(array));
        
    }

    public static int[] subtraction (int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) { throw new RuntimeException("Массивы имеют разную длину!");
        } else {
            int[] array = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                array[i] = arr1[i] - arr2[i];
            }
            return array;
        }
    }
}
