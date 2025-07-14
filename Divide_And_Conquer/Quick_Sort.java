
public class Quick_Sort {

    public static void q_sort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int pix = partition(arr, si, ei);
        q_sort(arr, si, pix - 1);
        q_sort(arr, pix + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {

        int pivet = arr[ei];
        int i = si - 1;//to make place for smaller element

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivet) {
                i++;
                //swap;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        //swap;
        int temp = pivet;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        int arr[] = {6, 3, 9, 5, 2, 8};
        q_sort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
