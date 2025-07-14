
import java.util.*;

public class Practice_Question {

    public static int first = -1;
    public static int last = -1;
    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void num_to_word(int number) {
        if (number == 0) {
            return;
        }

        int lastdigit = number % 10;
        num_to_word(number / 10);
        //int lastdigit = number % 10;
        System.out.print(digits[lastdigit] + " ");

    }

    public static void keyboard_combination(String str, int ix, String combination) {

        if (ix == str.length()) {
            System.out.println(combination);
            return;
        }

        char current_char = str.charAt(ix);
        String mapping = keypad[current_char - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            keyboard_combination(str, ix + 1, combination + mapping.charAt(i));
        }
    }

    public static void printSubsequence_modify(String str, int ix, String newstr, HashSet<String> set) {

        if (ix == str.length()) {
            if (set.contains(newstr)) {
                return;
            } else {
                System.out.println(newstr);
                set.add(newstr);
                return;
            }
        }

        char current_char = str.charAt(ix);
        //to be add
        printSubsequence_modify(str, ix + 1, newstr + current_char, set);
        //not to be add
        printSubsequence_modify(str, ix + 1, newstr, set);

    }

    public static void printSubsequence(String str, int ix, String newstr) {

        if (ix == str.length()) {
            System.out.println(newstr);
            return;
        }

        char current_char = str.charAt(ix);
        //to be add
        printSubsequence(str, ix + 1, newstr + current_char);
        //not to be add
        printSubsequence(str, ix + 1, newstr);

    }

    public static void movex(String str, int ix, int count, String newstr) {
        if (ix == str.length()) {
            for (int i = 0; i < count; i++) {
                newstr += "x";
            }
            System.out.println(count);
            System.out.println(newstr);
            return;
        }

        char current_char = str.charAt(ix);
        if (current_char == 'x') {
            count++;
            movex(str, ix + 1, count, newstr);
        } else {
            newstr += current_char;
            movex(str, ix + 1, count, newstr);
        }
    }

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
        System.out.println("Move x at the end");
        String s2 = "axbxcxd";
        movex(s2, 0, 0, "");

        System.out.println("======== Print Subsequence ========");
        String s3 = "abc";
        printSubsequence(s3, 0, "");
        String s4 = "aaa";
        printSubsequence(s4, 0, "");
        System.out.println("======== Print Subsequence modified function ========");
        HashSet<String> set = new HashSet();
        printSubsequence_modify(s4, 0, "", set);
        System.out.println("======== keyboard_combination function ========");
        String s5 = "23";
        keyboard_combination(s5, 0, "");
        System.out.println("2nd Combination");
        keyboard_combination("45", 0, "");
        System.out.println("======== num_to_word function ========");
        num_to_word(1234);
        System.out.println();

    }
}
