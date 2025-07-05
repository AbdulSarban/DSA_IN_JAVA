
public class String_Compression {

    public static String Compress_String(String str) {
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;//if we only declare count outside ,
            //not reset in for loop then count will increse , and give incorrect output.

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {

                i++;
                count++;
            }
            newStr += str.charAt(i);

            if (count > 1) {
                newStr += count.toString();
            }

        }

        return newStr;
    }

    public static String String_Builder_Compress(String str) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                i++;
                count++;
            }
            sb.append(str.charAt(i));

            if (count > 1) {
                sb.append(count.toString());
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        String str = "aaaaabcd";
        System.out.println("String Compress function: " + Compress_String(str));

        System.out.println("String Compress function using StringBuilder: " + String_Builder_Compress(str));

    }
}
