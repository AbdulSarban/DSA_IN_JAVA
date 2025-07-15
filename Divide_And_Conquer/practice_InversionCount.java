
public class practice_InversionCount {
    //merge sort approch

    public static int merge(int arr[], int left, int mid, int right) {
        int in_Count = 0;
        int i = left;
        int j = mid;
        int k = 0;
        int temp[] = new int[right - left + 1];

        while (i < mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                in_Count += (mid - i);  // Count inversions
            }
        }

        while (i < mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {  // ✅ Fixed this line
            temp[k++] = arr[j++];
        }

        for (i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }

        return in_Count;
    }

    public static int m_sort(int arr[], int left, int right) {
        int in_Count = 0;
        if (left < right) {
            int mid = left + (right - left) / 2;

            in_Count += m_sort(arr, left, mid);
            in_Count += m_sort(arr, mid + 1, right);
            in_Count += merge(arr, left, mid + 1, right);  // right half starts at mid+1
        }
        return in_Count;
    }

    public static int inverseCount_basic(int arr[]) {

        int in_count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    in_count++;
                }
            }
        }
        return in_count;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        int arr[] = {1, 20, 6, 4, 5};
        System.out.println("Inverse Count by basic");
        System.out.println("" + inverseCount_basic(arr));
        System.out.println("Inverse Count by Recursion");
        System.out.println("" + m_sort(arr, 0, arr.length - 1));
    }
}
