
public class Detect_Loop {

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

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void addLast(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;

    }

    public void show(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public boolean isLoop() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }

        }
        return false;
    }

    public void removeLoop() {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        //step 1: detect loop
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        //step 2:find match point
        if (cycle == false) {
            return;
        }
        slow = head;
        Node prev = null;
        //corner case: match point at head
        if (slow == fast) {
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null;
            return;
        }
        while (slow != fast) {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }
        prev.next = null;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        Detect_Loop ll = new Detect_Loop();
        ll.addFirst(1);
        ll.show(head);
        ll.addLast(head, 2);
        ll.show(head);
        ll.addLast(head, 3);
        ll.show(head);
        System.out.println("" + ll.isLoop());
        ll.tail.next = ll.head;
        //ll.show(head); goes into infinite loop;
        System.out.println("" + ll.isLoop());
        head = new Node(10);
        Node temp = new Node(5);
        // head.next = temp;
        head.next = new Node(20);
        head.next.next = new Node(30);
        ll.show(head);
        System.out.println("" + ll.isLoop());
        head.next.next.next = head;
        System.out.println("" + ll.isLoop());
        ll.removeLoop();

        ll.show(head);
        System.out.println("" + ll.isLoop());

    }
}
