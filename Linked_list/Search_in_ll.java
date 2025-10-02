//package Linked_list;

public class Search_in_ll {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }

    public static void show() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public void search(int key) {
        Node temp = head;
        // for (int i = 0; i < size; i++) {
        //     if (temp.data == key) {
        //         System.out.println("Element : " + temp.data + " Found at index: " + i);
        //         temp = temp.next;
        //     }
        // }
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Element : " + temp.data + " Found at index: " + i);
            }
            i++;
            temp = temp.next;
        }

    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int indx = helper(head.next, key);
        if (indx == -1) {
            return -1;
        }
        return indx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);

    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;
    }

    public void removeNthnodeFromEnd(int n) {
        if (head == null) {
            return;
        }
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (n == sz) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return;
        }
        Node prev = head;
        int i = 1;
        int findNode = sz - n;
        while (i < findNode) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        // if (prev.next == null) {
        //     tail = prev;
        // }

    }

    public Node midNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public boolean palindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        //step 1: find mid
        Node midNode = midNode(head);

        //step 2:reverse 2nd half
        Node prev = null;
        Node curr = midNode.next;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //step 3:compare
        Node right = prev;
        Node left = head;
        while (right != null) {
            if (right.data != left.data) {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        Search_in_ll ll = new Search_in_ll();
        ll.addFirst(1);
        ll.show();
        System.out.println("Size: " + size);
        ll.addLast(2);
        ll.show();
        System.out.println("Size: " + size);
        System.out.println("Removed element:" + ll.removeFirst());
        ll.show();
        System.out.println("Size: " + size);
        ll.addFirst(1);
        ll.show();
        System.out.println("Size: " + size);
        System.out.println("Removed element: " + ll.removeLast());
        ll.show();
        System.out.println("Size: " + size);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.show();
        System.out.println("Size: " + size);
        ll.search(2);
        System.out.println("Index: " + ll.recSearch(3));
        ll.reverse();
        ll.show();
        System.out.println("Size: " + size);
        ll.removeNthnodeFromEnd(3);
        ll.show();
        System.out.println("Size: " + size);
        System.out.println(ll.palindrome());
        ll.show();
        Search_in_ll l2 = new Search_in_ll();
        // l2.addLast(1);
        // l2.addLast(2);
        // l2.addLast(2);
        // l2.addLast(1);   
        // l2.addFirst(1);
        // l2.show();

    }
}
