
public class Check_Array_Sort {

    public static boolean sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;

    }

    public static boolean isSort(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSort(arr, i + 1);
    }
    //sort Using recurion.

    public static void main(String[] args) {
        System.out.println("Hello World");
        int arr[] = {1, 2, 3, 4, 5};
        if (sort(arr)) {
            System.out.println("Sort");
        } else {
            System.out.println("UnSorted");
        }

        System.out.println("Array Sort using Recursion.");
        int arr2[] = {1, 2, 3, 4};
        System.out.println(isSort(arr2, 0));
        int arr3[] = {1, 2, 5, 4};
        System.out.println(isSort(arr3, 0));
    }
}
