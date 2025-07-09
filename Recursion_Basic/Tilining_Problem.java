
public class Tilining_Problem {

    public static int Tiling_ways(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }
        int nm1 = Tiling_ways(n - 1);
        int nm2 = Tiling_ways(n - 2);
        int total_tile = nm1 + nm2;
        return total_tile;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Total ways: " + Tiling_ways(1));
    }
}
