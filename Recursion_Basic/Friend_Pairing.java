
public class Friend_Pairing {

    public static int friend_pair(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        int fnm1 = friend_pair(n - 1);
        int fnm2 = friend_pair(n - 2);
        int pairway = (n - 1) * fnm2;

        int toatal_way = fnm1 + pairway;
        return toatal_way;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Toatl ways: " + friend_pair(3));
    }
}
