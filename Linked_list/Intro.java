//package Linked_list;

public class Intro {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node Head;
    public static Node Tail;
    public static int size;

    public void addFirst(int data) {
        //step 1: create ne node
        Node newNode = new Node(data);
        size++;

        if (Head == null) {
            Head = Tail = newNode;
            return;

        }
        //step 2: newNode's next=>head
        newNode.next = Head;
        //step 3:Assine newNode as head
        Head = newNode;
    }

    public void addLast(int data) {
        //step 1: create new Node
        Node newNode = new Node(data);
        size++;
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }
        //step 2:Link assign old node's tail to newNode
        Tail.next = newNode;

        //step 3: assign newNode to tail;
        Tail = newNode;
    }

    public void Show() {

        Node temp = Head;
        if (Head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int indx, int data) {
        if (indx == 0) {
            addFirst(data);
            return;
        }
        //step 1:create new node
        Node newNode = new Node(data);
        size++;
        Node temp = Head;
        int i = 0;
        while (i < indx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {

        if (size == 0) {
            System.out.println("LL is empty");

            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = Head.data;
            Head = Tail = null;
            size = 0;
            return val;
        }
        int val = Head.data;
        Head = Head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = Head.data;
            Head = Tail = null;
            size = 0;
            return val;
        }

        Node prev = Head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        //prev=tail-1
        int val = prev.next.data;
        prev.next = null;
        Tail = prev;
        size--;
        return val;
    }

    public void reverse() {
        Node prev = null;
        Node curr = Tail = Head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Head = prev;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        Intro ll = new Intro();
        ll.Show();
        ll.addFirst(2);
        ll.Show();
        ll.addFirst(1);
        ll.Show();
        ll.addLast(4);
        ll.Show();
        ll.addLast(5);
        ll.Show();
        ll.add(2, 3);
        ll.Show();
        System.out.println("Size: " + size);
        System.out.println("Removed Element: " + ll.removeFirst());
        ll.Show();
        System.out.println("Size: " + size);
        System.out.println("Removed Element: " + ll.removeLast());
        ll.Show();
        System.out.println("Size: " + size);
        ll.reverse();
        ll.Show();
        System.out.println("Size: " + size);

    }

}
