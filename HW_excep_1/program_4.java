//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
//Если длины массивов не равны, необходимо как-то оповестить пользователя.
//Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

import java.util.Arrays;

public class program_4 {
    public static void main(String[] args) {
        float[] arr1 = {11, 21, 31, 41, 51};
        float[] arr2 = {7, 8, 9, 10, 11};
        float[] array = division (arr1, arr2);
        
        System.out.println(Arrays.toString(array));
        
    }

    public static float[] division (float[] arr1, float[] arr2) {
        if (arr1.length != arr2.length) { throw new RuntimeException("Массивы имеют разную длину!");
        } else {
            float[] array = new float[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                if (arr2[i] == 0) {
                    throw new RuntimeException("Делить на ноль нельзя!");
                }
                array[i] = arr1[i]/arr2[i];
            }
            return array;
        }
    }
}
