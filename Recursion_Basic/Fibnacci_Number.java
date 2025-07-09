
public class Fibnacci_Number {

    public static int fibo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int fnm1 = fibo(n - 1);
        int fnm2 = fibo(n - 2);
        int fn = fnm1 + fnm2;

        return fn;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        int n = 3;
        System.out.println(n + " th fibonacci number: " + fibo(n));
    }
}
