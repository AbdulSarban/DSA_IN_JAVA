
public class Bulb_Problem {

    public static void main(String[] args) {
        System.out.println("Hello World");
        String str = "HHCHHHH";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'H') {
                count++;
            }
        }
        System.out.println("Count: " + count);

        int arr[] = {1, 2, 3, 4, 5};
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[j] = arr[j] * 2;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
