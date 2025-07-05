
public class Substring {

    public static String String_Substring(String str, int si, int ei) {
        String s = "";
        for (int i = si; i < ei; i++) {
            s += str.charAt(i);
        }
        return s;
    }

    public static String String_Immutable() {
        String str = "Tony";

        char ch;
        for (ch = 'a'; ch <= 'z'; ch++) {
            str += ch;
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
        String str = "HelloWorld";

        System.out.println("Substring without built in function: " + String_Substring(str, 0, 5));

        System.out.println("Built in method: " + str.substring(0, 5));

        System.out.println("Why string immutable");
        System.out.println(String_Immutable());//take O(n^2) time complexity.
        //Due to this Use StringBuilder instead of String.

    }
}
