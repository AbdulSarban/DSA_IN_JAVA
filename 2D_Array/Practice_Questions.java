
public class Practice_Questions {

    public static void display(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int find_itration(int arr[][], int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == key) {
                    count++;
                }
            }

        }
        return count;

    }

    public static int row_sum(int arr[][], int row) {
        int sum = 0;

        for (int j = 0; j < arr[0].length; j++) {
            sum += arr[row][j];
        }

        return sum;
    }

    public static void Matrix_Transpose(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;

        int m[][] = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                m[j][i] = arr[i][j];
            }
        }

        //display
        /*for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
         */
        display(m);

    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        int arr1[][] = {{4, 7, 8}, {8, 8, 7}};
        System.out.println("Element fount " + find_itration(arr1, 8) + " times");

        int arr2[][] = {{1, 4, 9}, {11, 4, 3}, {2, 2, 3}};
        System.out.println("Sum of elements in 1st row " + row_sum(arr2, 1));
        System.out.println("Sum of elements in 2nd row " + row_sum(arr2, 2));
        System.out.println("Sum of elements in 0th row " + row_sum(arr2, 0));

        int arr3[][] = {{1, 2, 3}, {3, 4, 5}};
        System.out.println("Actual Array");
        display(arr3);
        System.out.println("Trnspose of array ");
        Matrix_Transpose(arr3);

    }
}
