
public class Cal_Power {

    public static int optimized_power(int x, int n) {

        if (n == 0) {
            return 1;
        }

        //int power_sq=optimized_power(x,n/2)*optimized_power(x,n/2);
        int power = optimized_power(x, n / 2);
        int power_sq = power * power;

        if (n % 2 != 0) {
            return x * power_sq;
        }
        return power_sq;
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int power_nm1 = power(x, n - 1);
        int power_n = x * power_nm1;
        return power_n;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        int x = 10;
        int n = 3;
        System.out.println(n + " th power of " + x + " Is: " + power(x, n));
        System.out.println("Optimized Power function");
        System.out.println(n + " th power of " + x + " Is: " + optimized_power(x, n));
    }
}
