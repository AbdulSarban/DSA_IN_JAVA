
import java.util.*;

public class intro {

    public static void swap(ArrayList<Integer> list, int i1, int i2) {
        int temp = list.get(i1);
        list.set(i1, list.get(i2));
        list.set(i2, temp);

    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        ArrayList<Integer> list = new ArrayList<>();
        Integer e = 10;
        list.add(e);
        System.out.println(list);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        System.out.println("Element at 2nd index: " + list.get(2));
        System.out.println("Element at 0th index :" + list.get(0));
        //remove
        list.remove(2);
        System.out.println("After removal: " + list);//linear complexity
        list.set(2, 30);
        System.out.println(list);
        System.out.println("Contains method :" + list.contains(10));
        System.out.println("Contains method :" + list.contains(40));

        list.add(3, 40);
        System.out.println("Add at specific index: " + list);

        System.out.println("ArrayList size :" + list.size());
        System.out.println("Traverse using size metod");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        //reverse
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        int max = Integer.MIN_VALUE;
        System.out.println(max);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println("Max: " + max);
        int min = Integer.MAX_VALUE;
        System.out.println(min);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        System.out.println("Min: " + min);
        //swap
        int i1 = 1;
        int i3 = 3;
        // int temp=list.get(i1);
        // list.get(i1)=list.get(i3);
        // list.get(i3)=temp;
        System.out.println(list);
        swap(list, i1, i3);
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(1);
        list2.add(2);
        list2.add(8);
        list2.add(4);
        list2.add(6);
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);
        //desending
        Collections.sort(list2, Collections.reverseOrder());
        System.out.println(list2);

        System.out.println("Multidimensional ArrayList");
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(2);
        l2.add(4);
        l2.add(6);
        l2.add(8);
        l2.add(10);

        ArrayList<Integer> l3 = new ArrayList<>();
        l3.add(3);
        l3.add(6);
        l3.add(9);
        l3.add(12);
        l3.add(15);

        mainList.add(l1);
        mainList.add(l2);
        mainList.add(l3);
        System.out.println(mainList);
        System.out.println("Mainlist by for loop");
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> current = mainList.get(i);
            for (int j = 0; j < current.size(); j++) {
                System.out.print(current.get(j) + " ");
            }
            System.out.println();
        }

    }
}
