
public class Spiral_Matrix {

    public static void spiral_matrix_display(int arr[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length - 1;
        int endCol = arr[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            //top we will use i==> row , j==>col
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(arr[startRow][j] + " ");
            }
            //right

            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }
            //bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (endCol == startCol) {
                    break;
                }
                System.out.print(arr[endRow][j] + " ");
            }
            //right
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (endRow == startRow) {
                    break;
                }
                System.out.print(arr[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;

        }

        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Hello Horld");

        int arr[][] = {{1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}

        };

        spiral_matrix_display(arr);
    }
}
