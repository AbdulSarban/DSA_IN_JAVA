
public class Practice_Question {

    public static int first = -1;
    public static int last = -1;

    public static void occurence(String str, int ix, char key) {

        if (ix == str.length()) {
            System.out.println("First occurence: " + first);
            System.out.println("Last occurence: " + last);
            return;

        }

        char currentChar = str.charAt(ix);
        if (currentChar == key) {
            if (first == -1) {
                first = ix;
            } else {
                last = ix;
            }
        }
        occurence(str, ix + 1, key);

    }

    public static void f_occurence(int arr[], int ix, int key) {
        if (ix == arr.length) {
            return;
        }
        if (arr[ix] == key) {
            System.out.println(ix);
            return;
        }
        f_occurence(arr, ix + 1, key);

    }

    public static void l_occurence(int arr[], int ix, int key) {
        if (ix == arr.length) {
            return;
        }
        l_occurence(arr, ix + 1, key);
        if (arr[ix] == key) {
            System.out.println(ix);
            return;
        }
    }

    public static void strReverse(String str, int n) {
        // int count=0;
        String newstr = "";
        if (n == str.length()) {
            return;
        }

        //work
        strReverse(str, n + 1);
        newstr += str.charAt(n);
        System.out.print(newstr);
        /*Another logic can used by using str.length()-1 as index then first add char at index 
         * to the newstr then make call to the function.
         */

    }

    public static void towerOfHanoi(int n, String src, String help, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n - 1, src, dest, help);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n - 1, help, src, dest);
    }

    public static void printkey(int arr[], int i, int key) {
        int count = 0;
        if (i == arr.length) {
            return;
        }

        if (arr[i] == key) {
            count++;
            System.out.println(i);
        }
        printkey(arr, i + 1, key);
    }

    public static void printfibo(int a, int b, int n) {
        if (n == 0) {
            return;
        }

        int c = a + b;
        System.out.print(c + " ");
        printfibo(b, c, n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("======== Print key occurence ========");
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        printkey(arr, 0, 2);
        System.out.println("======== Print fibbonacci series ========");
        int a = 0;
        int b = 1;

        System.out.print(a + " " + b + " ");
        printfibo(0, 1, 5);
        System.out.println();
        System.out.println("======== Tower of hanoi ========");
        towerOfHanoi(3, "A", "B", "C");
        strReverse("abcd", 0);
        System.out.println();

        System.out.println("======== First occurence ========");
        int arr2[] = {1, 2, 3, 5, 6, 2, 7, 8};
        f_occurence(arr2, 0, 2);
        System.out.println("======== Second occurence ========");
        l_occurence(arr2, 0, 2);
        System.out.println("======== First and last Occurence in String ========");
        String s1 = "aabcdaahiah";
        occurence(s1, 0, 'a');
    }
}
