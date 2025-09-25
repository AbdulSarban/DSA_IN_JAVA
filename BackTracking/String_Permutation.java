
public class String_Permutation {

    public static void Permutation(String str, String ans) {
        //base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        //recursion
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            String Newstr = str.substring(0, i) + str.substring(i + 1);//remove ith i.e. placed element.
            Permutation(Newstr, ans + current);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        String str = "abc";
        Permutation(str, "");
    }
}
