
public class String_Builder {

    public static void main(String[] args) {
        System.out.println("Hello world");
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println("Sb object: " + sb);
        System.out.println("sb length: " + sb.length());

        System.out.println("chatAt() function: " + sb.charAt(1));
        System.out.println("substring() function: " + sb.substring(0, 18));
        System.out.println("reverse() function: " + sb.reverse());
        System.out.println("reversed substring: " + sb.substring(0, 18));

        System.out.println("toString() function: " + sb.toString());
    }
}
