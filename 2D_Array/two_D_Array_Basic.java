
import java.util.*;

public class two_D_Array_Basic {

    public static void min(int arr[][]) {
        int min_num = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] < min_num) {
                    min_num = arr[i][j];
                }
            }
        }
        System.out.println("Minimum element is: " + min_num);
    }

    public static void max(int arr[][]) {
        int m = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > m) {
                    m = arr[i][j];
                }
            }
        }
        System.out.println("Maximum element is: " + m);
    }

    public static boolean search(int arr[][], int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    System.out.println("Element at row= " + i + " ,col= " + j);
                    return true;

                }
            }

        }
        System.out.println("Element not found");
        return false;
    }

    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("Representation of 2d array");

        int arr[][] = {{1, 2}, {3, 4}, {5, 6}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        System.out.println("2D array from user input");
        System.out.println("Enter the elements in array");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("array display");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Search of element in array function");
        search(matrix, 1);
        System.out.println("Maximum element in array function");
        max(matrix);
        System.out.println("Minimum element in array function");
        min(matrix);

    }
}
