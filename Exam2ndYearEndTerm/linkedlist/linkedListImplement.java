package Exam2ndYearEndTerm.linkedlist;

class Node{
    int val;
    Node next;
    
    Node(int val){
        this.val = val;
        this.next = null;
    }
}

class LinkedList{
    Node head;

    void display(){
        if(head==null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void addFirst(int val){
        // **************Write Below this***************

        // **************Write Above this***************
    }

    void addLast(int val){
        // **************Write Below this***************

      
        // **************Write Above this***************
    }
    
    void deleteLast(){
        // **************Write Below this***************

        // **************Write Above this***************
    }

    void deleteFirst(){
        // **************Write Below this***************

        // **************Write Above this***************
    }

    void insertAtk(int val){
        // **************Write Below this***************
        
        // **************Write Above this***************
    }

    void cycle(Node head){
        // **************Write Below this***************

        // **************Write Above this***************
    }

    void middle(Node head){
        // **************Write Below this***************

        // **************Write Above this***************
    }

    void reverse(int val){
        // **************Write Below this***************

        // **************Write Above this***************
    }



}


public class linkedListImplement {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addLast(30);
        list.addLast(30);

        list.display();
    }
}
