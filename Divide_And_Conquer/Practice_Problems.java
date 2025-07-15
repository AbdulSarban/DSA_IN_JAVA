
import java.util.*;

public class Practice_Problems {

    public static int countRange(int nums[], int num, int si, int ei) {
        int count = 0;
        for (int i = si; i <= ei; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }

    public static int majorityCount_Rec(int nums[], int si, int ei) {
        if (si == ei) {
            return nums[si];
        }

        int mid = si + (ei - si) / 2;
        int left = majorityCount_Rec(nums, si, mid);
        int right = majorityCount_Rec(nums, mid + 1, ei);

        if (left == right) {
            return left;
        }

        int leftCount = countRange(nums, left, si, ei);
        int rightCount = countRange(nums, right, si, ei);

        return leftCount > rightCount ? left : right;

    }

    public static int majority_element_basic(int arr[]) {
        int m_count = arr.length / 2;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > m_count) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void basic_sort(String[] str) {
        Arrays.sort(str);
        System.out.println("String Sort Using Inbuilt Sort Function");
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
    }

    public static String[] m_sort(String[] str, int si, int ei) {
        //base case;

        if (si == ei) {
            String[] a = {str[si]};
            return a;
        }

        int mid = si + (ei - si) / 2;
        String[] arr1 = m_sort(str, si, mid);
        String[] arr2 = m_sort(str, mid + 1, ei);

        String[] arr3 = merge(arr1, arr2);
        return arr3;

    }

    public static String[] merge(String[] arr1, String[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        String arr3[] = new String[m + n];

        int ix = 0;
        int i = 0;
        int j = 0;

        while (i < m && j < n) {

            if (issmaller(arr1[i], arr2[j])) {

                arr3[ix] = arr1[i];
                i++;
                ix++;
            } else {
                arr3[ix] = arr2[j];
                j++;
                ix++;
            }
        }

        while (i < m) {
            arr3[ix] = arr1[i];
            i++;
            ix++;
        }
        while (j < n) {
            arr3[ix] = arr2[j];
            j++;
            ix++;
        }

        return arr3;

    }

    public static boolean issmaller(String s1, String s2) {
        if (s1.compareTo(s2) < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        String str[] = {"sun", "earth", "mars", "mercury"};
        String a[] = m_sort(str, 0, str.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        basic_sort(str);

        //Count and return mejority element.
        int arr[] = {2, 2, 1, 1, 1, 2, 2};
        System.out.println();
        System.out.println("Count mejority element function");
        System.out.println(majority_element_basic(arr));
        System.out.println("Count mejority element recursively");
        System.out.println(majorityCount_Rec(arr, 0, arr.length - 1));

    }
}
