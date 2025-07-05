
public class Digonal_sum {

    public static int Optimised_digonal_sum(int arr[][]) {
        int sum = 0;
        //linear approch
        for (int i = 0; i < arr.length; i++) {
            //pd =>> i==j
            sum += arr[i][i];

            if (i != (arr.length - i - 1)) {
                sum += arr[i][(arr.length - i - 1)];
            }
        }

        return sum;
    }

    public static int digonal_sum(int arr[][]) {

        int sum = 0;
        int sum2 = 0;
        //primary sum
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                } else if (i + j == arr.length - 1) {
                    sum += arr[i][j];
                }
            }
        }

        //secondary sum
        /* 
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[0].length; j >= 0; j--) {
                if (i == j) {
                    sum2 += arr[i][j];
                }
            }

        }

        return sum + sum2;
         */
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Hello world");

        int arr[][] = {{1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}

        };

        System.out.println("Digonal sum function ");
        System.out.println("Digonal sum: " + digonal_sum(arr));

        System.out.println("Optimisized Digonal sum function ");
        System.out.println("Digonal sum: " + Optimised_digonal_sum(arr));

    }
}
