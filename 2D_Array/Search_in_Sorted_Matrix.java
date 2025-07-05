
public class Search_in_Sorted_Matrix {

    public static void Linear_Search(int arr[][], int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == key) {
                    System.out.println("Element found at cell (" + i + "," + j + ")");
                }
            }
        }

    }

    public static boolean Staircase_Search_top_position(int arr[][], int key) {
        int row = 0;
        int col = arr.length - 1;

        while (row < arr.length && col > 0) {
            if (arr[row][col] == key) {
                System.out.println("Element found at (" + row + "," + col + ")");
                return true;
            } else if (key < arr[row][col]) {
                //move left
                col--;
            } else {
                //move down
                row++;
            }
        }
        System.out.println("Element not found");
        return false;
    }

    public static boolean Staircase_Search_bottom_position(int arr[][], int key) {

        int row = arr.length - 1;
        int col = 0;

        while (row >= 0 && col < arr[0].length) {//yaha row=0 consider karni padegi

            if (arr[row][col] == key) {
                System.out.println("Element found at (" + row + "," + col + ")");
                return true;
            } else if (key < arr[row][col]) {
                row--;
            } else {
                col++;
            }

        }
        System.out.println("Element not found");
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        int arr[][] = {{10, 20, 30, 40},
        {15, 25, 35, 45},
        {27, 29, 37, 48},
        {32, 33, 39, 50}
        };
        System.out.println("Linerar Search function");
        Linear_Search(arr, 29);
        System.out.println("Staircase_Search_top_position function");
        Staircase_Search_top_position(arr, 33);
        Staircase_Search_top_position(arr, 50);
        System.out.println("Staircase_Search_bottom_position function");
        Staircase_Search_bottom_position(arr, 40);

    }

}
