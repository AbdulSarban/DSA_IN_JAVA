
public class String_Compare_greater {

    public static String String_Compare(String str[]) {
        String greatest = str[0];

        for (int i = 0; i < str.length; i++) {

            if (greatest.compareTo(str[i]) < 0) {
                greatest = str[i];
            }
        }
        return greatest;
    }

    public static String String_Compare_ignore_case(String str[]) {
        String gr = str[0];

        for (int i = 0; i < str.length; i++) {
            if (gr.compareToIgnoreCase(str[i]) < 0) {
                gr = str[i];
            }
        }
        return gr;

    }

    public static void main(String[] args) {
        System.out.println("Hello world");

        String fruits[] = {"apple", "mango", "banana"};
        System.out.println("Greatest string: " + String_Compare(fruits));
        //Comarision is performed in lexographic order i.e. Alphabetical order.

        String fruits_Capital[] = {"apple", "Mango", "Banana"};

        System.out.println("Greatest string: " + String_Compare(fruits_Capital));

        System.out.println("======== String_Compare_ignore_case() method ========");
        System.out.println("Greatest String: " + String_Compare_ignore_case(fruits_Capital));
    }
}
