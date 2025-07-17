
import java.util.*;

public class time_space_comp_basic {

    public static int power_optimized(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int nb2_power = power_optimized(a, n / 2);
        int square_nb2_power = nb2_power * nb2_power;
        if (n % 2 == 0) {
            return square_nb2_power;
        } else {
            return a * square_nb2_power;
        }

    }

    public static int power_basic(int a, int n) {
        if (n == 0) {
            return 1;
        }

        return a * power_basic(a, n - 1);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                k++;
                i++;
            } else {
                temp[k] = arr[j];
                k++;
                j++;
            }

        }
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0, m = si; l < temp.length; l++, m++) {
            arr[m] = temp[l];
        }
    }

    public static void m_sort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        m_sort(arr, si, mid);
        m_sort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    public static int N_sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + N_sum(n - 1);
    }

    public static int factorial(int n) {

        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static int Linear_Search(int arr[], int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int Binary_Search(int arr[], int key) {

        int si = 0;
        int ei = arr.length - 1;
        int mid;
        while (si <= ei) {
            mid = si + (ei - si) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                ei = mid - 1;
            } else {
                si = mid + 1;
            }

        }
        return -1;

    }

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
        System.out.println("Binary Search");
        System.out.println("Element at: " + Binary_Search(arr2, 34));
        System.out.println("Linear Search");
        System.out.println("Element at: " + Linear_Search(arr2, 34));
        System.out.println("Linear Recursion: ");
        System.out.println("Factorial: " + factorial(4));
        System.out.println("Sum: " + N_sum(10));
        System.out.println("Fibonacci num: " + fibo(2));
        System.out.println("Merge Sort Function: ");
        int arr3[] = {2, 1, 8, 4, 10, 5};
        m_sort(arr3, 0, arr3.length - 1);
        array_display(arr3);
        System.out.println("Power Function part 1");
        System.out.println("" + power_basic(2, 5));
        System.out.println("Power Function part 2");
        System.out.println("" + power_optimized(2, 5));

    }
}
