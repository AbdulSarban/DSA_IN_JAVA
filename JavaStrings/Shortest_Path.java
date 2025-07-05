
public class Shortest_Path {

    public static float Shortest_Direction_Path(String str) {

        int x = 0;
        int y = 0;

        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);
            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'W') {
                x--;
            } else if (dir == 'E') {
                x++;
            }
        }

        int X2 = x * x;
        int Y2 = y * y;

        return (float) (Math.sqrt(X2 + Y2));
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        String str = "WNEENESENNN";
        System.out.println(Shortest_Direction_Path(str));
    }
}
