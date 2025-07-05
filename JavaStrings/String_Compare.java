
public class String_Compare {

    public static void main(String[] args) {
        System.out.println("Hello world");

        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
        String s4 = new String("Tony");

        if (s1 == s2) {
            System.out.println("Strings are equal");

        } else {
            System.out.println("Strings are not equal");
        }

        if (s1 == s3) {
            System.out.println("Strings are equal");

        } else {
            System.out.println("Strings are not equal");
        }

        if (s3 == s4) {
            System.out.println("Strings are equal");

        } else {
            System.out.println("Strings are not equal");
        }

        //This( == ) compares the string at the object level
        //s1 and s2 points the same string
        //while due to new word method s3 will point to another string
        //Anothor useful method is there which call .equals() method
        System.out.println("========Compare using eqauals() method========");
        if (s1.equals(s3)) {
            System.out.println("Strings are equal");

        } else {
            System.out.println("Strings are not equal");
        }

        if (s3.equals(s4)) {
            System.out.println("Strings are equal");

        } else {
            System.out.println("Strings are not equal");
        }

    }
}
