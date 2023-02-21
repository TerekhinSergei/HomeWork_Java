// Реализовать алгоритм сортировки слиянием.

import java.util.Arrays;
import java.util.Random;
 
public class program31hw {
 
    public static void main(String[] args) {
        
        Random rand = new Random();
        int arr[] = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);            
        }

        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(arr));
        System.out.println("");

        int[] arrCopy = Arrays.copyOf(arr, arr.length);
       
        sortingByMerging(arr, arrCopy, 0, arr.length - 1);

        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(arr));
    }

    
    public static void sortingByMerging(int[] arr, int[] arrCopy, int start, int stop) {
        if (stop == start) {      
            return;
        }

        int mid = ((start + stop)/2);

        sortingByMerging(arr, arrCopy, start, mid);
        sortingByMerging(arr, arrCopy, mid + 1, stop);
              
        merge(arr, arrCopy, start, mid, stop);
    }

    public static void merge(int[] arr, int[] arrCopy, int start, int mid, int stop) {
        int k = start;
        int i = start;
        int j = mid + 1;
    
        while (i <= mid && j <= stop) {
            if (arr[i] <= arr[j]) {
                arrCopy[k] = arr[i];
                k++;
                i++;
            }
            else {
                arrCopy[k] = arr[j];
                k++;
                j++;
            }
        }        

        while (i <= mid) {
            arrCopy[k] = arr[i];
            k++;
            i++;
        }

        for (i = start; i <= stop; i++) {
            arr[i] = arrCopy[i];
        }        
    }
}
