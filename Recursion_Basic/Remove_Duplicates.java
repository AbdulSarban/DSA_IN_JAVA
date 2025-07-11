
public class Remove_Duplicates {

    public static void remove_duplicate_a_to_z(String str, int index, StringBuilder newstr, boolean[] map) {

        if (index == str.length()) {
            System.out.println(newstr);
            return;
        }

        char currentChar = str.charAt(index);

        if (map[currentChar - 'a'] == true) {
            remove_duplicate_a_to_z(str, index + 1, newstr, map);
        } else {
            map[currentChar - 'a'] = true;
            remove_duplicate_a_to_z(str, index + 1, newstr.append(currentChar), map);

        }

    }

    public static void remove_duplicate_a_to_z_loop(String str) {

        boolean map[] = new boolean[26];
        StringBuilder newstr = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);

            int ix = current - 'a';
            if (!map[ix]) {//not true;
                map[ix] = true;
                newstr.append(current);
            }
        }
        System.out.println(newstr);
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        String str = "appnnacollege";
        remove_duplicate_a_to_z(str, 0, new StringBuilder(""), new boolean[26]);
        remove_duplicate_a_to_z_loop(str);
    }
}
