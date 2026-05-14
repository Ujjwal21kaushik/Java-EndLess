package linkedList;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}
public class linkmain {
        static Node head;
        static {
            Node a  = new Node(10);
            Node b  = new Node(20);
            Node c  = new Node(30);
            Node d  = new Node(40);
            Node e  = new Node(50);
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            head = a; 
    }
}
