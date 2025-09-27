// package ArrayList;

import java.util.*;

public class Water_Container {

    public static void pairSum2(ArrayList<Integer> arr, int target) {
        int b = -1;
        int n = arr.size();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > arr.get(i + 1)) {
                b = i;
                break;
            }
        }
        int l = b + 1;
        int r = b;
        while (l != r) {
            if (arr.get(l) + arr.get(r) == target) {
                System.out.println("Taget: " + target + " Obtained from index: " + l + " And " + r + " with values: " + arr.get(l) + " And " + arr.get(r));
            }
            if (arr.get(l) + arr.get(r) < target) {
                l = (l + 1) % n;

            } else {
                r = (n + r - 1) % n;
            }
        }
    }

    public static void optimisePairSum(ArrayList<Integer> arr, int target) {
        int l = 0;
        int r = arr.size() - 1;
        while (l != r) {
            if (arr.get(l) + arr.get(r) == target) {
                System.out.println("Taget: " + target + " Obtained from index: " + l + " And " + r + " with values: " + arr.get(l) + " And " + arr.get(r));
            }
            if (arr.get(l) + arr.get(r) < target) {
                l++;
            } else {
                r--;
            }
        }
    }

    public static void pairSum(ArrayList<Integer> arr, int target) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == target) {
                    System.out.println("Taget: " + target + " Obtained from index: " + i + " And " + j + " with values: " + arr.get(i) + " And " + arr.get(j));
                }
            }
        }
    }

    public static int optimize_storeWater(ArrayList<Integer> height) {
        int max = 0;
        int l = 0;
        int r = height.size() - 1;
        while (l < r) {
            int h = Math.min(height.get(l), height.get(r));
            int w = r - l;
            int water = h * w;
            // if (max < water) {
            //     max = water;
            // }
            max = Math.max(max, water);

            if (height.get(l) < height.get(r)) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }

    // static int max = Integer.MIN_VALUE;
    public static int storeWater(ArrayList<Integer> height) {
        int max = 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int h = (int) Math.min(height.get(i), height.get(j));
                int w = j - i;
                int water = h * w;
                if (water > max) {
                    max = water;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(height);

        // for (int i = 0; i < height.size(); i++) {
        //     for (int j = i + 1; j < height.size(); j++) {
        //         int h = (int) Math.min(height.get(i), height.get(j));
        //         int w = j - i;
        //         int water = h * w;
        //         if (water > max) {
        //             max = water;
        //         }
        //     }
        // }
        System.out.println("Maximum water: " + storeWater(height));
        System.out.println("Maximum water Using 2 pointer approach: " + optimize_storeWater(height));
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            arr.add(i);
        }
        System.out.println(arr);
        pairSum(arr, 5);
        System.out.println("Pair sum optimise approach");
        optimisePairSum(arr, 5);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println("======== PairSum2: Sorted and Rotated =========");
        pairSum2(list, 16);

    }
}
