
import java.util.*;

public class Practice_Question {

    public static void Check_Anagrams(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {
            char s1[] = str1.toCharArray();
            char s2[] = str2.toCharArray();
            Arrays.sort(s1);
            Arrays.sort(s2);
            boolean result = Arrays.equals(s1, s2);
            if (result) {
                System.out.println(str1 + " and " + str2 + " are Anagrams");
            } else {
                System.out.println(str1 + " and " + str2 + " are Not Anagrams");

            }
        } else {
            System.out.println(str1 + " and " + str2 + " are Not Anagrams");
        }

    }

    public static int Count_Lowercase_Vovels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        String str = "abdul";
        System.out.println("LowerCase Voveles: " + Count_Lowercase_Vovels(str));
        //2nd problem
        String str1 = "shradhadidi";
        String str2 = "apnacollege";
        String str3 = "shradhadidi";
        System.out.println(str1.equals(str2) + " " + str1.equals(str3));
        //3rd problem 
        String str4 = "ApnaCollege".replace("l", " ");
        System.out.println(str4);
        //4th problem: Check Angrams
        System.out.println("Function to check Anagrams");
        String str5 = "Race";
        String str6 = "Care";
        Check_Anagrams(str5, str6);

    }
}
