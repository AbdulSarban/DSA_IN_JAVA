
public class dubbly_LL {

    public class Node {

        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        //step 1: create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        //step 2: manage link
        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    public void addLast(int data) {
        //step 1: create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        //step 2:manage link
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

    }

    public void show() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst() {
        if (head == null) {
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        Node temp = head.next;
        head.next = null;
        temp.prev = null;
        head = temp;
        size--;
        return val;

    }

    public int removeLast() {
        if (head == null) {
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = tail.data;
        Node temp = tail.prev;
        tail.prev = null;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        dubbly_LL LL = new dubbly_LL();
        // LL.addFirst(3);
        // LL.addFirst(2);
        LL.addFirst(1);
        LL.addLast(2);
        LL.addLast(3);

        LL.show();
        System.out.println("Size: " + size);
        System.out.println("Removed Element: " + LL.removeFirst());
        LL.show();
        System.out.println("Size: " + size);
        System.out.println("Removed Element: " + LL.removeLast());
        LL.show();
        System.out.println("Size: " + size);
        System.out.println("Removed Element: " + LL.removeLast());
        LL.show();
        System.out.println("Size: " + size);
        LL.addFirst(2);
        LL.show();
        System.out.println("Size: " + size);
        LL.addFirst(1);
        LL.addLast(3);
        LL.addLast(4);
        LL.show();
        System.out.println("Size: " + size);
        LL.reverse();
        LL.show();

    }
}
