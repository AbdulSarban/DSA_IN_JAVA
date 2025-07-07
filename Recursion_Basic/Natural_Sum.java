
public class Natural_Sum {

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int nm1_sum = sum(n - 1);
        int nsum = n + nm1_sum;
        return nsum;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        int n = 100;
        System.out.println("Sum of first " + n + " Numbers is: " + sum(n));
    }
}
