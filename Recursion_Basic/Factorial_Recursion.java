
public class Factorial_Recursion {

    public static int fac(int n) {
        if (n == 0) {
            return 1;
        }

        int fn_1 = fac(n - 1);
        int fn = n * fn_1;
        return fn;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        int n = 5;
        System.out.println("Fctorial of " + n + " is : " + fac(n));
    }
}
