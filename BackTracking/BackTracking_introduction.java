
public class BackTracking_introduction {

    public static void StringSubset(String str, int i, String ans) {

        //base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }

            return;
        }

        //two choice to be add ot not to be add;
        char c = str.charAt(i);
        StringSubset(str, i + 1, ans + c);//To be add;
        StringSubset(str, i + 1, ans);

    }

    public static void changeArr(int arr[], int i, int val) {
        //Base case;

        if (i == arr.length) {
            printArr(arr);
            return;
        }
        arr[i] = val;
        changeArr(arr, i + 1, val + 1);//recursion 
        arr[i] = arr[i] - 2; //BackTracking

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
        System.out.println("StringSubset Function ");
        String str = "abc";
        StringSubset(str, 0, "");

    }
}
