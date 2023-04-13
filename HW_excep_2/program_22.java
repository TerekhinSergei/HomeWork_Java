// Задание 2
// Если необходимо, исправьте данный код
// try {
//    int d = 0;
//    double catchedRes1 = intArray[8] / d;
//    System.out.println("catchedRes1 = " + catchedRes1);
// } catch (ArithmeticException e) {
//    System.out.println("Catching exception: " + e);
// }


// в коде неопредлен массив intArray, из которого запрпашивается элемент с 8 индексом, (длина массива не менее 9)):
// таким образом требуется либо определить его в методе

// 1
// public class program_22 {
//     public static void main(String[] args) {
//         try {
//             int d = 0;
//             int[] intArray = {111, 112, 113, 114, 115, 116, 117, 118, 119};
//             double catchedRes1 = intArray[8] / d;
//             System.out.println("catchedRes1 = " + catchedRes1);
//         } catch (ArithmeticException e) {
//             System.out.println("Catching exception: " + e);
//         }
//     }
// }

// 2
// либо передать из другого метода
public class program_22 {
    public static void main(String[] args) {
        int[] array = {111, 112, 113, 114, 115, 116, 117, 118, 119};
        Catching(array);
    }

    private static void Catching(int[] intArray) {
        try {
            int d = 0;            
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}