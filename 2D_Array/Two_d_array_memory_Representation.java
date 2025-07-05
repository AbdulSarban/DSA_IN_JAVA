
public class Two_d_array_memory_Representation {

    public static void main(String[] args) {
        System.out.println("Hello");

        int a[] = {1, 2, 3};
        int b[] = {4, 5, 6};
        int c[] = {7};

        int two_d_Array[][] = {a, b, c};

        System.out.println("Display array");

        for (int i = 0; i < two_d_Array.length; i++) {
            for (int j = 0; j < two_d_Array[i].length; j++) {
                System.out.print(two_d_Array[i][j]);
            }
            System.out.println();
        }
    }
}
