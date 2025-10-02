
public class LinkedList_2 {

    public class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node merge(Node head1, Node head2) {
        Node merge_ll = new Node(-1);
        Node temp = merge_ll;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                temp = temp.next;
                head1 = head1.next;
            } else {
                temp.next = head2;
                temp = temp.next;
                head2 = head2.next;
            }

        }
        while (head1 != null) {
            temp.next = head1;
            temp = temp.next;
            head1 = head1.next;
        }
        while (head2 != null) {
            temp.next = head2;
            temp = temp.next;
            head2 = head2.next;
        }
        return merge_ll.next;
    }

    public Node Merge_Sort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        //find mid
        Node midNode = findMid(head);
        //divede into left and right
        Node rightHead = midNode.next;
        midNode.next = null;
        Node newLeft = Merge_Sort(head);
        Node newRight = Merge_Sort(rightHead);

        //merge
        return merge(newLeft, newRight);

    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void addLast(int data) {
        Node newNode = new Node(data);  // create a new node
        if (head == null) {             // case: empty list
            head = tail = newNode;      // both head & tail point to newNode
            return;
        }
        tail.next = newNode;            // link last node to newNode
        tail = newNode;                 // move tail to newNode
    }

    public void show() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public boolean palindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: find mid
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // Step 2: reverse second half
        Node prev = null;
        Node curr = mid.next;
        mid.next = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: compare
        Node left = head;
        Node right = prev;
        boolean isPalindrome = true;
        while (right != null) {
            if (left.data != right.data) {
                isPalindrome = false;
                break;
            }
            left = left.next;
            right = right.next;
        }

        // Step 4: restore the list (reverse second half back and reattach)
        curr = prev;
        prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        mid.next = prev;

        return isPalindrome;
    }

    public void zigZag() {
        if (head == null || head.next == null) {
            return;
        }

        // Step 1: find mid
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // Step 2: reverse second half
        Node prev = null;
        Node curr = mid.next;
        mid.next = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: merge alternately
        Node left = head;
        Node right = prev;
        while (right != null) {
            Node nextL = left.next;
            Node nextR = right.next;

            left.next = right;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        // ll.Merge_Sort(head);
        LinkedList_2 l1 = new LinkedList_2();
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(5);
        l1.addLast(6);
        l1.show();
        // // l1.head = l1.Merge_Sort(head);

        System.out.println("ZigZag:");
        l1.zigZag();
        l1.show();
        System.out.println("" + l1.palindrome());
        l1.show();
    }
}
