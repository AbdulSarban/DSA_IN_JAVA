
public class backtrack_intro {

    public static void strSubset(String str, int i, String ans) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("Null");
            } else {
                System.out.println(ans + " ");
            }
            return;
        }
        char c = str.charAt(i);
        strSubset(str, i + 1, ans + c);
        strSubset(str, i + 1, ans);
    }

    public static void changeArr(int arr[], int i, int val) {
        if (i == arr.length) {
            printArr(arr);
            return;
        }

        arr[i] = val;
        changeArr(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
        String str = "abc";
        strSubset(str, 0, "");
    }
}
