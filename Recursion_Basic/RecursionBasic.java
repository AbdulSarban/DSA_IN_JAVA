
public class RecursionBasic {

    public static void printDec(int n) {
        if (n == 1) {
            System.out.print(n);
            return;

        }
        //print n
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }

        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Numbers in decending order");
        int n = 10;
        printDec(n);
        System.out.println();
        System.out.println("Numbers in Assending order");
        printInc(n);
        System.out.println();
    }
}
