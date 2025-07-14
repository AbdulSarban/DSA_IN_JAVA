
public class Merge_Sort {

    public static void m_sort(int arr[], int si, int ei) {
        if (si >= ei) {

            return;
        }

        int mid = si + (ei - si) / 2;

        m_sort(arr, si, mid);
        m_sort(arr, mid + 1, ei);
        merge(arr, si, ei, mid);

    }

    public static void merge(int arr[], int si, int ei, int mid) {

        int temp[] = new int[ei - si + 1];
        //+1 because it is 0 based indexing.
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {

            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //remaining elements 
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (int x = 0, y = si; x < temp.length; x++, y++) {
            arr[y] = temp[x];
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("======== merge sort ========");
        int arr[] = {6, 3, 9, 5, 2, 8};
        m_sort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
