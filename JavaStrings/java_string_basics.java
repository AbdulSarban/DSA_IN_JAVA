//package JavaStrings;
//package JavaStrings;

import java.util.*;

public class java_string_basics {

    public static void PrintLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        //String Declaration
        char ch[] = {'a', 'b', 'c', 'd'};
        String str1 = "abcd";
        String str2 = new String("abcd");

        //String has a special property i.e. Strings are immutable
        //it means we can not make changes in original string 
        //changes can be saved in the new string.
        //Display String
        for (char i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }
        System.out.println();

        System.out.println(str1);
        System.out.println(str2);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = sc.next();
        sc.nextLine();
        //next() function help to obtain single word from the user.

        //But we can use nextLine() function to take a complete line fro the user.
        System.out.println("You entered: " + name);
        System.out.println("Enter complete name");
        /*  ou're using sc.next() to read a word, and then immediately calling sc.nextLine() to read a full line:

            
            String name = sc.next();           // reads until space
            String Complete_name = sc.nextLine(); // reads leftover '\n'
            This will cause Complete_name to be empty, because nextLine() will consume the newline character left by next().

            ✅ Solution: Add an extra sc.nextLine() after sc.next() to consume the leftover newline: 
         */
        String Complete_name = sc.nextLine();
        System.out.println("You enterd : " + Complete_name);

        //
        System.out.println("String Length function");

        System.out.println("Length of Complete_name string is : " + Complete_name.length());

        System.out.println("String Concadination ");

        String s1 = "Virat";
        String s2 = "Kohli";
        String Combine = s1 + " " + s2;
        System.out.println(Combine);

        System.out.println("CharAt() function tp obtain charecter at specific position");
        System.out.println("Char in s1 at 0th index is " + s1.charAt(0));

        System.out.println("PrintLetters()  function ==> to print all leters in string ");
        PrintLetters(Combine);

    }
}
