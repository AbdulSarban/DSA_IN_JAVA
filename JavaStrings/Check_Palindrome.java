//package JavaStrings;

public class Check_Palindrome {

    public static boolean Palindrome_optimized(String str) {

        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                System.out.println("String " + str + " is Not a Palindrome");
                return false;
            }
        }
        System.out.println("String " + str + " is a palindrome");
        return true;
    }

    public static boolean Palindrome(String str) {

        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("String " + str + " is Not a Palindrome");
                return false;
            }
        }

        System.out.println("String " + str + " is Palindrome");
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Hello world");

        String str = "racecar";
        Palindrome(str);
        String str2 = "markram";
        Palindrome(str2);
        String num_str = "12212";
        Palindrome(num_str);

        System.out.println("================Palindrome_optimized function ===============");
        Palindrome_optimized(str);
        Palindrome_optimized(str2);
        Palindrome_optimized(num_str);
    }
}
