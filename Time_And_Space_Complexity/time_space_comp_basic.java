
import java.util.*;

public class time_space_comp_basic {

    public static void optimized_buble_sort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (swap == false) {
                break;
            }
        }
    }

    public static void array_display(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void buble_sort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int linear_max(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        /* In lemear search for loop is doing k operations in one iteration
         * the it will do n*k operations in n interation
         * therefore time complexity is O(n);
         */
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        int arr[] = {-1, 2, 5, 3, 6, 8};
        System.out.println("Max: " + linear_max(arr));
        Arrays.sort(arr);
        System.out.println("Max: " + arr[arr.length - 1]);
        int arr1[] = {10, 9, 11, 6, 15, 2};
        System.out.println("Original");
        array_display(arr1);
        buble_sort(arr1);
        System.out.println("Sorted");
        array_display(arr1);
        System.out.println("Optimized Buble Sort");
        int arr2[] = {9, 4, 2, 1, 34, 2};
        optimized_buble_sort(arr2);
        array_display(arr2);
        buble_sort(arr2);
        array_display(arr2);

    }
}
