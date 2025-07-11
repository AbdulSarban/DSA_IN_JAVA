
public class Binary_String {

    public static void print_Binary_String(int n, int lastPlace, String str) {

        if (n == 0) {
            System.out.println(str);
            return;
        }

        print_Binary_String(n - 1, 0, str + "0");
        if (lastPlace == 0) {

            print_Binary_String(n - 1, 1, str + "1");
        }

    }

    public static void print_Binary_String_non_conc_0(int n, int lp, String str) {

        if (n == 0) {
            System.out.println(str);
            return;
        }
        print_Binary_String_non_conc_0(n - 1, 1, str + "1");

        if (lp == 1) {
            print_Binary_String_non_conc_0(n - 1, 0, str + "0");
        }

    }

    public static void print_Binary_String_all_valid(int n, int lp, String str) {

        if (n == 0) {
            System.out.println(str);
            return;
        }
        print_Binary_String_all_valid(n - 1, 0, str + "0");
        print_Binary_String_all_valid(n - 1, 1, str + "1");

    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("======== Non 1 consicitive ========");
        System.out.println("Lastplace : 0");
        print_Binary_String(3, 0, "");
        System.out.println("Lastplace : 1");
        print_Binary_String(3, 1, "");

        System.out.println("======== Non 0 consicitive ========");
        System.out.println("Lastplace : 1");

        print_Binary_String_non_conc_0(3, 1, "");

        System.out.println("Lastplace : 0");
        print_Binary_String_non_conc_0(3, 0, "");

        System.out.println("=========== All valid ===========");
        System.out.println("Lastplace : 0");
        print_Binary_String_all_valid(3, 0, "");
        System.out.println("Lastplace : 1");
        print_Binary_String_all_valid(3, 1, "");

    }
}
