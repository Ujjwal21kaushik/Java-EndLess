package linkedList;


class WithoutTailNode {
    int val;
    WithoutTailNode next;

    WithoutTailNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class WithoutTailLinkedList {
    WithoutTailNode head;

    // Display
    void display() {
        WithoutTailNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Add at start
    void addFirst(int val) {
        WithoutTailNode newNode = new WithoutTailNode(val);
        newNode.next = head;
        head = newNode;
    }

    // Add at end (NO tail used)
    void addLast(int val) {
        WithoutTailNode newNode = new WithoutTailNode(val);

        if (head == null) {
            head = newNode;
            return;
        }

        WithoutTailNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Get node at index (0-based)
    WithoutTailNode getNode(int idx) {
        WithoutTailNode temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // Insert at index
    void insertAtIndex(int val, int idx) {
        if (idx == 0) {
            addFirst(val);
            return;
        }

        WithoutTailNode prev = getNode(idx - 1);
        WithoutTailNode newNode = new WithoutTailNode(val);

        newNode.next = prev.next;
        prev.next = newNode;
    }
    // Reverse
    WithoutTailNode reverse() {
        WithoutTailNode prev = null;
        WithoutTailNode curr = head;

        while (curr != null) {
            WithoutTailNode next = curr.next; // store next
            curr.next = prev;      // reverse link
            prev = curr;           // move prev
            curr = next;           // move curr
        }

        return prev; // new head
    }

    // reverse using recursion
    WithoutTailNode reverseRec(WithoutTailNode head) {
        if (head == null || head.next == null) return head;

        WithoutTailNode newHead = reverseRec(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }


    // Delete head
    void deleteFirst() {
        if (head == null) return;
        head = head.next;
    }

    // Delete last (NO tail)
    void deleteLast() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }

        WithoutTailNode temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    // Delete at index
    void deleteAtIndex(int idx) {
        if (idx == 0) {
            deleteFirst();
            return;
        }

        WithoutTailNode temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
    }
}

public class withOutTail {
    public static void main(String[] args) {
        WithoutTailLinkedList list = new WithoutTailLinkedList();

        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        
        list.display();

    }
}
 

