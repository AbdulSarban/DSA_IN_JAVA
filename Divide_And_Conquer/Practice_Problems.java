
public class Practice_Problems {

    public static String[] m_sort(String[] str, int si, int ei) {
        //base case;

        if (si == ei) {
            String[] a = {str[si]};
            return a;
        }

        int mid = si + (ei - si) / 2;
        String[] arr1 = m_sort(str, si, mid);
        String[] arr2 = m_sort(str, mid + 1, ei);

        String[] arr3 = merge(arr1, arr2);
        return arr3;

    }

    public static String[] merge(String[] arr1, String[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        String arr3[] = new String[m + n];

        int ix = 0;
        int i = 0;
        int j = 0;

        while (i < m && j < n) {

            if (issmaller(arr1[i], arr2[j])) {

                arr3[ix] = arr1[i];
                i++;
                ix++;
            } else {
                arr3[ix] = arr2[j];
                j++;
                ix++;
            }
        }

        while (i < m) {
            arr3[ix] = arr1[i];
            i++;
            ix++;
        }
        while (j < n) {
            arr3[ix] = arr2[j];
            j++;
            ix++;
        }

        return arr3;

    }

    public static boolean issmaller(String s1, String s2) {
        if (s1.compareTo(s2) < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        String str[] = {"sun", "earth", "mars", "mercury"};
        String a[] = m_sort(str, 0, str.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
