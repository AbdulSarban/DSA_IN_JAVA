
public class Recurcive_Search {

    public static int FirstOccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }
        return FirstOccurance(arr, key, i + 1);
    }

    public static int LastOccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = LastOccurance(arr, key, i + 1);

        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;

    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        int arr[] = {1, 2, 3, 4, 5, 12, 7, 8, 5, 9, 10};
        System.out.println("Element found at: " + FirstOccurance(arr, 5, 0));
        System.out.println("LastOccurance function");
        System.out.println(" " + LastOccurance(arr, 5, 0));
    }
}
