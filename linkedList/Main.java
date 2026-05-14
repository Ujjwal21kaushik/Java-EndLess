package linkedList;

import java.util.*;

class Node {
    int val;
    Node next;
 
    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Main {

    static Node head = null;

    static void insert(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    static boolean detectCycle(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    static void display(Node head){
        if(head==null) return;
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp =temp.next;
        }
    }

    static Node reverse(Node head){
        Node p = null;
        Node c =head;
        while(c!=null){
            Node f = c.next;
            c.next = p;
            p=c;
            c=f;
        }
        return p;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int val = sc.nextInt();
            insert(val);
        }
        display(head);
        System.out.println();
        // if(detectCycle(head)){
        //     System.out.println("Cycle detected");
        // }else{
        //     System.out.println("No cycle");
        // }
        
        display(reverse(head));
       
    }
}