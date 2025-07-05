
public class Shorted_String_Path {

    public static float short_distance(String dir) {

        int len = dir.length();
        int x = 0, y = 0;
        for (int i = 0; i < len; i++) {
            if (dir.charAt(i) == 'N') {
                y++;
            } else if (dir.charAt(i) == 'S') {
                y--;
            } else if (dir.charAt(i) == 'E') {
                x++;
            } else if (dir.charAt(i) == 'W') {
                x--;
            }

        }

        int x2 = x * x;
        int y2 = y * y;
        return (float) (Math.sqrt(x2 + y2));

    }

    public static void main(String[] args) {
        System.out.println("Hello java");

        System.out.println("Shortest path function");
        String dir = "EWEWEW";
        System.out.println("Shortest distance : " + short_distance(dir));

    }
}
