package linkedList;

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
    Node tail;
    int size;
    
    void display(Node head){
        if(head==null) return;
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }

    }

        void addLast(int val){
            Node temp = new Node(val);
            if(head == null){
                head = tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
    
    void addStart(int val){
        Node new_val = new Node(val); 
        Node temp = head;
        if(head == null) head =tail = new_val;
        else{
            new_val.next = temp;
            head = new_val;
        }
        
        size++;
       
    }

    Node AtAnyIndex(int idx){
        Node temp = head;
        while(idx >1){
            temp = temp.next;
            idx--;
        }
        System.out.println(temp.val);
        return temp;
    } 

    void deleteAtHead(){
        if(head==null) return;
        Node temp = head.next;
        head = temp;
        size--;
    }
    
    void deleteAtTail(){
        if(head==null) return;
        if(head.next == null){
            head = tail = null;
            size--;
            return;
        }
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    } 

    void insertAtAnyIndex(int val , int idx){
        Node temp = new Node(val);
        if(idx==0){
            addStart(val);
        }
        else if(idx == size){
            addLast(val);
        }
        else{
            Node prev = AtAnyIndex(idx-1);
            Node forwd = prev.next; 
            prev.next = temp;
            temp.next = forwd;
            size++;
        }
    }
    
    void deleteAtAnyIndex(int idx){
        if(idx==1){
            deleteAtHead();
        }
        else if(idx == size){
            deleteAtTail();
        }
        else{
            // Node prev = AtAnyIndex(idx -1);
            // Node forwd = prev.next.next;
            // prev.next = forwd;
            Node temp = head;
            while(idx >2){
                temp = temp.next;
                idx--;
            }
            temp.next = temp.next.next;
            size--;
        }
    }   

     // deleteatlastAtAnyIndex
    void deletelast(Node head){

        if(head==null) return;
        if(head.next!=null){
            head= null;
        }
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next =null;
    }

    void deletestart(Node head){
        if(head == null) return;
        Node temp = head.next;
        head =temp;

    }

}

public class linkedlistdatastructure {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        // System.out.println("Initial list:");
        // list.display(list.head);

        list.addStart(5);
        list.addStart(50);
        // System.out.println("\nAfter adding 5 at start:");
        list.display(list.head);
        // System.out.println("\nElement at index 3:");
        // list.AtAnyIndex(3);

        // list.deleteAtHead();
        // System.out.println("\nAfter deleting head:");
        // list.display(list.head);

        // list.deleteAtTail();
        // System.out.println("\nAfter deleting tail:");
        // list.display(list.head);

        // list.addLast(100);
        // System.out.println("\nAfter adding 100 at last:");
        // list.display(list.head);

        // list.insertAtAnyIndex(100, 3);
        // System.out.println("\nAfter inserting 100 at index 3:");
        // list.display(list.head);

        // list.deleteAtAnyIndex(4);
        // System.out.println("\nAfter deleting element at index 4:");
        // list.display(list.head);
        // System.out.println(list.size);
    }

}
