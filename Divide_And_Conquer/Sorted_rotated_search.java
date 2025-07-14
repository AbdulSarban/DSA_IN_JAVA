
public class Sorted_rotated_search {

    public static int search(int arr[], int tar, int si, int ei) {

        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        if (arr[mid] == tar) {
            return mid;
        }
        //mid on L1

        if (arr[si] <= arr[mid]) {
            //case a: left of mid
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            } //case b:right of mid
            else {
                return search(arr, tar, mid + 1, ei);
            }
        } else {
            //case c: right of L2 mid
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } //case d: left of L2 mid
            else {
                return search(arr, tar, si, mid - 1);
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int tar = 5;
        int tarix = search(arr, tar, 0, arr.length - 1);
        System.out.println("Target at : " + tarix);
    }
}
